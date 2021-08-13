package pos.admin.sales.first;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S1Frame extends JFrame implements ActionListener{
	//------------��������---------------
	Calendar cal; //�ɸ���
	int year, month, date;
	JPanel pane = new JPanel();
	
		//���� ��ư �߰�
		JButton btn1 = new JButton("��");  //������ư
		JButton btn2 = new JButton("��"); //������ư
		
		//���� ���߰�
		JLabel yearlb = new JLabel("��");
		JLabel monthlb = new JLabel("��");
		
		//��� �߰�
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JComboBox<Integer> monthCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();
		
		//�г��߰�
		JPanel pane2 = new JPanel(new BorderLayout());
			JPanel title = new JPanel(new GridLayout(1, 7));
				String titleStr[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
			JPanel datePane = new JPanel(new GridLayout(0, 7));

	//ȭ�������
	public S1Frame() {
		//------�⵵ �� ���ϱ�------------
		cal = Calendar.getInstance(); //���糯¥
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);
		
		//��
		for(int i=year-100; i<=year+50; i++){
			yearModel.addElement(i);
		}
		
		yearCombo.setModel(yearModel);
		yearCombo.setSelectedItem(year);
		
		//��
		for(int i=1; i<=12; i++) {
			monthModel.addElement(i);
		}
		monthCombo.setModel(monthModel);
		monthCombo.setSelectedItem(month);
		
		//��ȭ���������
		for(int i=0; i<titleStr.length; i++){
			JLabel lbl = new JLabel(titleStr[i], JLabel.CENTER);
			if(i == 0){
				lbl.setForeground(Color.red);
			}else if(i == 6){
				lbl.setForeground(Color.blue);
			}
			title.add(lbl);
		}
		//��¥ ���
		day(year, month);
		
		//----------------------------
		setTitle("ī����");
		pane.add(btn1);
		pane.add(yearCombo);
		pane.add(yearlb);
		pane.add(monthCombo);
		pane.add(monthlb);
		pane.add(btn2);
		pane.setBackground(Color.CYAN);
		add(BorderLayout.NORTH, pane);
		pane2.add(title,"North");
		pane2.add(datePane);
		add(BorderLayout.CENTER, pane2);
				
		//���� ��ɾ�
        setVisible(true);
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //----------��ɱ���----------
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        yearCombo.addActionListener(this);
        monthCombo.addActionListener(this);
	}

	//��ɱ���
	public void actionPerformed(ActionEvent e) {
		Object eventObj = e.getSource();
		if(eventObj instanceof JComboBox) {
			datePane.setVisible(false);	//�������� �г��� ��Ų��.
			datePane.removeAll();	//�� �����
			day((Integer)yearCombo.getSelectedItem(), (Integer)monthCombo.getSelectedItem());
			datePane.setVisible(true);	//�г� �����
		}else if(eventObj instanceof JButton) {
			JButton eventBtn = (JButton) eventObj;
			int yy = (Integer)yearCombo.getSelectedItem();
			int mm = (Integer)monthCombo.getSelectedItem();
			if(eventBtn.equals(btn1)){	//����
				if(mm==1){
					yy--; mm=12;
				}else{
					mm--;
				}				
			}else if(eventBtn.equals(btn2)){	//������
				if(mm==12){
					yy++; mm=1;
				}else{
					mm++;
				}
			}
			yearCombo.setSelectedItem(yy);
			monthCombo.setSelectedItem(mm);
		}	
	}
	
	//��¥���
	public void day(int year, int month) {
		Calendar date = Calendar.getInstance();//���ó�¥ + �ð�
		date.set(year, month-1, 1);
		int week = date.get(Calendar.DAY_OF_WEEK);
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		//�������
		for(int space=1; space<week; space++) {
			datePane.add(new Dp(new JButton(), new JLabel("\t")));
		}
		
		//��¥ ���
		for (int day = 1; day <= lastDay; day++) {
			JLabel lbl = new JLabel(String.valueOf(day), JLabel.CENTER);
			cal.set(year, month-1, day);
			int Week = cal.get(Calendar.DAY_OF_WEEK);
			if(Week==1){
				lbl.setForeground(Color.red);				
			}else if(Week==7){
				lbl.setForeground(Color.BLUE);
			}
			datePane.add(new Dp(new JButton(), lbl));
		}
	}
	//����޼ҵ�
	public static void main(String[] args) {
		new S1Frame();	
	}
}

class Dp extends JPanel{
	JButton btn;
	JLabel l;
	public Dp(JButton btn, JLabel l) {
		setLayout(new GridLayout(0,1));
		this.btn = btn;
		btn.setBorder(null);
		btn.setBackground(Color.white);
		this.l = l;
		add(l);
		add(btn);
		btn.addActionListener(new S2BtnAct(l.getText()));
	}
}
