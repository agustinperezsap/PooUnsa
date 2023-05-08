package datos;

import java.util.Random;
import java.util.Scanner;

public class Mesa {

    private Sombrero[] sombreros = new Sombrero[3];
    private Jugador j1;
    Scanner entrada = new Scanner(System.in);
    
    public Mesa() {
        for (int i = 0; i < sombreros.length; i++) {
            sombreros[i] = new Sombrero(i);
            System.out.println(sombreros[i]);
        }
        System.out.print("Ingrese su saldo: ");
        double saldo = entrada.nextDouble();
        if(saldo > 0){
            j1 = new Jugador(saldo);
        }
        else{
            System.out.println("saldo =0 no puede jugar: ");
        }
        
    }

    public void jugar() {
        j1.apostar();
        insertarMoneda();
        int eleccion = opcionSombrero();
        ganador(sombreros[eleccion], j1);

    }

    private void insertarMoneda() {
        Random rand = new Random();
        int sombreroAleatorio = rand.nextInt(3);
        int moneda = 1;
        sombreros[sombreroAleatorio].setMoneda(moneda);
        sombreros[sombreroAleatorio].setNumeroSombrero(sombreroAleatorio);
        System.out.println("Moneda puesta el sombrero del medio.");
        System.out.println("Mezclando sombreros...");
    }

    public void ganador(Sombrero s1, Jugador j) {
        int opcion;
        if (s1.getMoneda() == 1) {
            System.out.println("");
            System.out.println(".:       ¡GANASTE!      :.");
            System.out.println("tu apuesta fue: " + j.getApuesta());
            System.out.println("");
            System.out.println("***La moneda estaba en el sombrero: " + s1.getNumeroSombrero());
            double premio = j.getApuesta() * 2;
            System.out.println("Acaba de ganar: $ " + premio);
            j.setSaldo(premio);
            System.out.println("Nuevo saldo: " + j.getSaldo());
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println(".:       ¡Perdedoooooor!      :.");
            System.out.println("Su apuesta fue: " + j.getApuesta());
            System.out.println("Su saldo sigue siendo : " + j.getSaldo());
            System.out.println("");
            System.out.println("***La moneda estaba en el sombrero: " + s1.getNumeroSombrero());
            System.out.println("");
        }
        System.out.print("Desea seguir jugando? 1 para si cualquier otro numero para no: ");
        opcion = entrada.nextInt();
        System.out.println("");
        s1.setMoneda(0);
        if (opcion == 1) {
            this.jugar();
        } else {
            System.out.println("Adios");
        }
    }

    private int opcionSombrero() {
        int eleccion;
        do {
            System.out.println("");
            System.out.print("Eliga uno de los 3 sombreros: ");
            eleccion = entrada.nextInt();
            System.out.println("");
            if (eleccion < 1 || eleccion > 3) {
                System.out.println("La opción elegida es inválida. Por favor, ingrese una opción válida.");
            }
        } while (eleccion < 1 || eleccion > 3);
        return eleccion - 1;
    }

}
