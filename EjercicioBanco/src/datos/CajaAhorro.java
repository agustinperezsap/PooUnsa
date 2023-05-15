
package datos;
/**
 * @author agust\
 * Una caja de ahorro tiene un saldo que nunca puede ser menor que 0. 
 * Las operaciones que un cliente puede realizar son: Depósito, Extracción y Consulta de saldo. 
 * Además, existe una cantidad máxima fija de extracciones por mes que puede realizar. 
 * Defina una clase Caja con los atributos y métodos necesarios. Instancie varios objetos agregando (de ser necesario) información inicial.
 */


public class CajaAhorro {
    private double saldo;
    private int cantidadExtracciones;
    private final int MAX_EXTRACCIONES = 5;

    public CajaAhorro(double saldoInicial) {
        this.saldo = saldoInicial;
        this.cantidadExtracciones = 0;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public boolean extraer(double monto) {
        if (monto > this.saldo || this.cantidadExtracciones >= MAX_EXTRACCIONES) {
            System.out.println("No puede realizar esa operacion.");
            return false; 
        }
        this.saldo -= monto;
        this.cantidadExtracciones++;
        System.out.println("Extraccion Realizada");
        return true;
    }

    public String consultarSaldo() {
      return "Su salo es:  = " + this.saldo;
    }

    public int getCantidadExtracciones() {
        return this.cantidadExtracciones;
    }
  
}
