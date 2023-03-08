/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author LENOVO
 */
public class Aksi {
    
    public static void main(String[] args) { 
        //membuat objek
        Sepeda sepedaRusak = new Sepeda(2, "Lipat ", "TDR3000 "); 
        
        //mengakses atribut dan method
        int gigiSepeda = sepedaRusak.gigi; 
        System.out.println(gigiSepeda); 
        sepedaRusak.rem(); 
    } 

}
