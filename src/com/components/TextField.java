package com.components;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Font;

public class    TextField {

    JFrame frame = new JFrame();
    JTextField textField = new JTextField("Hello from JTextField", 10);

    public TextField() {
        textField.setFont(new Font("Verdana", Font.PLAIN, 18));
        textField.setEditable(false);
        textField.setEnabled(false);
        textField.setText("This is a new text");
        String s = textField.getText();
        frame.setTitle(s);
        frame.add(textField);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextField::new);
    }
}
