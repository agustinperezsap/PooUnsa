package tpNro4_2;

public class Cosecha {
	private int[][] cosecha;
	
	public Cosecha() {
		this.cosecha = new int[4][12]; //f: arroz, avena, cebada, trigo. C:meses
	}

	public void setCosecha(int[][] cosecha) {
		this.cosecha = cosecha;
	}
	public void setCosecha(int cosecha, int f, int c) {
		this.cosecha[f][c] = cosecha;
	}
	
	public int getCosecha(int f, int c) {
		return this.cosecha[f][c];
	}
	
	private double promedio(int f) {
		double prom = 0;
		for(int c=0; c<this.cosecha[f].length; c++) {
			prom +=this.cosecha[f][c];
		}
		return prom/this.cosecha[f].length;
	}
	public void promedioAnual() {
		double prom;
		for (int f=0; f<this.cosecha.length; f++) {
			prom = promedio(f);
			switch(f) {
			case 0: System.out.println("Promedio de cosecha anual de arroz: " + prom); break;
			case 1: System.out.println("Promedio de cosecha anual de avena: " + prom); break;
			case 2: System.out.println("Promedio de cosecha anual de cebada: " + prom); break;
			case 3: System.out.println("Promedio de cosecha anual de trigo: " + prom); break;
			}
		}
	}
	private String cosechaSupInfString(int f, String s) {
		if(s=="superior") {
			switch(f) {
			case 0: return "Los meses con una cosecha "+s+" de arroz al promedio anual son: ";
			case 1:return "Los meses con una cosecha "+s+" de avena al promedio anual son: ";
			case 2: return "Los meses con una cosecha "+s+" de cebada al promedio anual son: ";
			case 3: return "Los meses con una cosecha "+s+" de trigo al promedio anual son: ";
			default: return "";
			}
		}else {
			switch(f) {
		case 0: return "Los meses con una cosecha "+s+" de arroz al promedio anual son: ";
		case 1:return "Los meses con una cosecha "+s+" de avena al promedio anual son: ";
		case 2: return "Los meses con una cosecha "+s+" de cebada al promedio anual son: ";
		case 3: return "Los meses con una cosecha "+s+" de trigo al promedio anual son: ";
		default: return "";
		}
		}
	
	}
	private String mes(int c) {
		switch(c) {
		case 0: return "enero "; 
		case 1: return "febrero "; 
		case 2: return "marzo "; 
		case 3: return "abril "; 
		case 4: return "mayo "; 
		case 5: return "junio "; 
		case 6: return "julio "; 
		case 7: return "agosto "; 
		case 8: return "septiembre "; 
		case 9: return "octubre "; 
		case 10: return "noviembre "; 
		case 11: return "diciembre "; 
		default: return "";
		}
	}
	private String grano(int f) {
		switch(f) {
		case 0: return "arroz ";
		case 1:return "avena ";
		case 2: return "cebada ";
		case 3: return "trigo ";
		default: return "";
		}
	}
	private void cosechaSupInf(String s) {
		double prom;
		String cadena;
		for(int f= 0; f<this.cosecha.length; f++) {
			cadena = cosechaSupInfString(f, s);
			prom = promedio(f);
			for(int c=0; c<this.cosecha[f].length; c++) {
				if(this.cosecha[f][c]> prom&&s=="superior") {
					cadena += mes(c);
				}else if(s=="inferior"&&this.cosecha[f][c]<prom) {
					cadena += mes(c);
				}
			}
			System.out.println(cadena);
		}		
	}
	
	public void cosechaInferior() {
		cosechaSupInf("inferior");		
	}
	public void cosechaSuperior() {
		cosechaSupInf("superior");
	}
	
	public void mayorCosecha() {
		int mayor;
		String cadena="";
		for(int f=0;f<4;f++) {
			mayor=Integer.MIN_VALUE;
			for(int c=0;c<12;c++) {
				if(this.cosecha[f][c]>mayor) {
					mayor = this.cosecha[f][c];
					cadena=mes(c);
				}
			}
			System.out.println("El mes con mayor cosecha de "+grano(f)+"es "+ cadena + "con "+mayor+" toneladas");			
		}
	}
	
	public String toString() {
		String cadena = "";
		for(int f=0;f<this.cosecha.length;f++) {
			for(int c=0; c<this.cosecha[f].length; c++) {
				cadena += this.cosecha[f][c] + " ";
			}

			cadena += "\n";
		}
		return cadena;
	}

}
//f: 0:Arroz, 1: avena, 2: cebada, 3: trigo.