/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Clase que describe a una fruta
 */
public class Fruta {
	private int claveI;
	private static int consClaveI = 2000;
	private String nombre;
	private String color;
	private String ciuO;
	private double cosK;
	
	public Fruta() {
		claveI = consClaveI;
		consClaveI ++;
	}
	
	public Fruta(String nombre, String color, String ciuO, double cosK) {
		this();
		this.nombre = nombre;
		this.color = color;
		this.ciuO = ciuO;
		this.cosK = cosK;
	}
	
	public int getClaveI() {
		return claveI;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getCiuO() {
		return ciuO;
	}
	
	public double getCosK() {
		return cosK;
	}
	
	public void setCosK(double cosK) {
		this.cosK = cosK;
	}
	
	public double calculaPorDes(double compra) {
		double des;
		
		if (compra < 1500) {
			des = 0;
		}
		else {
			if (compra >= 1500 && compra < 10000) {
				des = (compra - 1500)/8500*10;
			}
			else {
				des = 10;
			}
		}
		return des;
	}
	
	public double calculaCosto(int kil){
		double cos;
		
		cos = this.cosK * kil;
		return cos;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Fruta Clave:");
		cad.append(claveI);
		cad.append("\n      Nombre:");
		cad.append(nombre);
		cad.append("\n      Color:");
		cad.append(color);
		cad.append("\n      Ciudad de origen:");
		cad.append(ciuO);
		cad.append("\n      Costo por kilo:");
		cad.append(cosK);
		
		return cad.toString();
	}
	
	public int compareTo (Fruta otro) {
		int res;
		
		if(this.claveI== otro.claveI) {
			res = 0;
		}
		else {
			if (this.claveI > otro.claveI) {
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (Fruta otro) {
		boolean res;
		
		if(this.claveI== otro.claveI) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
