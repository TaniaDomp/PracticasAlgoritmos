import java.util.Arrays;

/*Tania Ariadna Dominguez Palma
 * 09/dic/2021
 * Clase que describe una compania con un arreglo de ventas
 */
public class Compania {
	private double[] ventas;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ventas);
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
		if (!Arrays.equals(ventas, other.ventas))
			return false;
		return true;
	}
	
	
}
