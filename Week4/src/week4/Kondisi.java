/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

public class Kondisi {
    
    char nHuruf;
    String predikatP;
    
    char getNilHuruf(float n1){
        if(n1 >= 85){
            nHuruf ='A';
        }
        else if(n1 >= 70 && n1 <85){
            nHuruf ='B';
        }
        else if(n1 >= 60 && n1 <70){
            nHuruf ='C';
        }
        else if(n1 >= 40 && n1 <60){
            nHuruf ='D';
        }
        else{
            nHuruf ='E';
        }
        return nHuruf;
    }
    
    String getPredikat(char hurufP){
        
        predikatP = switch (hurufP) {
            case 'A' -> "Apik";
            case 'B' -> "Baik";
            case 'C' -> "Cukup";
            case 'D' -> "Dablek";
            default -> "Elek";
        };
        return predikatP;
    }
}
