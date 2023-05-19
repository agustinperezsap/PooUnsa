package tpNro4_2;


public class Main {

	public static void main(String[] args) {
		Cosecha cosecha = new Cosecha();
		int cosechado;
		for (int f=0; f<4; f++) {
			for(int c=0; c<12;c++) {
				cosechado=(int) Math.floor(Math.random()*(300-5+1)+5);
				cosecha.setCosecha(cosechado, f, c);
			}
		}
		System.out.println(cosecha.toString());
		cosecha.promedioAnual();
		System.out.println();
		cosecha.cosechaSuperior();
		System.out.println();
		cosecha.cosechaInferior();
		System.out.println();
		cosecha.mayorCosecha();
	}

}
