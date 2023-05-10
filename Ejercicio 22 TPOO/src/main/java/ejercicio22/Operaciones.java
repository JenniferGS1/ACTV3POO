/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

/**
 *
 * @author jg702
 */
public class Operaciones {
    public static double calcularSalarioMensual(double salarioPorHora, double horasTrabajadas) {
        double salarioMensual = salarioPorHora * horasTrabajadas;
        
        if (salarioMensual > 450000) {
            return salarioMensual;
        }
        else return 0;
    }
}
