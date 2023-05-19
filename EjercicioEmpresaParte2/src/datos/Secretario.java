package datos;

public class Secretario extends Empleado {

    private long nroFax;
    private int nroDespacho;

    public Secretario(long nroFax, int nroDespacho, String nombre, int dni, String telefono, Fecha antiguedad, long salarioMensual) {
        super(nombre, dni, telefono, antiguedad, salarioMensual);
        this.nroFax = nroFax;
        this.nroDespacho = nroDespacho;
    }

    @Override
    public void incrementarSalario() {
        long saldo = this.getSalarioMensual();
        System.out.println("Salario: " + saldo);
        int tiempoActivo = this.getAntiguedad();
        long incremento = (long) ((saldo * 0.001) + tiempoActivo * 1000);
        this.setSalarioMensual(incremento);
        System.out.println("Salario aumentado, su nuevo salario es: " + this.getSalarioMensual());
    }

    @Override
    public String toString() {
        String info = super.toString();
        return "Secretario{" + "nroFax=" + nroFax + ", nroDespacho=" + nroDespacho + "Informacion: " + info + '}';
    }

}
