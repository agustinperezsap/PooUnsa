package datos;

public class Sombrero {

    private int moneda;
    private int numeroSombrero;

    public Sombrero(int n) {
        this.numeroSombrero = n;
        this.moneda = 0;
    }

    public int getNumeroSombrero() {
        return numeroSombrero + 1;
    }

    public void setNumeroSombrero(int numeroSombrero) {
        this.numeroSombrero = numeroSombrero;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }

    public int getMoneda() {
        return moneda;
    }

    @Override
    public String toString() {
        return "Sombrero{" + "numero=" + (1 + numeroSombrero) + ", moneda=" + moneda + '}';
    }
}
