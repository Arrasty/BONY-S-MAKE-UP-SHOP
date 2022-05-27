package com.company;

import javax.swing.*;

public class SuperClass {
    public double Foundation;
    public double Mascara;
    public double Lipstick;
    public double FacePallete;
    public double EyebrowPencil;

    public double Serum;
    public double Toner;
    public double Essence;
    public double EyeCream;
    public double SheetMask;

    public double TotalMS;
    public double Makeup;
    public double Skincare;
    public double Totalbelanja;

    public double GetAmount(){
        Makeup = Foundation + Mascara + Lipstick + FacePallete + EyebrowPencil;
        Skincare = Serum + Toner + Essence + EyeCream + SheetMask;
        TotalMS = Makeup + Skincare;
        Totalbelanja = TotalMS;
        return Totalbelanja;
    }


    // Diskonn (liat di yt dulu !!)
    public double diskon (double totalbayar){
        double cDiskon;
     if ((totalbayar >= 200.000) && (totalbayar <= 499.000)){
         cDiskon = totalbayar * 0.05; // Diskon 5%
     }
     else if ( (totalbayar >= 500.000) && (totalbayar <= 799.000)){
         cDiskon = totalbayar * 0.10; // Diskon 10%
        }
     else if ((totalbayar >= 800.000)){
         cDiskon = totalbayar * 0.25; //Diskon 25%
        }
     else {
         cDiskon = totalbayar;
     }
     return  cDiskon;
    }


    // Button Close
    private JFrame frame;
    public void iExitSystem (){
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Apakah anda ingin keluar dari toko ini?", "Make Up Store", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
}

