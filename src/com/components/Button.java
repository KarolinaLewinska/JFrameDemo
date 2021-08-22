package com.components;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Font;

public class Button {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            JButton button = new JButton("Accept");
            frame.add(button);
            button.setFont(new Font("Serif", Font.PLAIN, 18));
            button.setEnabled(true);
            button.setIcon(new ImageIcon(Button.class.getResource("com/icons/accept.png")));

            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
