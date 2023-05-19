
package test;

import datos.*;


public class main {
    public static void main(String[] args) {
        Auto a1 = new Auto(2200, "BMW", "A1");
        Fecha fehcaInicio = new Fecha(20222, 3, 13, 9, 0);
        
        Empleado [] empleados = new Empleado[3];
        empleados[1] = new Pasante("pingo", 123123, "123123", fehcaInicio, 90000);
        empleados[0] = new Vendedor(a1, "Ura", 213123, "23123", fehcaInicio, 13000);
        empleados[2] = new Secretario(123123, 1, "pingo", 123123, "123123", fehcaInicio, 200);
        System.out.println("");
        for (Empleado empleado : empleados) {
            System.out.println("empleado = " + empleado);
            System.out.println("");
        }
        
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].incrementarSalario();
            System.out.println(empleados[i]);
        }
        
        
    }
}
