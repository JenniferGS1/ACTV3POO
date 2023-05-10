/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio40;

/**
 *
 * @author jg702
 */
public class Operaciones {
    public static int calcularRaizCuadrada(int x) {
        int RaizCuadrada;
        RaizCuadrada = (int) Math.round(Math.sqrt(x));
        return RaizCuadrada;
    }
        
        public static int calcularCuadrado(int x) {
        int Cuadrado;
        Cuadrado = Math.round(x*x);
        return Cuadrado;
        }
        public static int calcularCubo(int x) {
        double Cubo;
        Cubo =  Math.round(x*x*x);
        return (int) Cubo;
        }
     
        
}
