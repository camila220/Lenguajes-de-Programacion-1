/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.programacion;

/**
 *
 * @author walter
 */
public class ejercicio0 {
    public static int sumar (int a, int b) {
    return a+b;
    }
    public static int resta (int a, int b) {
    return a-b;
    }
    public static int multiplicacion (int a, int b) {
    return a*b;
    }
    public static float division (float a, float b) {
    float div=0;
    try {
       div= a/b;
    } catch (ArithmeticException e) {
        System.out.print("no se puede dividir entre 0);
    }
    return div;
    }
    public static void main(String[] args) {
        System.out.println("Suma= "+ sumar(10, 20));
        System.out.println("Resta= "+resta(10, 20));
        System.out.println("Multiplicacion= "+ multiplicacion(10, 20));
        System.out.println("Division= " + division(10, 5));
    }

}

