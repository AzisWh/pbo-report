/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author LENOVO
 */
public class ponselMAIN {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.sleepmodeOn();
        cp.sleepmodeOff();
        cp.powerOff();

        // Dari sini semua function tidak bisa digunakan karena HP mati 
        cp.volumeDown();
        cp.sisaPulsa();

        // Setelah dihidupkan function bisa digunakan
        cp.powerOn();
        cp.volumeUp();
        cp.getVolume();
        cp.setVol(26);
        cp.getVolume();

        // Top Up pulsa diatas minimal 5000 & HP posisi hidup,
        // ketika posisi mati pulsa terkirim namun tidak bisa terlihat
        cp.topUpPulsa(15000);
        cp.sisaPulsa();

        // Menambahkan banyak contact dengan Array List
        kontak kontak = new kontak("Noval", "137899");
        kontak.tambahkontak("Alfa", "13816");
        kontak.tambahkontak("Ishal", "13566");
        kontak.tambahkontak("Irfan", "13445");
        kontak.tambahkontak("Thie", "13643");
        kontak.displaykontak();

        // Mencari Contact dengan Nama dan No
        kontak.showkontakByName("Irfan");
        kontak.showkontakByNoHP("13643");

    }

}
