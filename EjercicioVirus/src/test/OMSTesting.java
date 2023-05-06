package test;

import datos.Virus;
import java.util.Scanner;

public class OMSTesting {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Virus v1;
        int intento, contador = 0;
        System.out.print("Ingrese el nombre a del virus a neutralizar: ");
        v1 = new Virus(entrada.nextLine());
        System.out.println("El virus es: " + v1.toString());
        do {
            System.out.print("Ingrese un adn para tratar de neutralizar: ");
            intento = entrada.nextInt();
            contador++;
            v1.neutralizar(intento);
            if (v1.esNocivo()) {
                System.out.println("El virus no fue neutralizado, nocividad: " + v1.esNocivo());
            }
        } while (v1.esNocivo());
        
        System.out.println("Cantidad de intentos realizados para poder neutralizar: " + contador);
        System.out.println("El virus fue neutralizado, nocividad : " + v1.esNocivo());

    }
}
