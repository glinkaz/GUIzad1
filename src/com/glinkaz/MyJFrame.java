package com.glinkaz;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {
    RGBPanel rgbPanel;
    MainJPanel mainJPanel;
    public MyJFrame() throws HeadlessException {
        super("Jednoreki bandyta");
        setLayout(new GridLayout());
        this.rgbPanel = new RGBPanel(this);
        add(rgbPanel);
        this.mainJPanel = new MainJPanel();
        add(mainJPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public MainJPanel getMainJPanel() {
        return mainJPanel;
    }


}
