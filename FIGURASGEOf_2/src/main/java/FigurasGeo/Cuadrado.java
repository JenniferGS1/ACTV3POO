/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeo;

/**
 *
 * @author jg702
 */
public class Cuadrado {
    double lado;

    Cuadrado(double lado){
        this.lado =lado;
    }

    double calcularArea(){
        return lado*lado;

    }

    double calcularPerimetro(){
        return (lado*4);
    }
}
