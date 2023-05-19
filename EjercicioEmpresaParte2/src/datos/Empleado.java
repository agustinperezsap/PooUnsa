
package datos;


public class Empleado {
    private String nombre; 
    private int dni;
    private String telefono;
    private Fecha antiguedad;
    private long salarioMensual;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, int dni, String telefono, Fecha antiguedad, long salarioMensual) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.antiguedad = antiguedad;
        this.salarioMensual = salarioMensual;
    }

    public int getAntiguedad() {
        return this.antiguedad.getAnio();
    }
    
    
    public Fecha getAntiguedadCompleta(){
        return this.antiguedad;
    }
    
    public void setAntiguedad(Fecha antiguedad) {
        this.antiguedad = antiguedad;
    }

    public long getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(long salarioMensual) {
        this.salarioMensual += salarioMensual;
    }
    
    

    public void incrementarSalario(){
       this.salarioMensual = this.salarioMensual ++;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", antiguedad=" + antiguedad.getAnio() + ", salarioMensual=" + salarioMensual + '}';
    }
    
    
}
