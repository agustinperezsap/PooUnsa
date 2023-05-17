
package datos;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Fecha {
    private LocalDateTime fechaYHora;
    
    
    public Fecha(){
        this.fechaYHora = LocalDateTime.now();
    }

    public Fecha(int anio, int mes, int dia, int hora, int min){
        this.fechaYHora = LocalDateTime.of(anio, mes, dia, hora, min);
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
    
    
    @Override
    public String toString() {
        DateTimeFormatter formato;
        formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Fecha{" + "fecha y Hora=" + this.fechaYHora.format(formato) + '}';
    }
    
    
    
}
