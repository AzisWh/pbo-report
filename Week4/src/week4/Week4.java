/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Week4 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float nilai = inp.nextFloat();
        
        Kondisi n1 = new Kondisi();
        char huruf = n1.getNilHuruf(nilai);
        String predikat = n1.getPredikat(huruf);
        
       
        System.out.println("Nilai huruf dari adalah "+huruf);
        System.out.println("Predikatnya adalah "+predikat);
    }
    
}
