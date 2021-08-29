package com.components;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;

public class Slider {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JSlider slider = new JSlider(JSlider.HORIZONTAL,0,255,0);

    public Slider() {
        label.setOpaque(true);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.addChangeListener(e -> {
            JSlider source = (JSlider) e.getSource();
            label.setBackground(new Color(0,0,source.getValue()));
        });
        frame.add(label, BorderLayout.CENTER);
        frame.add(slider, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Slider::new);
    }
}
