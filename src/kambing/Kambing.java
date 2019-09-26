/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author
 * NAMA     : Rima Rizqi Nurfajri
 * KELAS    : IF01
 * NIM      : 10118801
 * Deskripsi Program    : Program ini beri si program untuk menampilkan
 * Jumlah kambing menggunakan variabel lokal
 */
public class Kambing {
    
    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) { 
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();              
    }
    
}
