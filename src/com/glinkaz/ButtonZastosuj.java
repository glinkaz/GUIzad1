package com.glinkaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonZastosuj extends JButton implements ActionListener {
    private MainJPanel kolorPanel;
    private Color color;
    public ButtonZastosuj(String text, MainJPanel kolorPanel) {
        super(text);
        setOpaque(true);
        this.kolorPanel = kolorPanel;
//        this.rgb = rgb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        Color color = new Color(rgb[0], rgb[1], rgb[2]);
        kolorPanel.setKolor(color);
    }

    public void setRgb(Color color) {
        this.color = color;
    }
}
