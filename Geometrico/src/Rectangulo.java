/*Tania Ariadna Dominguez Palma
 * 10/sep/2021
 * Decribe una figura en forma de circulo
 */
public class Rectangulo {
	private double base, altura;
	
	public Rectangulo() {	
	}
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		double a;		
		a = base * altura;
		return a;
	}
	
	public double perimetro() {
		double p;		
		p = 2 * base + 2* altura;
		return p;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("\nRectangulo con base y altura: " + base + ", " + altura);
		return cad.toString(); 
	}
	
	public int compareTo(Rectangulo otro) {
		int res;
		
		if (this.area() ==otro.area()) {
			res = 0; 
		}
		else {
			if (this.area()>otro.area()) {
				res = 1; 
			}
			else {
				res = -1; 
			}
		}
		return res;
	}
	
	public boolean equals(Rectangulo otro) {
		boolean res;
		
		if (this.area()==otro.area()) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
