package products.view.pay;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class At3Label4 extends JLabel{

    public At3Label4() {
        setBounds(0, 0, 684, 200);
        setImageSize();
    }

    private void setImageSize() {
    	// ��� �̹����κ�(��ǰ�� �´� �̹����� ������ָ�ɵ�)
        ImageIcon icon = new ImageIcon("./image/At3Page/poster.jpg");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        this.setIcon(newImc);
    }

}