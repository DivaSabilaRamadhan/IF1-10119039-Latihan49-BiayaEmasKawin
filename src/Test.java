/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
        
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi program biaya emas kawin dengan pendekatan objek 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmasKawin maskawin = new BiayaEmasKawin();
        maskawin.setBerat(15.7);
        maskawin.setHarga(570000);
        
        DecimalFormat kurs = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("Rp. ");
        symbol.setGroupingSeparator(',');
        
        kurs.setDecimalFormatSymbols(symbol);
        System.out.println("====Perhitungan Biaya Emas Kawin====");
        System.out.println("Berat Emas : " + maskawin.getBerat() + " gram ");
        System.out.println("Harga Emas : ".concat(kurs.format(maskawin.getHarga())).replaceAll(",00", "").concat(" / gram / bulan Oktober"));
        System.out.println("\nTotal biaya : ".concat(kurs.format(maskawin.totalHarga())).replaceAll(",00", ""));
    }
    
}
