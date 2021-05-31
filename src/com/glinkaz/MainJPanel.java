package com.glinkaz;

import javax.swing.*;
import java.awt.*;

public class MainJPanel extends JPanel {
    JLabel kolor;
    public MainJPanel() {
        super();
        this.setOpaque(true);
        kolor = new JLabel("Kolor");
        this.add(kolor);
    }

    public void setKolor(Color color){
        kolor.setForeground(color);
    }
}
