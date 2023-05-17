
package datos;

public class Internado extends Paciente{
    private Fecha fechaAlta;

    public Internado(Fecha fechaAlta, String nombre, int dni, String domicilio, String telefono, Fecha fecha) {
        super(nombre, dni, domicilio, telefono, fecha);
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        String dato = super.toString();
        return "Internado{" + "fechaAlta=" + fechaAlta + " Paciente: "+ dato +'}';
    }
    
    
    
}
