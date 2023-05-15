
package datos;

import java.util.Scanner;

public class VentaSemanal {
    Scanner entrada = new Scanner(System.in);
    private double[] ventas;

    // Constructor sin parámetros, inicializa ventas con 0.0
    public VentaSemanal() {
        ventas = new double[7];
    }

    // Constructor con tamaño del arreglo, inicializa ventas con 0.0
    public VentaSemanal(int tam) {
        if (tam > 7) {
            tam = 7;
        }
        ventas = new double[tam];
    }

    // Constructor con arreglo de ventas
    public VentaSemanal(double[] ventas) {
        if (ventas.length > 7) {
            double[] ventasReducidas = new double[7];
            for (int i = 0; i < 7; i++) {
                ventasReducidas[i] = ventas[i];
            }
            this.ventas = ventasReducidas;
        } else {
            this.ventas = ventas;
        }
    }

    // Carga aleatoria de las ventas
    public void cargarVentas() {
//        Random r = new Random();
        double prod;
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese un producto: ");
            prod = entrada.nextDouble();
            ventas[i] = prod;
        }
        
    }

    // Calcula el total de las ventas en la semana
    public double totalVentasSemanal() {
        double total = 0.0;
        for (double venta : ventas) {
            total += venta;
        }
        return total;
    }

    // Calcula el promedio de las ventas en la semana
    public double promedioVentasSemanal() {
        return totalVentasSemanal() / ventas.length;
    }

    // Determina el día con más ventas
    public String diaConMasVentas() {
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        int indiceMax = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventas[indiceMax]) {
                indiceMax = i;
            }
        }
        return diasSemana[indiceMax];
    }

    public void muestraventas(VentaSemanal v){
        for (double venta : ventas) {
            System.out.println("venta = " + venta);
        }
    }
    
    
    
    
}
