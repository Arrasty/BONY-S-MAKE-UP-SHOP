package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Selamat_Datang extends javax.swing.JFrame{
    public JTextField textNama;
    public JTextField textAlamat;
    private JButton belanjaSekarangButton;
    private JLabel labelNama;
    private JLabel labelPassword;
    private JPanel panel2;
    private JPasswordField passwordField1;
    private JLabel counter;
    private JFrame k;


    public Selamat_Datang() {

        belanjaSekarangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textNama.getText().equals("Farahgesty") && passwordField1.getText().equals("121102")
                        || (textNama.getText().equals("Velsabrina")) && (passwordField1.getText().equals("141103"))
                        || (textNama.getText().equals("Retnokamila")) && (passwordField1.getText().equals("290303"))
                        || (textNama.getText().equals("Citrarani")) && (passwordField1.getText().equals("291102"))
                        || (textNama.getText().equals("Shintanur")) && (passwordField1.getText().equals("100403"))
                        || (textNama.getText().equals("Maritsa")) && (passwordField1.getText().equals("240903"))) {
                    GUILoadingBar frame2 = new GUILoadingBar();
                    frame2.setVisible(true);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(k,"Login gagal");
                }

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome to Bony's Make Up Shop");
        frame.setContentPane(new Selamat_Datang().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }

}
