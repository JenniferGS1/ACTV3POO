/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio41;

/**
 *
 * @author jg702
 */
public class Operaciones {
    public static int encontrarMayor(int a1, int b2, int c3) {
    int mayor = a1;
    if (b2 > mayor) {
      mayor = b2;
    }
    if (c3 > mayor) {
      mayor = c3;
    }
    return mayor;
  }
}
