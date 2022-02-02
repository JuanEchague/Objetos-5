
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
     Cuenta cuenta = new Cuenta();
     cuenta.crearCuenta();
     System.out.println("Igrese la cantidad de dinero a ingresar");
     cuenta.ingresar(read.nextDouble());
     System.out.println("Ingrese la cantidad de dinero a retirar");
     cuenta.retirar(read.nextDouble());
     cuenta.extraccionRapida();
     cuenta.consultarSaldo();
     cuenta.consultarDatos();
    }
    
}
