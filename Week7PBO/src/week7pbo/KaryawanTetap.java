/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7pbo;

/**
 *
 * @author LENOVO
 */
public class KaryawanTetap extends Karyawan {
    public int gajiPokok;
    public int jumlahAnak;

    public KaryawanTetap(){}

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public float totalGaji(int gajiPokok, int jumlahAnak){
        return (float) (gajiPokok + ((gajiPokok*0.1)*jumlahAnak));
    }

    public void gajikaryawan(){
        System.out.println("");
        System.out.println(getNama()+" adalah seorang karyawan tetap memegang tangung jawab sebagai "+getJabatan()+" yang memiliki jumlah anak "+getJumlahAnak()+
        " dan total gaji "+getNama()+" adalah Rp."+dec.format(totalGaji(getGajiPokok(),getJumlahAnak())));
        System.out.println("");
    }
}
