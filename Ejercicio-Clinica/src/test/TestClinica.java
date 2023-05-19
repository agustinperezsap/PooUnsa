package test;

import datos.*;

public class TestClinica {

    public static void main(String[] args) {
        Paciente pacientes[] = new Paciente[2];
        Fecha fechaIngreso = new Fecha();
        Fecha fechaAlta = new Fecha(2024, 2, 23, 15, 30);
        
        pacientes[0] = new Internado(fechaAlta, "Agustin 2", 123123, "Calle re pingo", "220022", fechaIngreso);
        
        pacientes[1] = new Ambulatorio("Esta loco jiji", "Agustin", 12123123, "calle pingo", "009-999", fechaIngreso);
        for (Paciente paciente : pacientes) {
            System.out.println("paciente = " + paciente);
        }
        
        System.out.println("Diferencia de ingresos de los pacientes: " + pacientes[0].getFecha().diferenciaDias(fechaIngreso));
        
    }
}
