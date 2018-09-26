/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 *
 * @author Rizki Adam Kurniawan
 */
public class kambing {
    public void tambahKambing() {
        //deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing setelah ditambah: " + 
                jumlahKambing;
    }
    public static void main(String[] args) {
        kambing kambingJantan = new kambing();
        kambingJantan.tambahKambing();
    }
    
}
