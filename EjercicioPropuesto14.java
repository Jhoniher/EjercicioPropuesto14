
package ejerciciopropuesto14;

import java.util.Scanner;

public class EjercicioPropuesto14 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double numero, cuadrado, cubo;
        System.out.println("Ingrese un numero: ");
        numero=entrada.nextDouble();
        cuadrado=Math.pow(numero,2);
        cubo=Math.pow(numero, 3);
        System.out.println("El cuadrado de "+numero+ " es: "+cuadrado);
        System.out.println("El cubo de "+numero+" es: "+cubo);
    }
    
}
