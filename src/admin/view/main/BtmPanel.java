package admin.view.main;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import admin.view.detail.InsertFrame;
import pos.main.MainFrame;

public class BtmPanel extends JPanel{
	
	public BtmPanel(Frame frame) {
		setBounds(0, 625, 1000, 75);
		setBackground(new Color(160,255,154));
		setLayout(null);
		
		JButton homeBtn = new MakeImgBtn("./img/admin/Ȩ��ư_��.png",85,40);
		homeBtn.setBackground(new Color(160,255,154));
		homeBtn.setBounds(915, 0, 85, 40);
		add(homeBtn);
		
		homeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new MainFrame().setVisible(true);
			}
		});
		
		JButton enrollBtn = new JButton("��ǰ �߰�");
		enrollBtn.setBounds(0, 0, 105, 40);
		add(enrollBtn);
		
		enrollBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new InsertFrame();
			}
		});
	}
}
