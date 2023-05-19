package Tateti;

public class Jugador {

    Jugador(Tablero tablero){
        this.tablero = tablero;

    }
    protected String nombre;
    protected char marca;

    protected Tablero tablero;

    public char getMarca(){
        return this.marca;
    }
    public void setMarca(char c){
        this.marca = c;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void jugar(Tablero tablero){};

    public int convertirF(int entrada){
        switch(entrada){
            case 1:
            case 2:
            case 3:
                return 0;

            case 4:
            case 5:
            case 6:
                return 1;

            case 7:
            case 8:
            case 9:
                return 2;

            default:
                return -1;
        }
    }

    public int convertirC(int entrada){
        switch(entrada){
            case 1:
            case 4:
            case 7:
                return 0;

            case 2:
            case 5:
            case 8:
                return 1;

            case 3:
            case 6:
            case 9:
                return 2;

            default:
                return -1;
        }
    }

    public String toString(){
        String resp = "";
        resp += this.nombre;
        return resp;
    }
}
