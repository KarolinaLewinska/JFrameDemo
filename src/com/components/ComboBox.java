package com.components;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.event.ItemEvent;

public class ComboBox {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    JComboBox<String> comboBox = new JComboBox<>();
    JComboBox<ImageIcon> iconsComboBox = new JComboBox<>();
    JTextField textField = new JTextField(15);
    JButton btnAdd = new JButton("Add");
    JButton btnRemove = new JButton("Remove");
    String valueToRemove;

    public ComboBox() {
        comboBox.setModel(model);

        comboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
               valueToRemove = model.getSelectedItem().toString();
            }
        });
        iconsComboBox.addItem(new ImageIcon(this.getClass().getResource("..\\icons\\add.png")));
        iconsComboBox.addItem(new ImageIcon(this.getClass().getResource("..\\icons\\cancel.png")));
        iconsComboBox.addItem(new ImageIcon(this.getClass().getResource("..\\icons\\refresh.png")));
        iconsComboBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                ImageIcon icon = (ImageIcon) e.getItem();
                label.setIcon(icon);
            }
        });

        btnAdd.addActionListener(e -> {
            model.addElement(textField.getText());
            textField.setText(null);
        });

        btnRemove.addActionListener(e -> model.removeElement(valueToRemove));
        panel.add(label);
        panel.add(iconsComboBox);
        panel.add(comboBox);
        panel.add(textField);
        panel.add(btnAdd);
        panel.add(btnRemove);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComboBox::new);
    }
}
