/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7pbo;

import java.text.DecimalFormat;

/**
 *
 * @author LENOVO
 */
public class Karyawan {
    String nama;
    String Jabatan;
    String status;

    DecimalFormat dec = new DecimalFormat("##,###,##0.00");

    public Karyawan(){}

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return Jabatan;
    }
    public void setJabatan(String jabatan) {
        Jabatan = jabatan;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
