/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan2.deklarasidanpengaksesanvariabel;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * Kelas        : IF-2 
 * NIM          : 10119077
 * Deskripsi    : Deklarasi & Pengaksesan Variabel
 */
public class PBOIF210119077Latihan2DeklarasidanpengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai variabel
        nilaiInt = 80;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi Variabel nilai = " + nilaiInt);
        System.out.println("Isi Variabel PHI = " + PHI);
        System.out.println("Isi Variabel Logika = " + nilaiLogika);
        System.out.println("Isi Variabel Karakter = " + nilaiKarakter);
    }
    
}
