
package datos;


public class Empleado {
    private String nombre; 
    private int dni;
    private String telefono;
    private Fecha antiguedad;
    private long saldo;
    
    public Empleado(){
        
    }

    public Empleado(String nombre, int dni, String telefono, Fecha antiguedad, long saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.antiguedad = antiguedad;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", antiguedad=" + antiguedad + ", saldo=" + saldo + '}';
    }
    
    
   
    
}
