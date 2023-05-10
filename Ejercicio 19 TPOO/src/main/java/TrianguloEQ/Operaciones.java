/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrianguloEQ;

/**
 *
 * @author jg702
 */
public class Operaciones {
     public static double CalcularPerimetro(double lado){
        double Perimetro;
        Perimetro =lado*3;
        return Perimetro;
}
     public static double CalcularAltura(double lado){
        double Altura;
        Altura =(lado*Math.sqrt(3))/2;
        return Altura;
     }
     public static double CalcularArea(double lado){
        double Area;
        Area =(lado*((lado*Math.sqrt(3))/2)/2);
        return Area;
}
}
