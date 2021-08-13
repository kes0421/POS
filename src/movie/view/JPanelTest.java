package movie.view;

import movie.selectmovie.CgvFrame2;
import movie.selectmovie.SelectMovieMain;

public class JPanelTest extends CgvFrame2 {
	public MovieFrame1 mf = null;
	public SelectMovieMain smm = null;
	
	public void change(String paneName) {
		if(paneName.equals("mf")) {
			getContentPane().removeAll();
			getContentPane().add(mf);
			revalidate();
			repaint();
		}else {
			getContentPane().removeAll();
			getContentPane().add(smm);
			revalidate();
			repaint();
		}
	}
	
	public static void main(String[] args) {
		JPanelTest win = new JPanelTest();
	
	}
}









