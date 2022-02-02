
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author dark_
 */
public class Cuenta {
    //////////////////////////////////Atributes////////////////////////////////
    private int nroCuenta;
    private long dni;
    private double saldo;
    //////////////////////////////////Builders////////////////////////////////

    public Cuenta(int nroCuenta, long dni, double saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
    /////////////////////////////
    public Cuenta() {
    }
    ///////////////////////////////Getters and Setters/////////////////////////

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    ///////////////////////////////////Methods/////////////////////////////////
    public void crearCuenta(){
         Scanner read = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese el numero de cuenta: ");
         this.nroCuenta = read.nextInt();
         System.out.println("Ingrese su DNI: ");
         this.dni = read.nextLong();
         System.out.println("Ingrese el saldo inicial: ");
         this.saldo = read.nextDouble();
         while(this.saldo<0){
             System.out.println("Usted esta en quiebra, ingrese un valor positivo");
             this.saldo = read.nextDouble();
         }
    }
    public void ingresar(double ingreso){
        
        this.saldo += ingreso;
    }
    public void retirar(double retiro){
        
        if (this.saldo < retiro) {
            this.saldo = 0;
        }else{
        this.saldo -= retiro;
        }
    }
    public void extraccionRapida(){
        this.saldo -= this.saldo *0.2;
    }
    public void consultarSaldo(){
        System.out.printf("Su saldo actual es de %.2f \n",this.saldo);
    }
      public void consultarDatos(){
          System.out.printf("Numero de cuenta: %d \n",this.nroCuenta);
          System.out.printf("DNI: %d \n", this.dni);
          System.out.printf("Saldo actual: %.2f ",this.saldo);
    }
            
}
