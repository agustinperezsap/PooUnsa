package test;

import datos.Fecha;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestFechas {

    public static void main(String[] args) {
        LocalDate facha; // solo la fecha
        LocalTime hora; // solo la hora 
        LocalDateTime fechaYHora; // fecha y hora 

        fechaYHora = LocalDateTime.now();
        // imprimo fecha y hora del momento en el que se ejecuta 
        System.out.println("fechaYHora = " + fechaYHora);
        // Dar formato deseado 
        System.out.println("");
        DateTimeFormatter formato;
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Fecha y hora: " + fechaYHora.format(formato));
        //Setenado  de ante mano una hora 
        fechaYHora = LocalDateTime.of(2023, 10, 18, 00, 00);
        
        System.out.println("Cumple de la loca <3  = " + fechaYHora.format(formato));
        
        Fecha fecha1 = new Fecha();
        System.out.println("");
        System.out.println(fecha1);
        System.out.println("");
        Fecha fecha2 = new Fecha(2023, 10, 18, 00, 00);
        System.out.println(fecha2);
        fecha2.setAnio(2024);
        
    }
}
