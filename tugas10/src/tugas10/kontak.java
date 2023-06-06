/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class kontak {
    public String nama;
    public String nomor;
    private int loop;
    private ArrayList<String> kontak;

    public kontak(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
        this.kontak = new ArrayList<>();
        kontak.add(nama);
        kontak.add(nomor);
        this.loop = kontak.size();
    }

    public void tambahKontak(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
        kontak.add(nama);
        kontak.add(nomor);
        this.loop = kontak.size();
    }

    String getNama()
    {
        return this.nama;
    }

    String getNomor()
    {
        return this.nomor;
    }

    // Menampilkan Semua Contact
    public void displayKontak() {
        for (int i = 0; i < loop; i+=2) {
            System.out.println("Nama : " + kontak.get(i));
            System.out.println("No : " + kontak.get(i+1));
        }
    }


    // Mencari Contact Bedasarkan Nama
    public void showkontakByName(String nama){
        for (int i = 0; i < loop; i+=2) {
            if(nama==kontak.get(i)){
                System.out.println("Nama : " + kontak.get(i));
                System.out.println("No : " + kontak.get(i+1));
            }
        }
    }

    // Mencari Contact Bedasarkan No HP
    public void showkontakByNoHP(String no){
        for (int i = 0; i < loop; i+=2) {
            if(no==kontak.get(i+1)){
                System.out.println("Nama : " + kontak.get(i));
                System.out.println("No : " + kontakk.get(i+1));
            }
        }
    }

}
