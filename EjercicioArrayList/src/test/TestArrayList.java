package test;

import datos.*;
import java.util.Random;

public class TestArrayList {

    public static void main(String[] args) {
        Random random = new Random();
//        Tecnico tecnico = new Tecnico();
        Equipo linces = new Equipo();
        Fecha fechaNacimiento;
        Jugador j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
        int anio, mes, dia;
        int min = 40000000;
        int max = 42000000;
        
        for (int i = 0; i < 10; i++){
            anio = random.nextInt(2000 - 1998 + 1) + 1998;
            mes  = random.nextInt(12 - 1 + 1 ) + 1;
            if(mes == 2){
                dia = random.nextInt(28  - 1 + 1) + 1;
            }
            else{
                dia = random.nextInt(31 - 1 + 1) + 1;
            }
            int dni = random.nextInt(max - min + 1) + min;
            
            linces.agregarJugador(j1 = new Jugador(dni, "Nicolas", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j2 = new Jugador(dni, "Seba", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j3 = new Jugador(dni, "Pedro", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j4 = new Jugador(dni, "Agustin", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j5 = new Jugador(dni, "Lucas", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j6 = new Jugador(dni, "Maxi", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j7 = new Jugador(dni, "Diego", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j8 = new Jugador(dni, "Nahuel", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j9 = new Jugador(dni, "Leo", fechaNacimiento = new Fecha(anio, mes, dia)));
//            linces.agregarJugador(j10 = new Jugador(dni, "Franco", fechaNacimiento = new Fecha(anio, mes, dia)));
            
        }
        
        System.out.println(linces);
        
    }
}
