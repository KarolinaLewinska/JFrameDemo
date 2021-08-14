import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;

public class SplitPane extends JFrame {
    JLabel leftLabel = new JLabel();
    JLabel rightLabel = new JLabel();

    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftLabel), new JScrollPane(rightLabel));

    public SplitPane() {
        java.net.URL firstIconURL = Label.class.getResource("com/icons/beach.jpg");
        java.net.URL secondIconURL = Label.class.getResource("com/icons/summer.jpg");
        leftLabel.setIcon(new ImageIcon(firstIconURL));
        rightLabel.setIcon(new ImageIcon(secondIconURL));
        add(splitPane);
    }

    public static void main(String[] args) {
        SplitPane sp = new SplitPane();
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(1024, 600);
        sp.setVisible(true );
    }
}
