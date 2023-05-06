package datos;
//Imagine el siguiente escenario:
//La OMS esta simulando el comportamiento de un Virus, para 
//ell o necesita controlar los intentos necesarios para
//neutralizarlo.
//Para simplificar el ejercicio se sabe que el virus tiene un valor
//entero para su adn, pero esta informacion no se conoce, ya que 
//el Virus al crearse carga este valor aleatoriamenteen en un
//rango entre 1 y 10. Neutralizar el virus es equivalente a 
//acertar este valor. Si el virus no esta neutralizado es nocivo.
//Respete el diagrama de clases y resuelva el enunciado.

import java.util.Random;

public class Virus {

    public String nombre;
    private int adn;
    private boolean nocivo;

    public Virus() {
        Random random = new Random();
        this.adn = random.nextInt(10) + 1;
        this.nocivo = true;
    }

    public Virus(String nombre) {
        Random random = new Random();
        this.nombre = nombre;
        this.adn = random.nextInt(10) + 1;
        this.nocivo = true;
    }

    public boolean esNocivo() {
        if (this.nocivo) {
            return true;
        } else {
            return false;
        }
    }

    public void neutralizar(int adnNeutralizante) {

        if (this.adn == adnNeutralizante) {
            this.nocivo = false;
        }
    }

    @Override
    public String toString() {
        return "Virus{" + "nombre=" + nombre + ", nocivo=" + nocivo + '}';
    }

}
