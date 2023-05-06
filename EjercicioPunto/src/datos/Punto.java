
package datos;

public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distancia(Punto otro) {
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    public boolean estaDentroDelRadio(Punto centro, double radio) {
        return this.distancia(centro) <= radio;
    }
}
