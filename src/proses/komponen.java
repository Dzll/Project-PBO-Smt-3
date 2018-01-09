package proses;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
public class komponen extends JFrame{
    JLabel label = new JLabel("-- JOSS LAUNDRY --");
    JLabel nama = new JLabel("Nama pelanggan  : ");
    JLabel nohp = new JLabel("Nomor Hp        : ");
    JLabel alamat = new JLabel("Alamat          : ");
    JLabel berat = new JLabel("Berat Cucian    : ");
    JLabel beratkg = new JLabel("Kg");
    JLabel metode = new JLabel("Metode Cuci     : ");
    JLabel bayar = new JLabel("BAYAR           : ");
    JLabel alert = new JLabel();

    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextPane almt = new JTextPane();
    String[] isibr = {"1","2","3","4","5","6","7","8","9","10"}; 
    JComboBox br = new JComboBox(isibr);
    String[] isimetod = {"Cuci Basah","Cuci Kering","Cuci Kering Setrika","Setrika Saja"};
    JComboBox metod = new JComboBox(isimetod);
    JButton total = new JButton("TOTAL");
    JTextField hasiltotal = new JTextField();
    JTextField byr = new JTextField();
    JButton cetak = new JButton("CETAK");
    JButton c = new JButton("C");

    JTextPane text = new JTextPane();
    JTextPane text2 = new JTextPane();
    protected String pro="", kilo="", metodee="",data="";
    protected int harga, kembali=0, bay, o=0;
    Thread t = Thread.currentThread();
    public void proses(){
        if(br.getSelectedItem().equals("1")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.7000");
                    metodee = "Cuci Basah";
                    harga = 7000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.12000");
                    metodee = "Cuci Kering";
                    harga = 12000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.12000");
                    metodee = "Cuci Kering Setrika";
                    harga = 12000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.8000");
                    metodee = "Setrika Saja";
                    harga = 8000;
                }
                kilo = "1 Kg";
            }else if(br.getSelectedItem().equals("2")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.7000");
                    metodee = "Cuci Basah";
                    harga = 7000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.12000");
                    metodee = "Cuci Kering";
                    harga = 12000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.12000");
                    metodee = "Cuci Kering Setrika";
                    harga = 12000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.8000");
                    metodee = "Setrika Saja";
                    harga = 8000;
                }
                kilo = "2 Kg";
            }else if(br.getSelectedItem().equals("3")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.7000");
                    metodee = "Cuci Basah";
                    harga = 7000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.14000");
                    metodee = "Cuci Kering";
                    harga = 14000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.15000");
                    metodee = "Cuci Kering Setrika";
                    harga = 15000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.10000");
                    metodee = "Setrika Saja";
                    harga = 10000;
                }
                kilo = "3 Kg";
            }else if(br.getSelectedItem().equals("4")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.8000");
                    metodee = "Cuci Basah";
                    harga = 8000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.15000");
                    metodee = "Cuci Kering";
                    harga = 15000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.20000");
                    metodee = "Cuci Kering Setrika";
                    harga = 20000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.14000");
                    metodee = "Setrika Saja";
                    harga = 14000;
                }
                kilo = "4 Kg";
            }else if(br.getSelectedItem().equals("5")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.10000");
                    metodee = "Cuci Basah";
                    harga = 10000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.20000");
                    metodee = "Cuci Kering";
                    harga = 20000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.25000");
                    metodee = "Cuci Kering Setrika";
                    harga = 25000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.17000");
                    metodee = "Setrika Saja";
                    harga = 17000;
                }
                kilo = "5 Kg";
            }else if(br.getSelectedItem().equals("6")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.12000");
                    metodee = "Cuci Basah";
                    harga = 12000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.24000");
                    metodee = "Cuci Kering";
                    harga = 24000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.30000");
                    metodee = "Cuci Kering Setrika";
                    harga = 30000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.20000");
                    metodee = "Setrika Saja";
                    harga = 20000;
                }
                kilo = "6 Kg";
            }else if(br.getSelectedItem().equals("7")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.14000");
                    metodee = "Cuci Basah";
                    harga = 14000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.28000");
                    metodee = "Cuci Kering";
                    harga = 28000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.35000");
                    metodee = "Cuci Kering Setrika";
                    harga = 35000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.24000");
                    metodee = "Setrika Saja";
                    harga = 24000;
                }
                kilo = "7 Kg";
            }else if(br.getSelectedItem().equals("8")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.16000");
                    metodee = "Cuci Basah";
                    harga = 16000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.32000");
                    metodee = "Cuci Kering";
                    harga = 32000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.40000");
                    metodee = "Cuci Kering Setrika";
                    harga = 40000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.27000");
                    metodee = "Setrika Saja";
                    harga = 27000;
                }
                kilo = "8 Kg";
            }else if(br.getSelectedItem().equals("9")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.18000");
                    metodee = "Cuci Basah";
                    harga = 18000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.36000");
                    metodee = "Cuci Kering";
                    harga = 36000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.45000");
                    metodee = "Cuci Kering Setrika";
                    harga = 45000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.30000");
                    metodee = "Setrika Saja";
                    harga = 30000;
                }
                kilo = "9 Kg";
            }else if(br.getSelectedItem().equals("10")){
                if(metod.getSelectedItem().equals("Cuci Basah")){
                    hasiltotal.setText("Rp.20000");
                    metodee = "Cuci Basah";
                    harga = 20000;
                }else if(metod.getSelectedItem().equals("Cuci Kering")){
                    hasiltotal.setText("Rp.30000");
                    metodee = "Cuci Kering";
                    harga = 40000;
                }else if(metod.getSelectedItem().equals("Cuci Kering Setrika")){
                    hasiltotal.setText("Rp.50000");
                    metodee = "Cuci Kering Setrika";
                    harga = 50000;
                }else if(metod.getSelectedItem().equals("Setrika Saja")){
                    hasiltotal.setText("Rp.35000");
                    metodee = "Setrika Saja";
                    harga = 35000;
                }
                kilo = "10 Kg";
            }
    }
}
