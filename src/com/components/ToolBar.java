package com.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class ToolBar {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField(15);
    JButton btnAdd = new JButton("Add");
    JButton btnDelete = new JButton("Delete");
    JToolBar toolBar = new JToolBar();

    public ToolBar() {
        toolBar.add(textField);
        toolBar.add(btnAdd);
        toolBar.addSeparator();
        toolBar.add(btnDelete);
        toolBar.setFloatable(false);
        frame.add(toolBar, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToolBar::new);
    }
}
