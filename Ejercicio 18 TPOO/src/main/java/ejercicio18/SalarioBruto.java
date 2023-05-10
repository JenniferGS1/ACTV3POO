/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author jg702
 */
public class SalarioBruto {
    
        public static double CalcularSalarioB(double horastrabajadas, double valhora){
        double salarioB;
        salarioB =horastrabajadas*valhora;
        return salarioB;
        }           
        public static double CalcularSalarioN(double horastrabajadas, double valhora, double retencion){
        double salarioN;
        salarioN = horastrabajadas*valhora-(horastrabajadas*valhora*(retencion/100));
        return salarioN;
    }
}

