package movie.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import movie.model.Movies;
import movie.model.Timetables;
import movie.selectmovie.DBList;

public class SelectFastMovie {
   ArrayList<Movies> movies = new DBList().moviesList();
   ArrayList<Timetables> timeTables = new DBList().timeTablesList();

   public HashMap fastMovie() {
      SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd");
      SimpleDateFormat time = new SimpleDateFormat("HH:mm");

      Date today = null;
      Date dbDate = null;
      Date todayTime = null;
      Date dbTime = null;

      String tCode[] = new String[movies.size()];
      int check[] = new int[movies.size()];
      HashMap<String, Integer> fast = new HashMap<>();

      Calendar cal = Calendar.getInstance();
      String d = day.format(cal.getTime());

      try {
         String now = time.format(new Date());
         todayTime = time.parse(now);
         today = day.parse(d);
         int a = 10000000;
         for (int i = 0; i < movies.size(); i++) {
            for (int j = 0; j < timeTables.size(); j++) {
               String date = day.format(timeTables.get(j).getT_date());
               dbDate = day.parse(date);
               dbTime = time.parse(timeTables.get(j).getT_start());
               int timeCheck = (int) ((dbTime.getTime() - todayTime.getTime()) / 1000);

               if (today.equals(dbDate) && timeCheck >= 0 && 
                     timeTables.get(j).getM_code() == movies.get(i).getM_code()) {
                  if (timeCheck < a) {
                     a = timeCheck;
                     tCode[i] = timeTables.get(j).getT_code();
                     check[i] = timeCheck;
                  }                  
               }
            }
            a = 10000000;
            fast.put(tCode[i], check[i]);
         }
      } catch (ParseException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return fast;
   }

   public ArrayList threeMovies(HashMap fast) {
      ArrayList<String> movies = new ArrayList<>();
      ArrayList<String> threeMovie = new ArrayList<>();

      List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(fast.entrySet());         

      Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
         public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
            return obj1.getValue().compareTo(obj2.getValue());
         }
      });
      for(Entry<String, Integer> entry : list_entries) {
         int i=0;
         if(i<3) {
            movies.add(entry.getKey());
         }
         i++;
      }

      for(int i=0; i<movies.size(); i++) {
         if(movies.get(i)!=null) {
            threeMovie.add(movies.get(i));
         }
      }

      while(threeMovie.size()<3) {
         threeMovie.add(null);
      }

      return threeMovie;
   }
}