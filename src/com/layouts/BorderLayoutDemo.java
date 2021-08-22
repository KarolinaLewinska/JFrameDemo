package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class BorderLayoutDemo {

    JFrame frame = new JFrame("Border layout demo");
    JButton btnNorth = new JButton("NORTH");
    JButton btnSouth = new JButton("SOUTH");
    JButton btnCenter = new JButton("CENTER");
    JButton btnWest = new JButton("WEST");
    JButton btnEast = new JButton("EAST");

    public BorderLayoutDemo() {
        frame.setLayout(new BorderLayout());
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnCenter, BorderLayout.CENTER);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnEast, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BorderLayoutDemo::new);
    }
}
