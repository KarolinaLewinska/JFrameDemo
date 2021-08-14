import javax.swing.*;

public class SplitPane extends JFrame {
    JLabel leftLabel = new JLabel();
    JLabel rightLabel = new JLabel();

    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(leftLabel), new JScrollPane(rightLabel));

    public SplitPane() {
        leftLabel.setIcon(new ImageIcon("C:/Users/lewin/Desktop/beach.jpg"));
        rightLabel.setIcon(new ImageIcon("C:/Users/lewin/Desktop/summer.jpg"));
        add(splitPane);
    }

    public static void main(String[] args) {
        SplitPane sp = new SplitPane();
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(1024, 600);
        sp.setVisible(true );
    }
}
