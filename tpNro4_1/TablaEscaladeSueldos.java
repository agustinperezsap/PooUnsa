package tpNro4_1;

public class TablaEscaladeSueldos {
	private double[][] tablaDeSueldos = {{28.16,32.18,38.89,44.92,48.27},{54.98,59.67,64.37,70.40,75.09},{91.18,97.89,101.91,108.21,115.32},{134.10,160.91,187.73,214.55,268.16}};
	
	public double promPagaHoraria(int f, int c) {
		return (this.tablaDeSueldos[f][c] * 8);
	}
	
	public double diferenciaPagaHoraria(int f) {
		return this.tablaDeSueldos[f][4] - this.tablaDeSueldos[f][0];
	}
	
	public void aumentoPorNivel(int f, double monto) {
		for(int c=0; c<this.tablaDeSueldos[f].length; c++) {
			this.tablaDeSueldos[f][c] += monto;
		}
	}
	
	public String toString() {
		String cadena = "";
		for(int f=0;f<this.tablaDeSueldos.length;f++) {
			for(int c=0; c<this.tablaDeSueldos[f].length; c++) {
				cadena += this.tablaDeSueldos[f][c] + " ";
			}

			cadena += "\n";
		}
		return cadena;
	}

}

//{{28.16,32.18,38.89,44.92,48.27},{54.98,59.67,64.37,70.40,75.09},{91.18,97.89,101.91,108.21,115.32},{134.10,160.91,187.73,214.55,268.16}}