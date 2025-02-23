//Clase para emplear en el Vivero
public class Planta {
	private String nombre;
	private String luz;						//mucha, poca, sombra
	private double temperatura;				//en grados centígrados
	private double mlAguaDiarios;			//cant de ml de agua que deben ser proporcionados diarios
	
	public Planta(String nombre) {
		this.nombre = nombre;
	}

	public Planta(String nombre, String luz, double temperatura, double mlAguaDiarios) {
		this.nombre = nombre;
		this.luz = luz;
		this.temperatura = temperatura;
		this.mlAguaDiarios = mlAguaDiarios;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLuz() {
		return luz;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public double getMlAguaDiarios() {
		return mlAguaDiarios;
	}

	public void setLuz(String luz) {
		this.luz = luz;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void setMlAguaDiarios(double mlAguaDiarios) {
		this.mlAguaDiarios = mlAguaDiarios;
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
		Planta other = (Planta) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	public int compareTo(Planta otra){
		return this.nombre.compareTo(otra.nombre);
	}

	public String toString() {
		StringBuilder cad = new StringBuilder();
		
		cad.append("\nPlanta de           nombre: "+nombre);
		cad.append("\n      requerimiento de luz: "+luz);
		cad.append("\n        temperatura idónea: "+temperatura);
		cad.append("\nml agua requeridos por día: "+mlAguaDiarios);
		return cad.toString();
	}
}
