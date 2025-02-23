/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Decribe una figura en forma de circulo
 */
public class Circulo {
	private double radio;
	
	public Circulo () {	
	}
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calculaArea() {
		double a;
		//a = 3.1416*radio*radio;
		
		a = Math.PI *Math.pow (radio, 2);
		return a;
	}
	
	public double perimetro () {
		return radio*2*Math.PI;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("\nCirculo con radio: " + radio);
		//cad.append(radio);
		return cad.toString(); //toString convierte a String
	}
	
	public int compareTo(Circulo otro) {
		int res;
		
		if (this.radio ==otro.radio) {
			res =0; 
		}
		else {
			if (this.radio>otro.radio) {
				res = 125; //1
			}
			else {
				res = -125; //-1
			}
		}
		return res;
	}
	
	public boolean equals(Circulo otro) {
		boolean res;
		
		if (this.radio==otro.radio) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
	
