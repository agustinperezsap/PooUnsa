package datos;

import java.util.Scanner;

public class Jugador {

    private double saldo;
    private double apuesta;
    Scanner entrada = new Scanner(System.in);

    public Jugador(double saldo) {
        this.saldo = saldo;
    }

    public void apostar() {
        this.apuesta = ingresarValor();
    }

    private double ingresarValor() {
        double apuesta;
        System.out.println("Su saldo es: " + this.saldo);
        do {
            System.out.print("Ingrese el monto a apostar: $ ");
            apuesta = entrada.nextDouble();
        } while (apuesta > this.saldo || apuesta < 0);
        this.saldo -= apuesta;
        System.out.println("");
        System.out.println("Apuesta realizada, su nuevo saldo es: " + this.saldo);
        System.out.println("");
        return apuesta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getApuesta() {
        return this.apuesta;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }

}
