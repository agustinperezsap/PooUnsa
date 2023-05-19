package tpNro4_4;

public class Main {

	public static void main(String[] args) {
		Matriz m1 = new Matriz(3,2);
		Matriz m2 = new Matriz(5,5);
		Matriz m3 = new Matriz(2,1);
		Matriz m4;
		double d;
		
		
		
		for (int f=0; f<m1.getCantFil(); f++) {
			for(int c=0; c<m1.getCantCol();c++) {
				d= Math.floor(Math.random()*(20-5+1)+5);
				m1.setElem(f, c, d);
			}
		}
		for (int f=0; f<m3.getCantFil(); f++) {
			for(int c=0; c<m3.getCantCol();c++) {
				d= Math.floor(Math.random()*(20-5+1)+5);
				m3.setElem(f, c, d);
			}
		}
		for (int f=0; f<m2.getCantFil(); f++) {
			for(int c=0; c<m2.getCantCol();c++) {
				if(f!=c) {
					m2.setElem(f, c, 0);
				}else m2.setElem(f, c, 1);
			}
		}
		System.out.println(m1.toString());

		System.out.println(m1.esIdentidad());
		System.out.println();/*
		System.out.println(m2.toString());

		System.out.println(m2.esIdentidad());
*/
		System.out.println();

		System.out.println(m3.toString());
		/*
		System.out.println(m3.esIdentidad());
		System.out.println("La matriz es triangular? (m1 y m2)");
		System.out.println(m1.esTriangSup());
		System.out.println(m2.esTriangSup());
		
		System.out.println();
		System.out.println("La matriz es simetrica? (m1 y m2)");
		System.out.println(m1.esSimetrica());
		System.out.println(m2.esSimetrica());
		System.out.println();
		System.out.println(m1.equals(m2));
		m1.copy(m2);
		System.out.println();
		System.out.println(m1.toString());

		System.out.println(m1.esIdentidad());

		System.out.println(m1.equals(m2));
		*/
		m4 = m1.producto(m3);
		System.out.println("m4: \n"+m4.toString());
		
		m4 = m1.productox1Escalar(2);
		System.out.println("m4: \n"+m4.toString());
		m4 = m1.transpuesta();
		System.out.println("m4: \n"+m4.toString());
		m4.mostrar();
	}

}
//hay un caso curioso si se usa el m3 = m1.clone();, ya que deja al m3 como matriz cuadrada...