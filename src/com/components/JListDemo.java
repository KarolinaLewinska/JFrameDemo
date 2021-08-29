package com.components;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import java.math.BigDecimal;

public class JListDemo {
    JFrame frame = new JFrame("Storage");
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();
    DefaultListModel<Product> model = new DefaultListModel<>();
    JList<Product> list = new JList<>();
    JLabel label = new JLabel();

    public JListDemo() {

        model.addElement(new Product("Apple", new BigDecimal("2.50"), "Polish apples"));
        model.addElement(new Product("Grapes", new BigDecimal("5.50"), "Spanish grapes"));

        list.setModel(model);
        list.getSelectionModel().addListSelectionListener(e -> {
            Product selectedProduct = list.getSelectedValue();
            label.setText("Name: " + selectedProduct.getName() + " | " + selectedProduct.getPrice().toPlainString()
                    + " | " + selectedProduct.getDescription());
        });

        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.setSize(500,200);
        frame.setLocationRelativeTo(null); //center frame
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JListDemo::new);
    }

    private static class Product {
        String name;
        BigDecimal price;
        String description;

        public Product(String name, BigDecimal price, String desc) {
            this.name = name;
            this.price = price;
            this.description = desc;
        }

        public String getName() {
            return name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
