package datos;

import java.util.Scanner;

public class Pasante extends Empleado {
    private boolean pertenece;
    private Scanner entrada = new Scanner(System.in);

    public Pasante(String nombre, int dni, String telefono, long saldo) {
        super(nombre, dni, telefono, new Fecha(), saldo);
        
        System.out.print("Ingrese fecha de contratación (yy/mm/dd): ");
        int anio = entrada.nextInt();
        int mes = entrada.nextInt();
        int dia = entrada.nextInt();
        Fecha contrato = new Fecha(anio, mes, dia, 0, 0);

        Fecha antiguedad = new Fecha();
        
        if (contrato.diferenciaDias(antiguedad) >= 90) {
            System.out.println("Tiempo del pasante: " + contrato.diferenciaDias(antiguedad));
            System.out.print("¿Desea pertenecer a la empresa? (true/false): ");
            pertenece = entrada.nextBoolean();
        } else {
            pertenece = false;
        }
        
        
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return "Pasante{" + "pertenece=" + pertenece + ", datos=" + datos + '}';
    }
}
