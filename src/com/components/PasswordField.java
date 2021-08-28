package com.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import java.util.Arrays;

public class PasswordField {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPasswordField passwordField = new JPasswordField(20);
    JButton button = new JButton("Check password");

    public PasswordField() {
        button.addActionListener(e -> {
            char[] userInput = passwordField.getPassword();
            if (checkIfPasswordIsCorrect(userInput)) {
                JOptionPane.showMessageDialog(null, "Password is correct!");
            } else {
                JOptionPane.showMessageDialog(null, "Password is incorrect!");
            }
        });
        passwordField.setEchoChar('*');
        panel.add(passwordField);
        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private boolean checkIfPasswordIsCorrect(char[] userPassword) {
        boolean isCorrect;
        char[] correctPassword = {'1', '2', '3'};

        if (userPassword.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(userPassword, correctPassword);
        }
        Arrays.fill(correctPassword, '0');
        return isCorrect;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(PasswordField::new);
    }
}
