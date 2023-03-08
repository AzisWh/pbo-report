/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasweek2;

/**
 *
 * @author LENOVO
 */
public class Lampu {
    boolean nyala = false;

    public void nyalakanLampu() {
        nyala = true;
        System.out.println("True");
    }
    
    public void matikanLampu() {
        nyala = false;
        System.out.println("False");
    }

}
