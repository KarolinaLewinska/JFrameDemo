import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TextArea {
    JFrame frame = new JFrame("JTextArea demo");
    JTextArea textArea = new JTextArea("Enter text", 10, 30);
    JScrollPane scrollPane = new JScrollPane(textArea);

    public TextArea() {
        textArea.append(" to text area ");
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextArea::new);
    }
}
