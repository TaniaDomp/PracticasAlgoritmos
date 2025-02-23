//Clase que describe a un dron, para solución del problema 2 del Segundo examen parcial
public class Dron {
	private int clave;
	private int numMotores;
	private int numCamaras;
	private double precio;
	private String marca;
	
	public Dron() {
	}

	public Dron(int clave, int numMotores, int numCamaras, double precio, String marca) {
		this.clave = clave;
		this.numMotores = numMotores;
		this.numCamaras = numCamaras;
		this.precio = precio;
		this.marca = marca;
	}

	public int getClave() {
		return clave;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public int getNumCamaras() {
		return numCamaras;
	}

	public double getPrecio() {
		return precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nDron con  clave: "+clave );
		cad.append("\n          marca: "+marca);
		cad.append("\n   cant motores: "+numMotores);
		cad.append("\n   cant cámaras: "+numCamaras);
		cad.append("\n         precio: "+precio);
		return cad.toString();
	}
	
	public boolean equals(Dron otro) {
		return this.clave == otro.clave;
	}
	
	public int compareTo(Dron otro) {
		return this.clave-otro.clave;
	}

}
