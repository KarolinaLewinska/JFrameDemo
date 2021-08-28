package com.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionPane {
    JFrame frame = new JFrame("JOptionPane demo");
    JPanel panel = new JPanel();
    JButton dialogBtn = new JButton("Call dialog");
    JButton inputDialogBtn = new JButton("Call input dialog");
    JButton confirmDialogBtn = new JButton("Call confirm dialog");
    JTextArea textArea = new JTextArea(10, 10);

    public OptionPane() {
        dialogBtn.addActionListener(e -> JOptionPane.showMessageDialog
                (null,new JScrollPane(textArea), "Message dialog", JOptionPane.PLAIN_MESSAGE));

        inputDialogBtn.addActionListener(e -> {
            String title = JOptionPane.showInputDialog(null, "Enter title for JFrame");
            frame.setTitle(title);
        });

        confirmDialogBtn.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to close a JFrame?",
                    "Select an option", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION)
                frame.dispose();
        });
        panel.add(dialogBtn);
        panel.add(inputDialogBtn);
        panel.add(confirmDialogBtn);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(OptionPane::new);
    }
}
