package com.components;

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
        java.net.URL iconURL = Label.class.getResource("..\\icons\\beach.jpg");
        label.setIcon(new ImageIcon(iconURL));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
