/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Describe una cuenta bancaria 
 */
public class CuentaBancaria {
	private String titular;
	private int numeroCuen;
	private double saldo;
	private static int consecutivoNumeroCuen = 123;
	
	public CuentaBancaria() {
		numeroCuen = consecutivoNumeroCuen;
		consecutivoNumeroCuen += 100;
	}
	
	public CuentaBancaria(String titular, double saldo) {
		this();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void setTitular(String titular) {
		this.titular=titular;
	}
	
	public double realizarRetiro(double retiro) {
		double ret;
		if (retiro <= saldo) {
			ret = saldo - retiro;
			saldo = ret;
		}
		else {
			ret = -1; 
		}
		return ret;
	}
	
	public double realizarDeposito(double deposito) {
		double depo;
		depo = saldo + deposito;
		saldo = depo;
		return depo;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder(); 
		
		cad.append("Cuenta Bancaria Nombre del titular: ");
		cad.append(titular);
		cad.append("\nNumero de cuenta: ");
		cad.append(numeroCuen);
		cad.append("\nSaldo: ");
		cad.append(saldo);
		
		return cad.toString();
	}
	
	public int compareTo(CuentaBancaria otro) {
		int res;
		
		if (this.saldo ==otro.saldo) {
			res =0; 
		}
		else {
			if (this.saldo>otro.saldo) {
				res = 1; 
			}
			else {
				res = -1; 
			}
		}
		return res;
	}
	
	public boolean equals(CuentaBancaria otro) {
		boolean res;
		
		if (this.saldo ==otro.saldo) {
			res = true; 
		}
		else {
			res = false;
		}
		
		return res;
	}
}
