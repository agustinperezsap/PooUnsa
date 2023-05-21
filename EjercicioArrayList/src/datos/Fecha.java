
package datos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;


public class Fecha {
    private LocalDateTime fechaYHora;
    
    
    public Fecha(){
        this.fechaYHora = LocalDateTime.now();
    }

//    public Fecha(int anio, int mes, int dia, int hora, int min){
//        this.fechaYHora = LocalDateTime.of(anio, mes, dia, hora, min);
//    }
    
    public Fecha(int anio, int mes, int dia){
        this.fechaYHora = LocalDateTime.of(anio, mes, dia, 00, 00);
    }
    public int getAnio(){
        return this.fechaYHora.getYear();
    }
    
    public void setAnio(int anio){
        this.fechaYHora = this.fechaYHora.withYear(anio);
    }
    
    public int getMes(){
        return this.fechaYHora.getMonthValue();
    }
    
    public void setMes(int mes){
        this.fechaYHora = this.fechaYHora.withMonth(mes);
    }
    
    public int getDia(){
        return this.fechaYHora.getDayOfMonth();
    }
    
    public void setDia(int dia){
        this.fechaYHora = this.fechaYHora.withDayOfMonth(dia);
    }

    public int diferenciaDias(Fecha fechaComparacion) {
    LocalDateTime fechaActual = LocalDateTime.now();
    long tiempo = ChronoUnit.DAYS.between(this.fechaYHora, fechaComparacion.fechaYHora);
    return (int) tiempo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato;
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Fecha{" + "fecha y Hora=" + this.fechaYHora.format(formato) + '}';
    }
    
    
    
}
