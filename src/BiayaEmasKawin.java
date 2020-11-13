/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi class Biaya Emas Kawin 
 */
public class BiayaEmasKawin {
    private double harga, berat;
    public void setBerat(double berat){
        this.berat = berat;
    }
    
    public double getBerat(){
        return berat;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public double totalHarga(){
        return harga * berat;
    }
}
