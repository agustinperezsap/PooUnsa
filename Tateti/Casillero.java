package Tateti;

public class Casillero {
    private char contenido;
    private boolean estaVacio;

    Casillero(){
        this.estaVacio = true;
        this.contenido = ' ';
    }
    public void setContenido(char c){
        this.contenido = c;
        this.estaVacio = false;
    }
    public boolean estaVacio(){
        return this.estaVacio;
    }

    public char getContenido(){
        return this.contenido;
    }
    public String toString(){
        String cadena = "";
        cadena += this.contenido;
        return cadena ;
    }
}
