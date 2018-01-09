package proses;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.io.IOException;
public class GUI extends komponen{
    public GUI(){
    label.setBounds(230, 30, 500, 40);
    label.setFont(new Font("Consolas", Font.BOLD, 45));
    label.setForeground(new Color(20, 1, 188));
    nama.setBounds(20, 100, 200, 30);
    nama.setFont(new Font("Consolas", Font.BOLD,17));
    nohp.setBounds(20, 150, 200, 30);
    nohp.setFont(new Font("Consolas", Font.BOLD,17));
    alamat.setBounds(20, 200, 200, 30);
    alamat.setFont(new Font("Consolas", Font.BOLD,17));
    berat.setBounds(20, 270, 200, 30);
    berat.setFont(new Font("Consolas", Font.BOLD,17));
    beratkg.setBounds(270, 270, 50, 30);
    beratkg.setFont(new Font("Consolas", Font.BOLD,17));
    metode.setBounds(20, 320, 200, 30);
    metode.setFont(new Font("Consolas", Font.BOLD,17));
    total.setBounds(20, 370, 150, 25);
    total.setBackground(new Color(2, 200, 255));
    total.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
                proses();
                Thread.sleep(1000);
            }catch(Exception ex){
                
            }
        }
    });
    bayar.setBounds(20, 420, 200, 30);
    bayar.setFont(new Font("Consolas", Font.BOLD,17));
    bayar.setForeground(new Color(20, 1, 188));
    nm.setBounds(200, 100, 230, 25);
    nm.setFont(new Font("Consolas", Font.BOLD,17));
    nomer.setBounds(200, 150, 230, 25);
    nomer.setFont(new Font("Consolas", Font.BOLD,17));
    almt.setBounds(200, 200, 230, 50);
    almt.setFont(new Font("Consolas", Font.BOLD,15));
    br.setBounds(200, 270, 60, 25);
    
    metod.setBounds(200, 320, 230, 25);
    hasiltotal.setBounds(200, 370, 230, 25);
    hasiltotal.setFont(new Font("Consolas", Font.BOLD,17));
    byr.setBounds(200, 420, 230, 25);
    byr.setFont(new Font("Consolas", Font.BOLD,17));
    byr.setForeground(Color.red);
    alert.setBounds(200, 445, 230, 25);
    alert.setFont(new Font("Consolas", Font.BOLD,13));
    alert.setForeground(Color.red);
    
    cetak.setBounds(20, 495, 150, 25);
    cetak.setBackground(new Color(68, 255, 71));
    cetak.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            proses();
            if(byr.getText().equals("")){
                byr.setText("Input Jumlah Bayar");
                alert.setText("");
                //text.setText("");
            }else{
            bay = Integer.parseInt(new String(byr.getText()));
            try{
                CheckError();
                kembali = bay - harga;
                alert.setText("");
                o++;
                data+= o+". "+nm.getText()+" - "+metodee+" "+kilo+" >> Rp."+harga+"\n";
                text2.setText(data);
                text.setText("      -------------- JOSS LAUNDRY --------------\n" + 
                             "       JASA LAYANAN CUCI KERING SETRIKA PAKAIAN\n" + 
                             "        Semolowaru No.15 031-77175735 Surabaya\n" +
                             "      ------------------------------------------\n" + 
                             "       Nama   : " + nm.getText()+ "\n" + 
                             "       No Hp  : " + nomer.getText()+ "\n" + 
                             "       Alamat : " + almt.getText()+ "\n" + 
                             "       Berat  : " + kilo + "\n" + 
                             "       Metode : " + metodee + "\n" + 
                             "       TOTAL  : Rp." + harga + "\n" +
                             "      ------------------------------------------\n" +
                             "       BAYAR     : Rp." + byr.getText() + "\n" +
                             "       *Kembali  : Rp." + kembali + "\n" +
                             "      ------------------------------------------\n");
            }catch(Exception ex){
                errore();
            }
            }
        }
    });
    c.setBounds(386, 495, 43, 25);
    c.setBackground(Color.red);
    c.setForeground(Color.WHITE);
    c.setFont(new Font("Consolas", Font.BOLD,17));
    c.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            nm.setText("");
            nomer.setText("");
            almt.setText("");
            hasiltotal.setText("");
            byr.setText("");
            text.setText("");
            alert.setText("");
        }
    });
    text.setBounds(450, 250, 440, 270);
    text.setFont(new Font("Consolas", Font.BOLD,15));
    text2.setBounds(450, 100, 440, 130);
    text2.setFont(new Font("Consolas", Font.BOLD,14));
    
    add(label);
    add(nama);
    add(nohp);
    add(alamat);
    add(berat);
    add(beratkg);
    add(metode);
    add(nm);
    add(nomer);
    add(almt);
    add(br);
    add(metod);
    add(total);
    add(hasiltotal);
    add(bayar);
    add(byr);
    add(alert);
    add(cetak);
    add(c);
    add(text);
    add(text2);
    setTitle("JOSS Laundry - by : Wafi Dzulkarnain");
    setSize(930, 590);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);   
    }
    private void reset(){
        o+=0;
    }
    private void errore(){
        alert.setText("Bayar Kurang Rp." + (harga - bay));
    }
    private void CheckError() throws IOException{
        if(bay < harga){
            throw new IOException();
        }
    }
}
