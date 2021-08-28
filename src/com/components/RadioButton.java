package com.components;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class RadioButton {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JRadioButton rdbGreen = new JRadioButton("Green");
    JRadioButton rdbRed = new JRadioButton("Red");
    ButtonGroup btnGroup = new ButtonGroup();

    public RadioButton() {
        rdbGreen.addActionListener(e -> {
            if (rdbGreen.isSelected()) {
                panel.setBackground(Color.GREEN);
            }
            panel.repaint();
        });
        rdbRed.addActionListener(e -> {
            if (rdbRed.isSelected()) {
                panel.setBackground(Color.RED);
            }
            panel.repaint();
        });
        btnGroup.add(rdbGreen);
        btnGroup.add(rdbRed);
        panel.add(rdbGreen);
        panel.add(rdbRed);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RadioButton::new);
    }
}
