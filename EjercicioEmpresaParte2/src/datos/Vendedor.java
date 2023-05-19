package datos;

public class Vendedor extends Empleado {

    Auto auto;

    public Vendedor(Auto auto, String nombre, int dni, String telefono,
            Fecha antiguedad, long saldo) {
        super(nombre, dni, telefono, antiguedad, saldo);
        this.auto = auto;
    }

    public void incrementarSalario() {
        long saldo = this.getSalarioMensual();
        System.out.println("Salario: " + saldo);
        int tiempoActivo = this.getAntiguedad();
        long incremento = (long) ((saldo * 0.002) + tiempoActivo * 1200);
        this.setSalarioMensual(incremento);
        System.out.println("Salario aumentado, su nuevo salario es: " + this.getSalarioMensual());
    }

    @Override
    public String toString() {
        String datos = super.toString();
        return "Vendedor{" + "auto asignado = " + auto + "datos : " + datos + '}';
    }

}
