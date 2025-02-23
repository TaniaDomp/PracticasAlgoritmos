/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Representacion simplificada de una venta en un comercio
 */
public class Venta {
	private double monto;
	private String nomVendedor;
	
	public Venta(){	
	}
	
	public Venta(double monto, String nomVendedor) {
		this.monto = monto;
		this.nomVendedor = nomVendedor;
	}
	
	public double getMonto(){
		return monto;
	}
	
	public String getNomVendedor(){
		return nomVendedor;
	}
	
	public double CalculaComision() {
		double com;
		
		if (monto < 1000) {
			com = monto * 0.03;
		}
		else {
			com = monto * 0.05;
		}
		return com;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("\nVenta realizada por: ");
		cad.append(nomVendedor);
		cad.append("\nmonto: ");
		cad.append(monto);
		return cad.toString(); 
	}
	
	public int compareTo(Venta otro) {
		int res;
		
		if (this.monto ==otro.monto) {
			res =0; 
		}
		else {
			if (this.monto>otro.monto) {
				res = 1; 
			}
			else {
				res = -1; 
			}
		}
		return res;
	}
	
	public boolean equals(Venta otro) {
		boolean res;
		
		if (this.monto==otro.monto) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}

