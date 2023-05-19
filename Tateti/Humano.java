package Tateti;

import java.util.Scanner;

public class Humano extends Jugador{


    Humano(Tablero tablero) {
        super(tablero);
        super.setNombre(cargaNombre());
        super.setMarca(cargaChar());
    }
    private String cargaNombre(){
        String nombre;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido/a .Introduce tu nombre: ");
        nombre = scan.nextLine();
        return nombre;
    }
    private char cargaChar(){
        int opc;
        Scanner scan = new Scanner(System.in);
        System.out.println("Elije tu marca para jugar. 1) X  2) O : ");
        opc = scan.nextInt();
        if(opc == 1){
            return 'X';
        }
        else{
            return 'O';
        }
    }
    private void imprimePlantilla(){
        System.out.println("Introduce Alguna de las siguientes posiciones. ");
        System.out.printf("%s \n%s \n%s \n ", "[1] | [2] | [3| ",
                "[4] | [5] | [6| ", "[7] | [8] | [9| ");
    }
    public void jugar(Tablero tablero){
        System.out.println("Tablero: ");
        System.out.println(tablero);
        int opcion;
        boolean opcionInvalida = true;
        int indF,indC;
        Scanner scan = new Scanner(System.in);
        do{
            imprimePlantilla();
            opcion = scan.nextInt();
            if(opcion >= 1 && opcion <= 9){
                indF = super.convertirF(opcion);
                indC = super.convertirC(opcion);
                opcionInvalida = !(tablero.getCasillero()[indF][indC].estaVacio());
                if(!opcionInvalida){
                    tablero.getCasillero()[indF][indC].setContenido(this.marca);
                }
            }else{
                System.out.println("Opcion invalida debe estar en el rago [1-9]");
            }
        }while(opcionInvalida);
    }
}
