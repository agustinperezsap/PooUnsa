
package datos;


public class Ambulatorio extends Paciente{
    private String observacion;

    public Ambulatorio(String observacion, String nombre, int dni, String domicilio, String telefono, Fecha fecha) {
        super(nombre, dni, domicilio, telefono, fecha);
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return " Ambulatorio{" + "observacion = " + this.observacion + " Paciente: "+ datos +'}';
    }
    
    
    
}
