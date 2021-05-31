package com.glinkaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RGBPanel extends JPanel implements ActionListener {
    JLabel randomRed;
    JLabel randomGreen;
    JLabel randomBlue;
    JButton buttonZastosuj;
    JButton buttonLosuj;
    MainJPanel mainJPanel;
    Color color;
//    int[] rgb;

    public RGBPanel(MyJFrame jFrame) {
        super();
        mainJPanel = jFrame.getMainJPanel();
        setOpaque(true);
        setPreferredSize(new Dimension(400, 400));
        JLabel red = new JLabel("red: ");
        red.setOpaque(true);
        red.setBackground(Color.RED);
        JLabel green = new JLabel("green: ");
        green.setOpaque(true);
        green.setBackground(Color.GREEN);
        JLabel blue = new JLabel("blue: ");
        blue.setOpaque(true);
        blue.setBackground(Color.BLUE);
        this.randomRed = new JLabel("0");
        this.randomGreen = new JLabel("0");
        this.randomBlue = new JLabel("0");
        randomRed.setOpaque(true);
        randomBlue.setOpaque(true);
        randomGreen.setOpaque(true);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3,2));
        inputPanel.add(red);
        inputPanel.add(randomRed);
        inputPanel.add(green);
        inputPanel.add(randomGreen);
        inputPanel.add(blue);
        inputPanel.add(randomBlue);
        this.buttonLosuj =new JButton("Losuj");
        buttonLosuj.addActionListener(this);
        this.add(inputPanel);
        this.add(buttonLosuj);

        this.buttonZastosuj = new JButton("Zastosuj");
        buttonZastosuj.setEnabled(false);
        this.add(buttonZastosuj);

//        this.buttonZastosuj = new ButtonZastosuj("Zastosuj", this);
//        buttonZastosuj.setEnabled(false);
//        this.add(buttonZastosuj);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Random random = new Random();
        if(source == buttonLosuj) {
            int r = random.nextInt(256);
            randomRed.setText(String.valueOf(r));
            int g = random.nextInt(256);
            randomGreen.setText(String.valueOf(g));
            int b = random.nextInt(256);
            randomBlue.setText(String.valueOf(b));
//        this.setBackground(new Color(r, g, b));
            color = new Color(r, g, b);
            buttonZastosuj.setEnabled(true);
//            buttonZastosuj.setRgb(color);
        }
        if(source == buttonZastosuj){
            mainJPanel.setKolor(color);
        }
//        rgb = new int[]{r, g, b};
//        randomRed = new JLabel(String.valueOf(rgb[0]));
//        randomGreen = new JLabel(String.valueOf(rgb[1]));
//        randomBlue = new JLabel(String.valueOf(rgb[2]));
    }

//    private int[] losuj(){
//        Random random = new Random();
//        int[] rgb = new int[3];
//        rgb[0] = random.nextInt(256);
//        rgb[1] = random.nextInt(256);
//        rgb[2] = random.nextInt(256);
//        return rgb;
//    }
//    public int[] convert(){
//        int[] rgb = new int[3];
//        rgb[0] = Integer.parseInt(randomRed.getText());
//        rgb[1] = Integer.parseInt(randomGreen.getText());
//        rgb[2] = Integer.parseInt(randomBlue.getText());
//        return rgb;
//    }
}
