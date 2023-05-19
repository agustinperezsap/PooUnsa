
package test;

import datos.*;


public class main {
    public static void main(String[] args) {
        Auto a1 = new Auto(2200, "BMW", "A1");
        Fecha fehcaInicio = new Fecha(20222, 3, 13, 9, 0);
        
        Empleado [] empleados = new Empleado[4];
        empleados[1] = new Pasante("Cajeta", 122233, "123123", 500);
        empleados[0] = new Vendedor(a1, "Ura", 213123, "23123", fehcaInicio, 13000);
        empleados[2] = new Secretario(123123, 1, "pingo", 123123, "123123", fehcaInicio, 200);
        
        
    }
}
