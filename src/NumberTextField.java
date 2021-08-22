import com.numbers.JNumberTextField;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class NumberTextField {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JNumberTextField numberTextField = new JNumberTextField();
            numberTextField.setColumns(15);
            numberTextField.setFormat(JNumberTextField.DECIMAL);
            numberTextField.setMaxLength(7);
            numberTextField.setPrecision(4);
            numberTextField.setAllowNegative(true);

            JFrame frame = new JFrame("Number Field demo");
            frame.add(numberTextField);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        });

    }
}
