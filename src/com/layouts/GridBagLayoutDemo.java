package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class GridBagLayoutDemo {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("One");
    JButton btn2 = new JButton("Two");
    JButton btn3 = new JButton("Three");

    public GridBagLayoutDemo() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new Insets(5, 5, 5,5); //gaps for all buttons

        gridBagConstraints.gridx = 0; //column of btn1
        gridBagConstraints.gridy = 0; //row of btn1
        panel.add(btn1, gridBagConstraints);

        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panel.add(btn2, gridBagConstraints);

        gridBagConstraints.gridwidth = 2; //width as 2 columns
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panel.add(btn3, gridBagConstraints);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GridBagLayoutDemo::new);
    }
}
