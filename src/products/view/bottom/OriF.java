package products.view.bottom;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;

public class OriF extends JFrame{

	public OriF() {
		
		setBounds(228, 200, 400, 460);
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(new Color(255,254,230));
		
		JLabel title = new JLabel("원산지 표시판");
		title.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));
		title.setBounds(147, 18, 109, 26);
		add(title);

		String[] columnNames = {"구분","원산지"};
		String[][] data = {
				{"팝콘","옥수수[미국산]"},
				{"나쵸","옥수수[미국산]"},
				{"츄러스","밀[미국산]"},
				{"핫도그 소시지","돼지고기[국내산]"},
				{"스파이시 소시지","고추[국내산]"},
				{"핫도그 빵","밀[미국산,캐나다산]"},
				{"오징어 몸통","오징어[칠레산]"},
				{"오징어 다리","오징어[국내산]"},
				{"순살치킨","닭고기[태국산]"},
				{"통찡어","오징어[원양]"},
				{"스트링치즈","치즈[미국산]"},
				{"프레즐","프레즐[미국산]"}
		};

		JTable table = new JTable(data, columnNames);
		table.setBorder(new CompoundBorder());
		table.setCellSelectionEnabled(true);
		table.setEnabled(true);
		table.setRowHeight(25);
		table.setShowGrid(true);
		table.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));

		// table 테두리에 lightGray색 넣어줌
		table.setGridColor(Color.lightGray);
		table.setBorder(BorderFactory.createLineBorder(table.getGridColor()));
		
		table.setBounds(38, 72, 330, 299);
		add(table);

		JLabel division = new JLabel("구분");
		division.setBounds(100, 44, 61, 16);
		add(division);

		JLabel origin = new JLabel("원산지");
		origin.setBounds(260, 44, 61, 16);
		add(origin);
	}
}
