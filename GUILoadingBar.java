package com.company;

import javax.swing.*;

public class GUILoadingBar extends JFrame{
    private JProgressBar progressBar1;
    private JPanel panel3;
    private JLabel counter;

    public GUILoadingBar(){
        add(panel3);
        setSize(600, 600);
        setTitle("Bony's Make Up Shop");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<=100; i++){
                    progressBar1.setValue(i);
                    try {
                        Thread.sleep(18);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Makeup_Store y = new Makeup_Store();
                y.setVisible(true);
                dispose();
            }
        });
        t.start();
    }
    /* @Override
    public void run(){
        for (int i = 0; i<=100; i++){
            try {
                Thread.sleep(15);
            } catch (Exception e) {
                e.printStackTrace();
            }
            counter.setText(i+"%");
            progressBar1.setValue(i);
        }
        Makeup_Store y = new Makeup_Store();
        y.setVisible(true);
        dispose();
    } */

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GUILoadingBar().panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }
}
