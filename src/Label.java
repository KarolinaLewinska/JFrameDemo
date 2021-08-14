import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Label {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel demo");
        JLabel label = new JLabel();
        label.setText("Hello everyone!");
        label.setFont(new Font("Consolas", Font.PLAIN, 24));
        label.setIcon(new ImageIcon("C:/Users/lewin/Desktop/beach.jpg"));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
