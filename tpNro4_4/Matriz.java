package tpNro4_4;

public class Matriz {
	private double[][]	M;
	
	public Matriz(int f, int c) {
		M=new double[f][c];
	}
	
	public void setElem(int f, int c, double elem) {
		this.M[f][c]=elem;
	}
	
	public void copy(Matriz m) {
		this.M = m.M;
	}
	
	public  boolean existePos(int f, int c) {
		if(f>= this.M.length&&c>=this.M[f].length) {
			return true;
		}else return true;
	}
	
	public int getCantFil() {
		return this.M.length;
		
	}
	
	public int getCantCol() {
		return this.M[0].length;
	}
	
	public double getElem(int f, int c) {
		return this.M[f][c];
	}
	
	public Matriz clone() {
		Matriz m = new Matriz(this.M.length, this.M[0].length);
		for(int f=0; f<getCantFil();f++) {
			for( int c = 0; c<getCantCol();c++) {
				m.setElem(f, c, getElem(f,c));
			}
		}
		return m;
		
	}
	
	public boolean equals(Matriz m) {
		if(getCantFil() == m.getCantFil() && getCantCol() == m.getCantCol()) {
			for(int f = 0; f<getCantFil(); f++) {
				for (int c=0; c<getCantCol(); c++) {
					if(getElem(f,c) !=m.getElem(f, c)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean esCuadrada() {
		if(getCantFil() == getCantCol()) {
			return true;
		}else return false;
	}
	public boolean esIdentidad() {
		if(esCuadrada()) {
			for(int f = 0; f<getCantFil();f++) {
				for(int c = 0; c<getCantCol();c++) {
					if(f!=c) {
						if(getElem(f,c) !=0) {
							return false;
						}
					}else {
						if(getElem(f,c) !=1) {
							return false;
						}
					}
				}
			}
			return true;
		}else {
			System.out.println("La matriz no es cuadrada");
			return false;
		}
	}
	public boolean esTriangSup() {
		if(esCuadrada()) {
			for(int f = 0; f<getCantFil();f++) {
				for(int c = 0; c<getCantCol();c++) {
					if(f>c) {
						if(getElem(f,c) !=0) {
							return false;
						}
					}		
									}
			}
			return true;
		}else {
			System.out.println("La matriz no es cuadrada");
			return false;
		}
	}
	public boolean esTriangInf() {
		if(esCuadrada()) {
			for(int f = 0; f<getCantFil();f++) {
				for(int c = 0; c<getCantCol();c++) {
					if(f<c) {
						if(getElem(f,c) !=0) {
							return false;
						}
					}		
				}
			}
			return true;
		}else {
			System.out.println("La matriz no es cuadrada");
			return false;
		}
	}
	
	public boolean esSimetrica() {
		int x=0;
		if(esCuadrada()) {
			for(int f = 0; f<getCantFil();f++) {
				for(int c = x; c<getCantCol();c++) {
					if(getElem(f,c) != getElem(c,f)) {
						return false;
					}		
				}
				x++;
			}
			return true;
		}else {
			System.out.println("La matriz no es cuadrada");
			return false;
		}
	}
	
	public boolean esRala() {
		int cont=0;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				if(getElem(f,c) == 0) {
					cont++;
				}
			}
		}
		if(cont>=(Math.round((getCantFil()*getCantCol())/2))) {
			return true;
		}else return false;
	}
	public int cantElem(double elem) {
		int cont=0;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				if(getElem(f,c)==0) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public boolean estaElem(double elem) {
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				if(getElem(f,c)==elem) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Vector vectorMayores() {
		Vector vector = new Vector(getCantFil());
		double may=Double.MIN_VALUE;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				if(getElem(f,c)>may) {
					may = getElem(f,c);
				}
			}
			vector.setElem(f, may);
		}
		return vector;
	}
	
	public Matriz suma(Matriz m) {
		Matriz suma=new Matriz(getCantFil(), getCantCol());
		double elem;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				elem = getElem(f,c) + m.getElem(f, c);
				suma.setElem(f, c, elem);
			}
		}
		return suma;
	}
	
	/*public Matriz producto(Matriz m) {
		Matriz producto=new Matriz(getCantFil(), m.getCantCol());
		double elem;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				elem = getElem(f,c) * m.getElem(f, c);
				producto.setElem(f, c, elem);
			}
		}
		return producto;
	}
	*/
	public Matriz producto(Matriz m) {
		Matriz producto = new Matriz(getCantFil(), m.getCantCol());
		double elem = 0;
		for (int f= 0; f<producto.getCantFil(); f++) {
			for (int c = 0; c<producto.getCantCol(); c++) {
				for(int n = 0; n<getCantCol(); n++) {
					elem += getElem(f, n)*m.getElem(n, c);
				}
				producto.setElem(f, c, elem);
			}
		}
		return producto;
	}
	
	public Matriz productox1Escalar(double k) {
		Matriz producto = new Matriz(getCantFil(), getCantCol());
		double elem;
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				elem = getElem(f,c) * k;
				producto.setElem(f, c, elem);
			}
		}
		return producto;
	}
	
	public Matriz transpuesta() {
		Matriz transpuesta = new Matriz(getCantCol(),getCantFil());
		for (int f=0;f<getCantFil();f++) {
			for(int c=0; c<getCantCol();c++) {
				transpuesta.setElem(c, f, getElem(f,c));
			}
		}
		
		
		return transpuesta;
	}
	
	public void mostrar() {
		String cadena = "";
		for(int f=0;f<this.M.length;f++) {
			for(int c=0; c<this.M[f].length; c++) {
				cadena += this.M[f][c] + " ";
			}

			cadena += "\n";
		}
		System.out.println(cadena);
	}
	public String toString() {
		String cadena = "";
		for(int f=0;f<this.M.length;f++) {
			for(int c=0; c<this.M[f].length; c++) {
				cadena += this.M[f][c] + " ";
			}

			cadena += "\n";
		}
		return cadena;
	}
}
