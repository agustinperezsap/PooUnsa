package tpNro4_1;

public class Main {

	public static void main(String[] args) {
		TablaEscaladeSueldos tabla = new TablaEscaladeSueldos();
		
		System.out.println("Promedio de f=2, c=3 :" + tabla.promPagaHoraria(2, 3));
		System.out.println(tabla.toString());
		System.out.println("Diferencia entre las pagas de nivel 3: " + tabla.diferenciaPagaHoraria(3) );
		System.out.println("Se aumenta 3,15 a los sueldos del nivel 1");
		tabla.aumentoPorNivel(1, 3.15);
		System.out.println(tabla.toString());
	}

}
