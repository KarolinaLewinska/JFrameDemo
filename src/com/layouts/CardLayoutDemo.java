package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    JFrame frame = new JFrame("CardLayout demo");
    JPanel panelContainer = new JPanel();
    JPanel panelFirst = new JPanel();
    JPanel panelSecond = new JPanel();
    JButton btn1 = new JButton("Switch to second panel/workspace");
    JButton btn2 = new JButton("Switch to first panel/workspace");
    CardLayout cardLayout = new CardLayout();

    public CardLayoutDemo() {
        panelContainer.setLayout(cardLayout);
        panelFirst.add(btn1);
        panelSecond.add(btn2);
        panelFirst.setBackground(Color.BLUE);
        panelSecond.setBackground(Color.GREEN);

        panelContainer.add(panelFirst, "1");
        panelContainer.add(panelSecond, "2");
        cardLayout.show(panelContainer, "1");

        btn1.addActionListener(e -> cardLayout.show(panelContainer, "2"));
        btn2.addActionListener(e -> cardLayout.show(panelContainer, "1"));

        frame.add(panelContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CardLayoutDemo::new);
    }
}
