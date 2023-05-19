package tpNro4_4;

public class Vector {
	private double[]vector;
	
	public Vector(int f) {
		vector= new double[f];
	}

	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}
	public double getElem(int f) {
		return this.vector[f];
	}
	public void setElem(int f, double elem) {
		this.vector[f] = elem;
	}
	
}
