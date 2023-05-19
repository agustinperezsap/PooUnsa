package Tateti;
import java.util.Random;

public class Tablero {
    private Casillero[][] casilleros;

    private int tamF;
    private int tamC;

    private Jugador ganador;
    private Jugador[] jugadores;

    private char[] marcas;

    private int proxJugador;
    Tablero() {
        this.casilleros = new Casillero[3][3];
        this.marcas = new char[2];
        this.marcas[0] = 'X';
        this.marcas[1] = 'O';
        cargaTablero();
        this.tamC = this.tamF = 3;
        this.jugadores = new Jugador[2];
        this.jugadores[0]= new Humano(this);
        this.jugadores[1]=new Computadora(this);
        this.ganador = null;
        this.proxJugador = generaProximoJugador();
    }

    private int generaProximoJugador(){
        Random rand = new Random();
        int resp = rand.nextInt(2);
        return resp;
    }
    private void setProximoJugador(){
        if(this.proxJugador == 0)
            this.proxJugador = 1;
        else
            this.proxJugador = 0;
    }

    public boolean estasLleno() {
        int i = 0;
        int j = 0;

        while (i < this.tamF && !(this.casilleros[i][j].estaVacio())) {
            while (j < this.tamC && !(this.casilleros[i][j].estaVacio()))
                j++;
            i++;
            if(i< this.tamF)
                j = 0;
        }

        if (i == this.tamF && j == this.tamC)
            return true;
        else
            return false;
    }
    public Casillero[][] getCasillero(){
        return this.casilleros;
    }

    public String toString() {
        String cadena = "";
        for (int i = 0; i < this.tamF; i++) {
            for (int j = 0; j < this.tamC; j++) {
                cadena += "|__ " + this.casilleros[i][j].toString() + " __|";
                cadena += " ";
            }
            cadena += "\n";
        }
        return cadena;
    }

    private void cargaTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.casilleros[i][j] = new Casillero();
            }
        }

    }

    public boolean ganoAlguien() {
        if (buscaFilas(this.marcas[0]) || buscaColumnas(this.marcas[0]) || buscaDiagonales(this.marcas[0])) {
            return true;
        } else if(buscaFilas(this.marcas[1]) || buscaColumnas(this.marcas[1]) || buscaDiagonales(this.marcas[1]) ) {
            return true;
        }
        else
            return false; //nadie gano
    }




    private boolean buscaFilas(char c) {
        int resp = 0;

        int i = 0;
        while (i < this.tamF && resp < 3) {
            for (int j = 0; j < this.tamC; j++) {
                if (this.casilleros[i][j].getContenido() == c) {
                    resp += 1;
                }
            }
            i++;
            if(resp < 3)
                resp = 0;
        }
        if (resp == 3) {
            if(this.jugadores[0].getMarca() == c){
                this.ganador = this.jugadores[0];
            }
            else{
                this.ganador = this.jugadores[1];
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean buscaColumnas(char c) {
        int resp = 0;
        int i = 0;
        while (i < this.tamC && resp < 3) {
            for (int j = 0; j < this.tamF; j++) {
                if (this.casilleros[j][i].getContenido() == c) {
                    resp += 1;
                }
            }
            i++;
            if (resp < 3)
                resp = 0;
        }
        if (resp == 3) {
            if(this.jugadores[0].getMarca() == c){
                this.ganador = this.jugadores[0];
            }
            else{
                this.ganador = this.jugadores[1];
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean buscaDiagonales(char c){
        int contador =0;
        boolean respuesta = false;
        //buscar en la 1er diagonal principal
        for (int i=0;i<this.tamF;i++){
            if(c == this.casilleros[i][i].getContenido())
                contador += 1;
        }
        if(contador < this.tamF){
            contador = 0;
            for (int i=0;i<this.tamF;i++){
                if(c == this.casilleros[i][this.tamC-1-i].getContenido())
                        contador += 1;
                }
        }
        if(contador == this.tamF){
            if(this.jugadores[0].getMarca() == c){
                this.ganador = this.jugadores[0];
            }
            else{
                this.ganador = this.jugadores[1];
            }
            return true;
        }else{
            return false;
        }
    }
    public Jugador[] getJugadores(){
        return this.jugadores;
    }

    private boolean tableroLleno(){

        int i,j ;
        i = j = 0;
        while(i<this.tamF && !this.casilleros[i][j].estaVacio()){
            while(j<this.tamC && !(this.casilleros[i][j].estaVacio()) )
                j++;
            i++;
            j=0;
        }
        if(i == this.tamF){
            return true;
        }
        else
            return false;
    }

    public void jugar(){
        while(!estasLleno() && !ganoAlguien()) {
            this.jugadores[this.proxJugador].jugar(this);
            if (ganoAlguien() || estasLleno()) {
                System.out.println("El juego Termino!");
                if (this.ganador != null) {
                    System.out.println("Felicidades Jugador: " + this.ganador + " has ganado!");
                } else {
                    System.out.println("Es un empate.");
                }
            } else {
                setProximoJugador();
                this.jugadores[this.proxJugador].jugar(this);
                if (ganoAlguien() || estasLleno()) {
                    System.out.println("El juego Termino!");
                    if (this.ganador != null) {
                        System.out.println("Felicidades Jugador: " + this.ganador + " has ganado!");
                    } else {
                        System.out.println("Es un empate.");
                    }

                } else {
                    setProximoJugador();
                }
            }
        }
    }

    public int getTamF(){
        return this.tamF;
    }
    public int getTamC(){
        return this.tamC;
    }

}
