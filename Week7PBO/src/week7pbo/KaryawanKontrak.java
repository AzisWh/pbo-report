/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7pbo;

/**
 *
 * @author LENOVO
 */
public class KaryawanKontrak extends Karyawan {
    public int upah;
    public int jumlahMasuk;
    public int jumlahAnak;

    public KaryawanKontrak(){}

    public int getUpah() {
        return upah;
    }
    public void setUpah(int upah) {
        this.upah = upah;
    }
    public int getJumlahMasuk() {
        return jumlahMasuk;
    }
    public void setJumlahMasuk(int jumlahMasuk) {
        this.jumlahMasuk = jumlahMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public float totalUpah(int upah,int jumlahMasuk,int jumlahAnak){
        int jmlUpah = upah*jumlahMasuk;
        return (float)(jmlUpah+((jmlUpah*0.1)*jumlahAnak));
    }

    public void gajikaryawan(){
        System.out.println("");
        System.out.println(getNama()+" adalah seorang karyawan kontrak yang memiliki jumlah anak "+getJumlahAnak()+
        " dan total gaji "+getNama()+" adalah Rp."+dec.format(totalUpah(getUpah(), getJumlahMasuk(), getJumlahAnak())));
        System.out.println("");
    }
}
