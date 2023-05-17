
package datos;


public class Paciente {
    private String nombre; 
    private int dni;
    private String domicilio;
    private String telefono;
    private Fecha fecha;

    public Paciente() {
    }

    public Paciente(String nombre, int dni, String domicilio, String telefono, Fecha fecha) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fecha = fecha;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", fecha=" + fecha + '}';
    }
    
    
}
