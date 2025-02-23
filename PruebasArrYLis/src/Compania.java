import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 29/sep/2021
 * Clase que describe una compania que calcula sus ventas 
 */
public class Compania {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String director;
	private double[] ventas;
	private final String [] MESES= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	private int cantVentas;
	private final int TOTAL_MESES = 12;
	
	public Compania() {
		ventas = new double[TOTAL_MESES];
		cantVentas = 0;
	}
	
	public Compania(String nombre, String direccion, String ciudad, String director) {
		this();
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
	}
	
	public Compania(String nombre, String direccion, String ciudad, String director, int tam) {
		this.cantVentas = 0;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.director = director;
		ventas = new double[tam];
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	public double getUnaVenta(int mes) {
		double canV = -1;
		
		if (mes >= 1 && mes<= cantVentas) {
			canV = ventas[mes-1];
		}
		return canV;
	}
	
	public void setUnaVenta(int indice, double venta) {
		if (indice >= 0 && indice < cantVentas) {
			this.ventas[indice] = venta;
		}
	}
	
	public boolean altaVenta(double vent) {
		boolean cab;
		
		if(cantVentas < ventas.length) {
			ventas[cantVentas] = vent;
			cantVentas ++;
			cab = true;
		}
		else {
			cab = false;
		}
		return cab;
	}
	
	public double totalMontoVentas() {
		double tot;
		
		tot = ManejadorArreglos.suma(ventas, cantVentas);
		return tot;
	}
	
	public double promedio() {
		double prom;
		
		prom = ManejadorArreglos.promedio(ventas, cantVentas);
		return prom;
	}
	
	public String mesMayVentas() {
		int may;
		String mesMay;
		
		may = ManejadorArreglos.posMayor(ventas, cantVentas);
		mesMay = MESES[may];
		return mesMay;
	}
	
	public String mesMenVentas() {
		int men;
		String mesMen;
		
		men = ManejadorArreglos.posMenor(ventas, cantVentas);
		mesMen = MESES[men];
		return mesMen;
	}
	
	public int cuantosArribaPromedio() {
		double prom; 
		int contM;
		
		prom = ManejadorArreglos.promedio(ventas, cantVentas);
		contM = ManejadorArreglos.cuantosMayX(ventas, cantVentas, prom);
		return contM;
	}
	
	public int cuantosDebajoPromedio() {
		double prom;
		int contM;
		
		prom = ManejadorArreglos.promedio(ventas, cantVentas);
		contM = ManejadorArreglos.cuantosMenX(ventas, cantVentas, prom);
		return contM;
	}
	
	public String cualesMesesMayProm() {
		ArrayList<Integer> indices;
		StringBuilder cad = new StringBuilder();
		double prom;
		int ind;
		
		prom = ManejadorArreglos.promedio(ventas, cantVentas);
		indices = ManejadorArreglos.cualesMayX(ventas, cantVentas, prom);
		for (int i = 0; i < indices.size(); i++) {
			ind = indices.get(i);
			cad.append(MESES[ind] + "\t");
		}
		return cad.toString();
	}
	
	public String mesConVenta(double monto) {
		String mes;
		int ind;
		
		ind = ManejadorArreglos.busSecDesordenada(ventas, cantVentas, monto);
		if (ind >= 0) {
			mes = MESES[ind];
		}
		else {
			mes = "Venta no encontrada";
		}
		return mes;
	}
	
	public double ventaEnElMes(String mes) {
		double vent;
		int i = 0;
		
		while (i<cantVentas && !mes.equalsIgnoreCase(MESES[i])) {
			i++;
		}
		if (i == cantVentas) {
			vent = -1;
		}
		else {
			vent = ventas[i];
		}
		return vent;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Compania Nombre:");
		cad.append(nombre);
		cad.append("\n         Direccion:");
		cad.append(direccion);
		cad.append("\n         Ciudad:");
		cad.append(ciudad);
		cad.append("\n         Director:");
		cad.append(director);
		cad.append("\n         Ventas registradas: ");
		cad.append(cantVentas);
		for (int i= 0; i < cantVentas; i++) {
			cad.append("\n         Ventas del mes " + MESES[i] + ": ");
			cad.append(ventas[i]);
		}
		return cad.toString();
	}
	
	public int compareTo(Compania otro) {
		int res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = 0;
		}
		else {
			if (this.nombre.compareTo(otro.nombre)>0){
				res = 1;
			}
			else {
				res = -1;
			}
		}
		return res;
	}
	
	public boolean equals (Compania otro) {
		boolean res;
		
		if (this.nombre.equals(otro.nombre)) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
