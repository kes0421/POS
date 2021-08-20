package movie.peopleCheck_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import movie.seatChoice_ui.SeatChoice_1;
import movie.seatChoice_ui.SeatChoice_2;
import movie.seatChoice_ui.SeatChoice_3;
import movie.seatChoice_ui.SeatChoice_4;
import movie.seatChoice_ui.SeatChoice_5;
import movie.seatChoice_ui.SeatChoice_6;
import movie.selectmovie.SelectMovieMain;
import movie.view.MovieFrame1;

public class PeopleCheck extends PeopleCheck_frame {

	public static int adult_cnt;
	public static int child_cnt;
	public static int disable_cnt;
	public static int old_cnt;
	static JLabel people_cnt;
	static int pre_adult_btn_num;
	static int now_adult_btn_num;
	static int pre_child_btn_num;
	static int now_child_btn_num;
	static int pre_disable_btn_num;
	static int now_disable_btn_num;
	static int pre_old_btn_num;
	static int now_old_btn_num;
	static ArrayList<JButton> adult_btn = new ArrayList<>();
	static ArrayList<JButton> child_btn = new ArrayList<>();
	static ArrayList<JButton> disable_btn = new ArrayList<>();
	static ArrayList<JButton> old_btn = new ArrayList<>();
	public static PeopleCheck frame;
	public static int th_num_check;
	
	public static SeatChoice_1 seat1;
    public static SeatChoice_2 seat2;
    public static SeatChoice_3 seat3;
    public static SeatChoice_4 seat4;
    public static SeatChoice_5 seat5;
    public static SeatChoice_6 seat6;
    
	public static String time;
	public static int state;

