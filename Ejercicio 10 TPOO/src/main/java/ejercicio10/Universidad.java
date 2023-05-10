/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author jg702
 */
public class Universidad {
    public static double CalcularVM(double patrimonio, double estrato) {
    double VALORM = 50000;
	if ((patrimonio > 2000000) && (estrato > 3)) {
		VALORM = VALORM + 0.03 * patrimonio;

		}
	return VALORM;
	}
}

    
        
    
