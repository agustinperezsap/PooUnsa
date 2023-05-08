package test;

import datos.*;

public class Main {

    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        System.out.println("Instrucciones del juego:\n"
                + "Cualquier persona que cuente con dinero puede participar como jugador en el juego.\n"
                + "1. La mesa cuenta con tres sombreros y una moneda. El dueño del juego coloca la moneda"
                + "debajo de un sombrero especifico y procede a mover los sombreros unos con otros para "
                + "despistar al jugador.\n"
                + "2. El jugador elige uno de los sombreros donde se supone que esta la moneda y pone en "
                + "la mesa la plata que apuesta a esa jugada. Si escoge bien el sombrero entonces gana el "
                + "doble de lo apostado, mientras que si pierde, el dueño se queda con lo apostado. El "
                + "jugador puede quedarse o seguir apostando.");
        mesa.jugar();
    }
}
