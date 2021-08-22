package com.components;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JFrame {
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();

    JLabel firstLabel = new JLabel("First!");
    JLabel secondLabel = new JLabel("Second!");

    JTabbedPane tabbedPane = new JTabbedPane();

    public TabbedPane() {
        firstPanel.add(firstLabel);
        secondPanel.add(secondLabel);

        tabbedPane.add("First panel", firstPanel);
        tabbedPane.add("Second panel", secondPanel);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        TabbedPane tp = new TabbedPane();
        tp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tp.setSize(600, 400);
        tp.setVisible(true);
    }
}
