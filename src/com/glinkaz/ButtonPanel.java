package com.glinkaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class ButtonPanel extends JButton implements ActionListener {
    private RGBPanel rgbPanel;
    public ButtonPanel(RGBPanel rgbPanel) {
        this.rgbPanel = rgbPanel;
    }


    public int[] losuj(){
        Random random = new Random();
        int[] rgb = new int[3];
        rgb[0] = random.nextInt(256);
        rgb[1] = random.nextInt(256);
        rgb[2] = random.nextInt(256);
        return rgb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
