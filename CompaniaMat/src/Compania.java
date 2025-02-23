/*Tania Ariadna Dominguez Palma
 * 06/nov/2021
 * Describe una compania con ventas todo el año de 4 departamentos
 */
public class Compania implements Comparable<Compania>{
	private String nombre;
	private String direccion;
	private double[][] ventas;
	private String [] NOM_MES = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	private String [] NOM_DEPTO = {"damas", "caballeros", "niños", "muebles"};
	private int numVentMes;
	private int numVentDep;
	private final int TOT_MESES = 12;
	private final int TOT_VENTAS = 4;
	
	Compania(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		ventas = new double[TOT_MESES][TOT_VENTAS];
		numVentMes = 0;
		numVentDep = 0;
		for (int j = 0; j < TOT_MESES; j++) {
			for (int i = 0; i < TOT_VENTAS; i++) {
				ventas[j][i] = 0;
			}
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getUnaVenta(String mes, String depto) {
		int posM, posD;
		double vent = -1;
		
		posM = ManejadorArreglosGenerico.busSecDesordenada(NOM_MES, TOT_MESES, mes);
		posD = ManejadorArreglosGenerico.busSecDesordenada(NOM_DEPTO, TOT_VENTAS, depto);
		if (posM > -1 && posD > -1) {
			vent = ventas[posM][posD];
		}
		return vent;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public boolean altaVentaDat(double vent, String mes, String depto) {
		int posM, posD;
		boolean alt = false;
		
		posM = ManejadorArreglosGenerico.busSecDesordenada(NOM_MES, TOT_MESES, mes);
		posD = ManejadorArreglosGenerico.busSecDesordenada(NOM_DEPTO, TOT_VENTAS, depto);
		if (posM > -1 && posD > -1) {
			ventas[posM][posD]+= vent;
			alt = true;
		}
		return alt;
	}
	
	public boolean altaVenta(double vent) {
		boolean alt = false;
		
		if (numVentMes < TOT_MESES){
			if (numVentDep < TOT_VENTAS) {
				ventas[numVentMes][numVentDep] = vent;
				alt = true;
				numVentDep++;
			}
			if (numVentDep == TOT_VENTAS) {
				numVentDep = 0;
				numVentMes++;
			}
		}
		return alt;
	}

	public String mesConMayorVenta(String depto) {
		int pos, posMay;
		String mes = "departamento no registrado";
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(NOM_DEPTO, TOT_VENTAS, depto);
		if (pos > -1) {
			posMay = ManejadorMatrices.posMaxCol(ventas, pos, TOT_MESES);
			mes = NOM_MES[posMay];
		}
		return mes;
	}
	
	public double promedioVentasUnMes(String mes) {
		int pos;
		double prom = 0;
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(NOM_MES, TOT_MESES, mes);
		if(pos > -1) {
			prom = ManejadorArreglos.promedio(ventas[pos], TOT_VENTAS);
		}
		return prom;
	}
	
	public double promedioVentasDepto(String depto) {
		int pos;
		double prom = -1, suma = 0;
		
		pos = ManejadorArreglosGenerico.busSecDesordenada(NOM_DEPTO, TOT_VENTAS, depto);
		if (pos > -1) {
			suma = ManejadorMatrices.sumaCol(ventas, pos, TOT_MESES);
			prom = suma / TOT_MESES;
		}
		return prom;
	}
	
	public String mesSinVentas() {
		int j = 0, i;
		boolean bus = false;
		String mes = "Hubo ventas durante todo el año";
		
		while(j < TOT_MESES && !bus){
			i = 0;
			while (i < TOT_VENTAS && ventas[j][i] == 0) {
				i++;
			}
			if (i == TOT_VENTAS) {
				bus = true;
				mes = NOM_MES[j];
			}
			j++;
		}
		return mes;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Compania Nombre: ");
		cad.append(nombre);
		cad.append("\n         Direccion: ");
		cad.append(direccion);
		cad.append("\n  DEPTOS:  \t");
		for (int i = 0; i < TOT_VENTAS; i++) {
			cad.append(NOM_DEPTO[i] + "\t");
			if (NOM_DEPTO[i].length()<8) {
				cad.append("\t");
			}
		}
		cad.append("\nMESES ");
		for (int j = 0; j < TOT_MESES; j++) {
			cad.append("\n" + NOM_MES[j] + "");
			for (int i = 0; i < TOT_VENTAS; i++) {
				cad.append("\t\t" + ventas[j][i]);
			}
		}
		return cad.toString();
	}
	
	public int compareTo (Compania otra) {
		return this.nombre.compareTo(otra.nombre);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compania other = (Compania) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
