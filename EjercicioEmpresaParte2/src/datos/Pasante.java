package datos;

import java.util.Scanner;

public class Pasante extends Empleado {
    private boolean pertenece;
    private Scanner entrada = new Scanner(System.in);

    public Pasante(String nombre, int dni, String telefono, Fecha antiguedad, long salarioMensual) {
        super(nombre, dni, telefono, antiguedad, salarioMensual);
        this.pertenece = false;
    }
    
    public void incorporarEmpresa(Pasante p){
        Fecha f = new Fecha();
        int tiempo = f.diferenciaDias(p.getAntiguedadCompleta());
        if(tiempo >= 90){
            System.out.println("Incorporar a la empresa: (true/false)");
            this.pertenece = entrada.nextBoolean();
        }
        else{
            System.out.println("No a estado mas de 90 dias");
        }
    }
    
    @Override
     public void incrementarSalario() {
        long saldo = this.getSalarioMensual();
        System.out.println("Salario: " + saldo);
//        int tiempoActivo = this.getAntiguedad();
        long incremento = (long) (saldo * 0.5);
        this.setSalarioMensual(incremento);
        System.out.println("Salario aumentado, su nuevo salario es: " + this.getSalarioMensual());
    }
    
    

    @Override
    public String toString() {
        String datos = super.toString();
        return "Pasante{" + "pertenece=" + pertenece + ", datos=" + datos + '}';
    }
}
