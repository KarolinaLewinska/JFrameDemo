package com.event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class ButtonEvent {

    JFrame frame = new JFrame("com.components.Button event demo");
    JButton button = new JButton("Click me");

    public ButtonEvent() {
        button.addActionListener(e -> button.setBackground(Color.RED));
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonEvent::new);
    }
}
