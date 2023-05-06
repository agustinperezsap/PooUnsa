
public class Complejo {

    public double real;
    public double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo nro) {
        double real = this.real + nro.real;
        double imaginario = this.imaginario + nro.imaginario;
        return new Complejo(real, imaginario);

    }

    public Complejo restar(Complejo otro) {
        double realResta = this.real - otro.real;
        double imagResta = this.imaginario - otro.imaginario;
        return new Complejo(realResta, imagResta);
    }

    public void mostrar() {
        if (this.imaginario >= 0) {
            System.out.println(this.real + " + " + this.imaginario + "i");
        } else {
            System.out.println(this.real + " - " + (-1 * this.imaginario) + "i");
        }
    }
}
