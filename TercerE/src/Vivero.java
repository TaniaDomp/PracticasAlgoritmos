/*Tania Ariadna Dominguez Palma
 * 12/nov/2021
 * Clase que describe un vivero que permite almacenar Planta(s)
 */
public class Vivero {
	private String nombre;
	private Planta[][] plantas;
	private int [] numPlantas;
	private final int TOT_PLANTAS = 10;
	private final int TOT_TIPOSC = 2;
	private final char[] NOM_TIPOSC = {'a', 'b'};
	
	public Vivero(String nombre) {
		this.nombre = nombre;
		plantas = new Planta[TOT_PLANTAS][TOT_TIPOSC];
		numPlantas = new int[TOT_TIPOSC];
		for (int i = 0; i < TOT_TIPOSC; i++) {
			numPlantas[i] = 0;
		}
	}
	
	public boolean altaPlanta(String nombre, String luz, double temperatura, double mlAguaDiarios, char consumo) {
		int i = 0;
		boolean alt = false;
		Planta pl = new Planta(nombre, luz, temperatura, mlAguaDiarios);
		
		while (i < TOT_TIPOSC && NOM_TIPOSC[i] != consumo) {
			i++;
		}
		if (i < TOT_TIPOSC) {
			if (numPlantas[i] < TOT_PLANTAS) {
				plantas[numPlantas[i]][i] = pl;
				numPlantas[i]++;
				alt = true;
			}
		}
		return alt;
	}
	
	public String buscaPlanta(String nombre, char consumo) {
		int i = 0, j = 0;
		String plan = "planta no encontrada";
		Planta pl = new Planta(nombre);
		
		while (j < TOT_TIPOSC && NOM_TIPOSC[j] != consumo) {
			j++;
		}
		if (j < TOT_TIPOSC) {
			while(i < numPlantas[j] && !plantas[i][j].equals(pl)) {
				i++;
			}
			if (i < numPlantas[j]) {
				plan = plantas[i][j].toString();
			}
		}
		return plan;
	}
	
	public int recibenRangoMl(double x, double y) {
		int totP = 0;
		
		for (int j = 0; j < TOT_TIPOSC; j++) {
			for (int i = 0; i < numPlantas[j]; i++) {
				if (plantas[i][j].getMlAguaDiarios() >= x && plantas[i][j].getMlAguaDiarios() <= y) {
					totP++;
				}
			}
		}
		return totP;
	}
	
	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("Vivero Nombre: ");
		cad.append(nombre);
		for (int i = 0; i < TOT_TIPOSC; i ++) {
			cad.append("\n            Total de plantas del tipo " + NOM_TIPOSC[i] + " :");
			cad.append(numPlantas[i]);
		}
		for (int i = 0; i < numPlantas[0]; i++) {
			cad.append("\n         La planta del tipo " + NOM_TIPOSC[0] + " en la posicion " + i + ": ");
			cad.append(plantas[i][0].toString());	
		}
		for (int i = 0; i < numPlantas[1]; i++) {
			cad.append("\n         La planta del tipo " + NOM_TIPOSC[1] + " en la posicion " + i + ": ");
			cad.append(plantas[i][1].toString());
		}
		return cad.toString();
	}
}
