package datos;

public class Vendedor extends Empleado {

    Auto auto;

    public Vendedor(Auto auto, String nombre, int dni, String telefono, 
            Fecha antiguedad, long saldo) {
        super(nombre, dni, telefono, antiguedad, saldo);
        this.auto = auto;
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return "Vendedor{" + "auto asignado = " + auto +"datos : "+datos+ '}' ;
    }
    
    
    
}