	public PeopleCheck() {
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		people_cnt = new JLabel();
		JLabel adult = new JLabel();
		JLabel child = new JLabel();
		JLabel disable = new JLabel();
		JLabel old = new JLabel();
		JLabel line1 = new JLabel();
		JLabel line2 = new JLabel();
		JLabel line3 = new JLabel();
		JLabel label = new JLabel();

		ArrayList<JButton> btns1 = new ArrayList<>();
		ArrayList<JButton> btns2 = new ArrayList<>();
		ArrayList<JButton> btns3 = new ArrayList<>();
		ArrayList<JButton> btns4 = new ArrayList<>();

		for(int i = 0; i < 9 ;i++) {
			btns1.add(new JButton());
			btns2.add(new JButton());
			btns3.add(new JButton());
			btns4.add(new JButton());
		}

		int k = 60;

		for (int i = 0 ; i < 9; i++) {
			Adult_btn adult_btns = new Adult_btn(btns1, i);
			adult_btn.add(adult_btns);
			adult_btn.get(i).setBounds(150 + k * i, 160  , 50 ,50);
			add(adult_btn.get(i));

			Child_btn child_btns = new Child_btn(btns2, i);
			child_btn.add(child_btns);
			child_btn.get(i).setBounds(150 + k * i, 220  , 50 ,50);
			add(child_btn.get(i));

			Disable_btn disable_btns = new Disable_btn(btns3, i);
			disable_btn.add(disable_btns);
			disable_btn.get(i).setBounds(150 + k * i, 280  , 50 ,50);
			add(disable_btn.get(i));

			Old_btn old_btns = new Old_btn(btns4, i);
			old_btn.add(old_btns);
			old_btn.get(i).setBounds(150 + k * i, 340  , 50 ,50);
			add(old_btn.get(i));
		}

			for(int i = 1; i < btns1.size(); i++) {
				adult_btn.get(i).setBackground(new Color(0x404040));
				child_btn.get(i).setBackground(new Color(0x404040));
				disable_btn.get(i).setBackground(new Color(0x404040));
				old_btn.get(i).setBackground(new Color(0x404040));
			}
			adult_cnt = 0;
			child_cnt = 0;
			disable_cnt = 0;
			old_cnt = 0;
			pre_adult_btn_num = 0;
			now_adult_btn_num = 0;
			pre_child_btn_num = 0;
			now_child_btn_num = 0;
			pre_disable_btn_num = 0;
			now_disable_btn_num = 0;
			pre_old_btn_num = 0;
			now_old_btn_num = 0;

		adult_btn.get(0).setBackground(new Color(0xCC0066));
		child_btn.get(0).setBackground(new Color(0xCC0066));
		disable_btn.get(0).setBackground(new Color(0xCC0066));
		old_btn.get(0).setBackground(new Color(0xCC0066));

		text1.setBounds(0,10,700,50);
		text2.setBounds(0,50,700,50);
		people_cnt.setBounds(0,100,700,50);
		adult.setBounds(0,160,700,50);
		child.setBounds(0,220,700,50);
		disable.setBounds(0,280,700,50);
		old.setBounds(0,340,700,50);
		line1.setBounds(0,210,700,10);
		line2.setBounds(0,270,700,10);
		line3.setBounds(0,330,700,10);
		text1.setText("관람 인원수를 선택해주세요");
		text1.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
		text2.setText("인원수 선택은 일반, 청소년을 더해 최대 8매까지 가능해요");
		text2.setFont(new Font("돋움", Font.PLAIN, 20));
		people_cnt.setText("총 "+ (adult_cnt + child_cnt + disable_cnt + old_cnt) + "명");
		people_cnt.setFont(new Font("돋움", Font.PLAIN, 30));
		text1.setHorizontalAlignment(JLabel.CENTER);
		text2.setHorizontalAlignment(JLabel.CENTER);
		people_cnt.setHorizontalAlignment(JLabel.CENTER);
		adult.setText("일반");
		child.setText("청소년");
		disable.setText("장애인");
		old.setText("경로우대");
		adult.setFont(new Font("돋움", Font.PLAIN, 30));
		child.setFont(new Font("돋움", Font.PLAIN, 30));
		disable.setFont(new Font("돋움", Font.PLAIN, 30));
		old.setFont(new Font("돋움", Font.PLAIN, 30));
		line1.setText("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		line2.setText("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		line3.setText("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		text1.setForeground(Color.white);
		text2.setForeground(Color.white);
		people_cnt.setForeground(Color.white);
		adult.setForeground(Color.white);
		child.setForeground(Color.white);
		disable.setForeground(Color.white);
		old.setForeground(Color.white);
		line1.setForeground(Color.white);
		line2.setForeground(Color.white);
		line3.setForeground(Color.white);

		JButton complete = new JButton("완료");
		complete.setBounds(250, 400, 200, 50);
		complete.setFont(new Font("돋움", Font.BOLD, 20));
		complete.setForeground(Color.white);
		complete.setBackground(new Color(0xFF3333));
		complete.setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
		complete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(state == 1) {
                    MovieFrame1.movieFrame.dispose();
                }

                else if(state == 2) {
                    SelectMovieMain.frame.dispose();
                }
				
				switch(th_num_check) {

				case 1:
					dispose();
					seat1 = new SeatChoice_1();
					seat1.setDefaultOptions();
					seat1.getContentPane().setBackground(new Color(0x202020));
					break;
				
				case 2:
					dispose();
					seat2 = new SeatChoice_2();
					seat2.setDefaultOptions();
					seat2.getContentPane().setBackground(new Color(0x202020));
					break;
				
				case 3:
					dispose();
					seat3 = new SeatChoice_3();
					seat3.setDefaultOptions();
					seat3.getContentPane().setBackground(new Color(0x202020));
					break;
				
				case 4:
					dispose();
					seat4 = new SeatChoice_4();
					seat4.setDefaultOptions();
					seat4.getContentPane().setBackground(new Color(0x202020));
					break;
				
				case 5:
					dispose();
					seat5 = new SeatChoice_5();
					seat5.setDefaultOptions();
					seat5.getContentPane().setBackground(new Color(0x202020));
					break;
				
				case 6:
					dispose();
					seat6 = new SeatChoice_6();
					seat6.setDefaultOptions();
					seat6.getContentPane().setBackground(new Color(0x202020));
					break;
				}
			}
		});
		add(complete);

		add(text1);
		add(text2);
		add(people_cnt);
		add(adult);
		add(child);
		add(disable);
		add(old);
		add(line1);
		add(line2);
		add(line3);
		add(label);
	}
//
//	public static void main(String[] args) {
//		frame = new PeopleCheck();
//		frame.getContentPane().setBackground(new Color(0x404040));
//		frame.setDefaultOptions();
//	}
}
