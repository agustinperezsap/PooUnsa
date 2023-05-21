package datos;

import java.util.ArrayList;

public class Equipo {

    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Tecnico tecnico;

    public Equipo() {
        this.tecnico = new Tecnico();
    }

    public void agregarJugador(Jugador jugador) {
        if (this.jugadores.size() < 10) {
            this.jugadores.add(jugador);
        } else {
            System.out.println("Ya no puede agregar mas jugadores");
        }
    }

    public void eliminarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo{jugadores=").append(jugadores);
        sb.append('}');
        return sb.toString();
    }

}
