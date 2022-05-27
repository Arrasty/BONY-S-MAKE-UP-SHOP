package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Makeup_Store extends javax.swing.JFrame {

    private Thread PROGRESS_THREAD;
    private JButton totalButton;
    private JButton receiptButton;
    private JButton resetButton;
    private JButton exitButton;
    private JTextArea textHasil;
    private JTextField textFoundation;
    private JTextField textMaskara;
    private JTextField textLipstick;
    private JTextField textFacePallete;
    private JTextField textPensilAlis;
    private JTextField textSerum;
    private JTextField textToner;
    private JTextField textEssence;
    private JTextField textEyeCream;
    private JTextField textSheetMask;
    private JTextField textTotalBelanja;
    private JTextField textTotalPesanan;
    private JTextField textPotonganHarga;
    private JComboBox comboBoxMetodePembayaran;
    private JLabel labelJudul;
    private JLabel labelMakeUp;
    private JLabel labelBayar;
    private JLabel labelSkincare;
    private JLabel labelFoundation;
    private JLabel labelMaskara;
    private JLabel labelLipstick;
    private JLabel labelFacePallete;
    private JLabel labelPensilAlis;
    private JLabel labelSerum;
    private JLabel labelToner;
    private JLabel labelEssence;
    private JLabel labelEyeCream;
    private JLabel labelSheetMask;
    private JLabel labelTotalPesanan;
    private JLabel labelPotonganHarga;
    private JLabel labelMetodePembayaran;
    private JTextField textTotalMakeUp;
    private JTextField textTotalSkincare;
    private JPanel panel;
    private JLabel labelTotalMakeUp;
    private JLabel labelTotalSkincare;
    private JComboBox comboBoxMerk;
    private JLabel labelMerk;
    private JTextField textHargaFoundation;
    private JTextField textHargaSerum;
    private JTextField textHargaMascara;
    private JTextField textHargaLipstick;
    private JTextField textHargaFacePallete;
    private JTextField textHargaEyebrowPencil;
    private JTextField textHargaToner;
    private JTextField textHargaEssence;
    private JTextField textHargaEyeCream;
    private JTextField textHargaSheetMask;
    private JLabel labelTotalBelanja;
    private JTextField textPembayaran;

    public Makeup_Store() {
        add(panel);
        setSize(600, 600);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Button Exit
                SubClass iExit = new SubClass();
                iExit.iExitSystem();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Button Reset
                textFoundation.setText("0");
                textMaskara.setText("0");
                textLipstick.setText("0");
                textFacePallete.setText("0");
                textPensilAlis.setText("0");
                textSerum.setText("0");
                textToner.setText("0");
                textEssence.setText("0");
                textEyeCream.setText("0");
                textSheetMask.setText("0");
                textTotalMakeUp.setText("0");
                textTotalSkincare.setText("0");
                textTotalBelanja.setText("0");
                textTotalPesanan.setText("0");
                textPotonganHarga.setText("0");
                textPembayaran.setText("0");
                comboBoxMerk.setSelectedItem("Select");
                comboBoxMetodePembayaran.setSelectedItem("Select");
                textPembayaran.setText(null);
                textHasil.setText(null);
            }
        });

        comboBoxMerk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pilihan Merk Make Up
                SubClass ItemCost = new SubClass();
                if (comboBoxMerk.getSelectedItem().equals("Select")) {
                    //ItemCost.fFoundation = 0;
                    textHargaFoundation.setText("Rp 0");
                    //ItemCost.fMascara = 0;
                    textHargaMascara.setText("Rp 0");
                    //ItemCost.fLipstick = 0;
                    textHargaLipstick.setText("Rp 0");
                    //ItemCost.fFacePallete = 0;
                    textHargaFacePallete.setText("Rp 0");
                    //ItemCost.fEyebrowPencil = 0;
                    textHargaEyebrowPencil.setText("Rp 0");
                    //ItemCost.fSerum = 0;
                    textHargaSerum.setText("Rp 0");
                    //ItemCost.fToner = 0;
                    textHargaToner.setText("Rp 0");
                    //ItemCost.fEssence = 0;
                    textHargaEssence.setText("Rp 0");
                    //ItemCost.fEyeCream = 0;
                    textHargaEyeCream.setText("Rp 0");
                    //ItemCost.fSheetMask = 0;
                    textHargaSheetMask.setText("Rp 0");
                } else if (comboBoxMerk.getSelectedItem().equals("Louise")) {
                    textHargaFoundation.setText("Rp 70.000");
                    textHargaMascara.setText("Rp 60.000");
                    textHargaLipstick.setText("Rp 40.000");
                    textHargaFacePallete.setText("Rp 80.000");
                    textHargaEyebrowPencil.setText("Rp 45.000");
                    textHargaSerum.setText("Rp 100.000");
                    textHargaToner.setText("Rp 65.000");
                    textHargaEssence.setText("Rp 85.000");
                    textHargaEyeCream.setText("Rp 55.000");
                    textHargaSheetMask.setText("Rp 10.000");
                } else if (comboBoxMerk.getSelectedItem().equals("Roseane")) {
                    textHargaFoundation.setText("Rp 100.000");
                    textHargaMascara.setText("Rp 70.000");
                    textHargaLipstick.setText("Rp 50.000");
                    textHargaFacePallete.setText("Rp 85.000");
                    textHargaEyebrowPencil.setText("Rp 55.000");
                    textHargaSerum.setText("Rp 115.000");
                    textHargaToner.setText("Rp 70.000");
                    textHargaEssence.setText("Rp 90.000");
                    textHargaEyeCream.setText("Rp 65.000");
                    textHargaSheetMask.setText("Rp 15.000");
                } else {
                    textHargaFoundation.setText("Rp 85.000");
                    textHargaMascara.setText("Rp 65.000");
                    textHargaLipstick.setText("Rp 50.000");
                    textHargaFacePallete.setText("Rp 80.000");
                    textHargaEyebrowPencil.setText("Rp 50.000");
                    textHargaSerum.setText("Rp 90.000");
                    textHargaToner.setText("Rp 65.000");
                    textHargaEssence.setText("Rp 80.000");
                    textHargaEyeCream.setText("Rp 60.000");
                    textHargaSheetMask.setText("Rp 10.000");
                }
            }
        });

        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Total Harga
                double iTotal, iDiskon, iTotalPesanan;
                SubClass ItemCost = new SubClass();
                    if (comboBoxMerk.getSelectedItem().equals("Louise")){
                        ItemCost.Foundation = ItemCost.fFoundation * Double.parseDouble(textFoundation.getText());
                        ItemCost.Mascara = ItemCost.fMascara * Double.parseDouble(textMaskara.getText());
                        ItemCost.Lipstick = ItemCost.fLipstick * Double.parseDouble(textLipstick.getText());
                        ItemCost.FacePallete = ItemCost.fFacePallete * Double.parseDouble(textFacePallete.getText());
                        ItemCost.EyebrowPencil = ItemCost.fEyebrowPencil * Double.parseDouble(textPensilAlis.getText());
                        ItemCost.Serum = ItemCost.fSerum * Double.parseDouble(textSerum.getText());
                        ItemCost.Toner = ItemCost.fToner * Double.parseDouble(textToner.getText());
                        ItemCost.Essence = ItemCost.fEssence * Double.parseDouble(textEssence.getText());
                        ItemCost.EyeCream = ItemCost.fEyeCream * Double.parseDouble(textEyeCream.getText());
                        ItemCost.SheetMask = ItemCost.fSheetMask * Double.parseDouble(textSheetMask.getText());
                    }
                    else if (comboBoxMerk.getSelectedItem().equals("Roseane")) {
                        ItemCost.Foundation = ItemCost.gFoundation * Double.parseDouble(textFoundation.getText());
                        ItemCost.Mascara = ItemCost.gMascara * Double.parseDouble(textMaskara.getText());
                        ItemCost.Lipstick = ItemCost.gLipstick * Double.parseDouble(textLipstick.getText());
                        ItemCost.FacePallete = ItemCost.gFacePallete * Double.parseDouble(textFacePallete.getText());
                        ItemCost.EyebrowPencil = ItemCost.gEyebrowPencil * Double.parseDouble(textPensilAlis.getText());
                        ItemCost.Serum = ItemCost.gSerum * Double.parseDouble(textSerum.getText());
                        ItemCost.Toner = ItemCost.gToner * Double.parseDouble(textToner.getText());
                        ItemCost.Essence = ItemCost.gEssence * Double.parseDouble(textEssence.getText());
                        ItemCost.EyeCream = ItemCost.gEyeCream * Double.parseDouble(textEyeCream.getText());
                        ItemCost.SheetMask = ItemCost.gSheetMask * Double.parseDouble(textSheetMask.getText());
                    }
                    else if (comboBoxMerk.getSelectedItem().equals("Eden")) {
                        ItemCost.Foundation = ItemCost.eFoundation * Double.parseDouble(textFoundation.getText());
                        ItemCost.Mascara = ItemCost.eMascara * Double.parseDouble(textMaskara.getText());
                        ItemCost.Lipstick = ItemCost.eLipstick * Double.parseDouble(textLipstick.getText());
                        ItemCost.FacePallete = ItemCost.eFacePallete * Double.parseDouble(textFacePallete.getText());
                        ItemCost.EyebrowPencil = ItemCost.eEyebrowPencil * Double.parseDouble(textPensilAlis.getText());
                        ItemCost.Serum = ItemCost.eSerum * Double.parseDouble(textSerum.getText());
                        ItemCost.Toner = ItemCost.eToner * Double.parseDouble(textToner.getText());
                        ItemCost.Essence = ItemCost.eEssence * Double.parseDouble(textEssence.getText());
                        ItemCost.EyeCream = ItemCost.eEyeCream * Double.parseDouble(textEyeCream.getText());
                        ItemCost.SheetMask = ItemCost.eSheetMask * Double.parseDouble(textSheetMask.getText());
                    } else {
                        ItemCost.Foundation = 0;
                        ItemCost.Mascara = 0;
                        ItemCost.Lipstick = 0;
                        ItemCost.FacePallete = 0;
                        ItemCost.EyebrowPencil = 0;
                        ItemCost.Serum = 0;
                        ItemCost.Toner = 0;
                        ItemCost.Essence = 0;
                        ItemCost.EyeCream = 0;
                        ItemCost.SheetMask = 0; }

                    iTotalPesanan = ItemCost.GetAmount();
                    iDiskon = ItemCost.diskon(iTotalPesanan);
                    iTotal = iTotalPesanan - iDiskon;

                    String TotalPesanan = String.format("Rp %.2f" + "0", iTotalPesanan);
                    textTotalPesanan.setText(TotalPesanan);

                    String Diskon = String.format("Rp %.2f" + "0", iDiskon);
                    textPotonganHarga.setText(Diskon);

                if (comboBoxMetodePembayaran.getSelectedItem().equals("BCA")){
                    String Total = String.format("Rp %.2f" + "0", iTotal + ItemCost.iBCA);
                    textTotalBelanja.setText(Total);
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("BNI")){
                    String Total = String.format("Rp %.2f" + "0", iTotal + ItemCost.iBNI);
                    textTotalBelanja.setText(Total);
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("BRI")){
                    String Total = String.format("Rp%.2f" + "0", iTotal + ItemCost.iBRI);
                    textTotalBelanja.setText(Total);
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("Bank Syariah Indonesia")){
                    String Total = String.format("Rp%.2f" + "0", iTotal + ItemCost.iBankSyariah);
                    textTotalBelanja.setText(Total);
                } else {
                    textTotalBelanja.setText(null);
                }
                    // Total Harga Make Up
                    String MakeUp = String.format("Rp%.2f" + "0", ItemCost.Makeup);
                    textTotalMakeUp.setText(MakeUp);
                    // Total Harga Skincare
                    String Skincare = String.format("Rp%.2f" + "0", ItemCost.Skincare);
                    textTotalSkincare.setText(Skincare);

            }
        });
        comboBoxMetodePembayaran.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxMetodePembayaran.getSelectedItem().equals("BCA")){
                    textPembayaran.setText("Rp 2.000");
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("BRI")){
                    textPembayaran.setText("Rp 1.500");
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("BNI")){
                    textPembayaran.setText("Rp 1.250");
                } else if (comboBoxMetodePembayaran.getSelectedItem().equals("Bank Syariah Indonesia")){
                    textPembayaran.setText("Rp 1.000");
                } else {
                    textPembayaran.setText("Silahkan Pilih Metode Pembayaran");
                }
            }
        });


        receiptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Selamat_Datang y = new Selamat_Datang();
                //String name = y.nama;
                //String alamat = y.alamat;
                // Receipt
                int nomorOrder = 1325 + (int) (Math.random()*4238);
                Calendar timer = Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
                tTime.format(timer.getTime());
                SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-YYYY");
                tDate.format(timer.getTime());

                textHasil.append("\t Make Up Shop : \n" + "No Order : \t\t\t" + nomorOrder +
                        "\n============================================================\n" +
                        //"Nama : \t\t" + name + "\n\n" +
                        //"Alamat : \t\t" + alamat + "\n\n" +
                        "Make Up : \t\t" + textTotalMakeUp.getText() + "\n\n" +
                        "Skincare :\t\t" + textTotalSkincare.getText() + "\n\n" +
                        "Total Pesanan : \t\t" + textTotalPesanan.getText() + "\n\n" +
                        "\n============================================================\n" +
                        "Metode Pembayaran \t\t" + comboBoxMetodePembayaran.getSelectedItem() + "\n\n" +
                        "Potongan Harga \t\t" + textPotonganHarga.getText() + "\n\n" +
                        "Total Belanja \t\t" + textTotalBelanja.getText() + "\n\n" +
                        "\n============================================================\n" +
                        "\n Tanggal : " + tDate.format(timer.getTime()) +
                        "\n Waktu : " + tTime.format(timer.getTime()) +
                        "\n\n\n Terimakasih telah berbelanja di toko kami"
                );
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Make Up Store");
        frame.setContentPane(new Makeup_Store().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }
}
