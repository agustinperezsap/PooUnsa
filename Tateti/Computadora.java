package Tateti;

import java.util.Random;

public class Computadora extends Jugador{

    Computadora(Tablero tablero) {
        super(tablero);
        super.setMarca(obtieneMarca());
        super.setNombre("Computadora");
    }

    private char obtieneMarca(){
    char marca;
        if( (this.tablero.getJugadores())[0].getMarca() == 'X'){
            marca = 'O';
        }
        else
            marca = 'X';
        return marca;
    }
    private int generaPos(){
        Random rand = new Random();
        int resp = rand.nextInt(9)+1;
        return resp;
    }

/*
    //juega computadora de manera aleatoria hasta encontrar una pos valida
    public void jugar(Tablero tablero){
        int pos;
        int f, c;
        boolean cond;
        do{
            pos = generaPos();
            f=super.convertirF(pos);
            c=super.convertirC(pos);
            if(tablero.getCasillero()[f][c].estaVacio())
            {
                tablero.getCasillero()[f][c].setContenido(this.marca);
                cond = false;
            }
            else{
                cond = true;
            }
        }while(cond);
        System.out.println(tablero);
    }*/
public void jugar(Tablero tablero){
    int pos;
    int f,c;
    boolean cond;
    Jugador humano = this.tablero.getJugadores()[0];
    pos = posicionGanador(this);
    if(pos != -1)
    {
        f = super.convertirF(pos);
        c=super.convertirC(pos);
        tablero.getCasillero()[f][c].setContenido(this.marca);
    }else{
        pos = posicionGanador(humano);
        if(pos != -1){
            f=super.convertirF(pos);
            c=super.convertirC(pos);
            tablero.getCasillero()[f][c].setContenido(this.marca);
        }else{//todo buscar posibles posiciones q al poner 1 suman 2 en linea y el 3ero es ganador
            do{
                pos = generaPos();
                f=super.convertirF(pos);
                c=super.convertirC(pos);
                if(tablero.getCasillero()[f][c].estaVacio())
                {
                    tablero.getCasillero()[f][c].setContenido(this.marca);
                    cond = false;
                }
                else{
                    cond = true;
                }
            }while(cond);
        }
    }

}


    private int posicionGanador(Jugador jugador){
        int pos =-1;
        char marca = jugador.getMarca();
        pos = posicionGanadorFila(marca);
        if(pos != -1)
            return pos;
        else{
            pos = posicionGanadorColumna(marca);
            if(pos != -1){
                return pos;
            }else{
                //buscar diagonales
                pos = posicionGanadorDiagonal(marca);
                return pos;
            }
        }
    }

    private int convertirPos(int f, int c) {
        if (f == 0) {
            if (c == 0)
                return 1;
            else if (c == 1) {
                return 2;
            } else {
                return 3;
            }
        } else if (f == 1) {
            if (c==0)
                return 4;
            else if(c==1)
                return 5;
            else   return 6;
        }else{
            if(c==0)
                return 7;
            else if(c==1)
                return 8;
            else
                return 9;
        }
    }
    private int posicionGanadorFila(char c){
        int contador = 0;
        int i = 0;
        int j =0;
        int posGanador = -1;

        int posFVacia,posCVacia;
        posFVacia =posCVacia =-1;
        while (i < this.tablero.getTamF() ) {
            while (j < this.tablero.getTamC() && (this.tablero.getCasillero()[i][j].estaVacio() || this.tablero.getCasillero()[i][j].getContenido() == c) )  {
                if (this.tablero.getCasillero()[i][j].getContenido() == c) {
                    contador += 1;
                }
                else {
                    posFVacia =i;
                    posCVacia = j;

                }if(contador == 2 && posFVacia != -1){
                    posGanador = convertirPos(posFVacia,posCVacia);
                    break;
                }
                j++;
            }
            if(posGanador == -1){
                i++;
                j=0;
                contador = 0;
                posFVacia = posCVacia=-1;
            }
            else{
                break;
            }

        }
        return posGanador;



    }
    private int posicionGanadorColumna(char c){
        int contador = 0;
        int i = 0;
        int j =0;
        int posGanador = -1;
        int posFVacia,posCVacia;
        posFVacia =posCVacia =-1;
        while (i < this.tablero.getTamC() && (this.tablero.getCasillero()[j][i].estaVacio() || this.tablero.getCasillero()[j][i].getContenido() == c) ) {
            while (j < this.tablero.getTamF() && (this.tablero.getCasillero()[j][i].estaVacio() || this.tablero.getCasillero()[j][i].getContenido() == c) )  {
                if (this.tablero.getCasillero()[j][i].getContenido() == c) {
                    contador += 1;
                }
                else {
                    posFVacia =j;
                    posCVacia = i;

                }if(contador == 2 && posFVacia != -1){
                    posGanador = convertirPos(posFVacia,posCVacia);
                    break;
                }
                j++;
            }
            if(posGanador == -1)
                {
                i++;
                j=0;
                contador = 0;
                posFVacia=posCVacia=-1;
            }
            else{
                break;
            }
        }
        return posGanador;
    }
    private int posicionGanadorDiagonal(char c){
        int contador = 0;
        int i = 0;
        int posGanador = -1;
        int posFvacia,posCvacia;
        posFvacia=posCvacia=-1;
        boolean proxCasilleroVacio = false;
        while (i < this.tablero.getTamC() && (this.tablero.getCasillero()[i][i].estaVacio() || this.tablero.getCasillero()[i][i].getContenido() == c) ) {
            if (this.tablero.getCasillero()[i][i].getContenido() == c) {
                contador += 1;
            } else {
                posFvacia = i;
                posCvacia = i;
            }
            if(contador == 2 && posFvacia != -1) {
                posGanador = convertirPos(posFvacia, posCvacia);
                break;
            }
            i++;
        }
        if(posGanador != -1){
            return posGanador;
        }
        else{
            posFvacia =posCvacia = -1;
            i =0;
            contador =0;
            while (i < this.tablero.getTamF() && (this.tablero.getCasillero()[i][2-i].estaVacio() || this.tablero.getCasillero()[i][2-i].getContenido() == c) ) {
                if (this.tablero.getCasillero()[i][2-i].getContenido() == c) {
                    contador += 1;
                }
                else {
                    posFvacia = i;
                    posCvacia = 2-i;
                }if(contador == 2 && posFvacia != -1 ) {
                    posGanador = convertirPos(posFvacia,posCvacia);
                    break;
                }
                i++;
            }
            return posGanador;
        }


    }
}