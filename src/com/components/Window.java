package com.components;

import javax.swing.JPanel;
import javax.swing.JWindow;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JWindow {
    JPanel panel = new JPanel();

    public Window() {
        panel.setBackground(Color.YELLOW);
        add(panel);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Window w = new Window();
        w.setSize(640, 480);
        w.setVisible(true);
    }
}
