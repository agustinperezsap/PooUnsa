
package test;
import datos.CajaAhorro;

public class main {
    public static void main(String[] args) {
        CajaAhorro caja1 = new CajaAhorro(1000.0); // saldo inicial de 1000 pesos
        CajaAhorro caja2 = new CajaAhorro(5000.0); // saldo inicial de 5000 pesos
        CajaAhorro caja3 = new CajaAhorro(20000.0); // saldo inicial de 20000 pesos
        
        // Agregar depósitos a las cajas
        caja1.depositar(500.0);
        caja2.depositar(1500.0);
        caja3.depositar(3000.0);
        
        // Realizar extracciones de las cajas
        caja1.extraer(200.0);
        caja2.extraer(1000.0);
        caja3.extraer(5000.0);
        
        // Obtener información de las cajas
        System.out.println("Saldo de caja1: " + caja1.consultarSaldo());
        System.out.println("Saldo de caja2: " + caja2.consultarSaldo());
        System.out.println("Saldo de caja3: " + caja3.consultarSaldo());
        System.out.println("Cantidad de extracciones de caja1: " + caja1.getCantidadExtracciones());
        System.out.println("Cantidad de extracciones de caja2: " + caja2.getCantidadExtracciones());
        System.out.println("Cantidad de extracciones de caja3: " + caja3.getCantidadExtracciones());
    }
}

