/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

/**
 *
 * @author jg702
 */
public class Operaciones {
    public static String calcularSoluciones(double a, double b, double c) {
        double Discriminante =  Math.pow(b, 2) - 4 * a * c;
        
        if (Discriminante > 0) {          
            double x1 = Math.round((-b + Math.sqrt(Discriminante)) / (2 * a));
            double x2 = Math.round((-b - Math.sqrt(Discriminante)) / (2 * a));
            return  "las soluciones son "+x1+" y "+x2;
           
     
        } else if (Discriminante == 0) {         
            double x =Math.round( -b / (2 * a));
            return  "la solución es "+x;
        } 
        else {
            return "No hay solución";
        }
    }
}
