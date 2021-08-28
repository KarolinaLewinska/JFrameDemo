package com.layouts;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class EmployeeForm {
    JFrame frame = new JFrame("Employee form");
    JPanel namePanel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JPanel descriptionPanel = new JPanel();
    JLabel lName = new JLabel("First Name: ");
    JTextField tfName = new JTextField(40);
    JLabel lSurname = new JLabel("Second Name:");
    JTextField tfSurname = new JTextField(40);
    JButton bCreate = new JButton("Create");
    JButton bDelete = new JButton("Delete");
    JLabel lDescription = new JLabel("Description");
    JTextArea taDescription = new JTextArea(10,40);

    public EmployeeForm() {
        namePanel.setLayout(new GridBagLayout());
        namePanel.setBorder(new EmptyBorder(10,5,5,5));

        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        buttonPanel.setBorder(new EmptyBorder(0,96,5,0));

        descriptionPanel.setBorder(new EmptyBorder(0,5,10,5));
        descriptionPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        namePanel.add(lName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        namePanel.add(tfName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        namePanel.add(lSurname, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        namePanel.add(tfSurname, gbc);

        buttonPanel.add(bCreate);
        buttonPanel.add(bDelete);

        gbc.gridx = 0;
        gbc.gridy = 3;
        lDescription.setBorder(new EmptyBorder(0,0,0,15));
        descriptionPanel.add(lDescription, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        descriptionPanel.add(taDescription, gbc);

        frame.add(namePanel, BorderLayout.NORTH);
        frame.add(buttonPanel,BorderLayout.CENTER);
        frame.add(descriptionPanel,BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeForm::new);
    }
}