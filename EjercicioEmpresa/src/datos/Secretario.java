
package datos;

public class Secretario extends Empleado{
    private long nroFax;
    private int nroDespacho;

    public Secretario(long nroFax, int nroDespacho, String nombre, int dni, String telefono, Fecha antiguedad, long saldo) {
        super(nombre, dni, telefono, antiguedad, saldo);
        this.nroFax = nroFax;
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        String info = super.toString();
        return "Secretario{" + "nroFax=" + nroFax + ", nroDespacho=" + nroDespacho +"Informacion: " + info +'}';
    }
    
    
    
    
}
