/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mayor;

import javax.swing.JOptionPane;

/**
 *
 * @author jg702
 */
public class Operaciones {
     public static String calcularSoluciones(double valorA, double valorB) {
        
        if (valorA > valorB) {
                return "A es mayor que B";                
            }
        else if (valorA < valorB) {
                return "A es menor que B";
                    }
        else {
                return "A es igual a B";
            }
     }
}
        


                    
