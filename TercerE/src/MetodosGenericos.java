/*Tania Ariadna Dominguez Palma
 * 12/nov/2021
 * Clase que verifica y prueba la igualdad de contenido entre dos arreglos de cualquier clase
 */
public class MetodosGenericos {
	
	public static <T> boolean arreglosIg(T[]a, T[]b, int eA, int eB, int k) {
		boolean ig = false;
		int i, j;
		
		if (eA == eB) {
			i = 0;
			j = k;
			while(i < eA && a[i].equals(b[j])) {
				i++;
				j++;
				if (j == eB) {
					j = 0;
				}
			}
			if (i == eA) {
				ig = true;
			}
		}
		return ig;
	}
	public static void main(String[] args) {
		String [] a = {"rojo", "verde", "lila", "azul", "morado"};
		String [] b = {"azul", "morado", "rojo", "verde", "lila"};
		String [] e = {"1", "2", "3", "4", "5"};
		String [] f = {"4", "5", "1", "2", "3"};
		String [] g = {"azul", "morado", "rojo", "verde", "lila", "amarillo"};
		String [] h = {"azul", "morado", "rojo", "verde", "lila"};
		
		System.out.println(arreglosIg(a, b, a.length, b.length, 2));
		System.out.println(arreglosIg(a, b, a.length, b.length, 3));
		System.out.println(arreglosIg(e, f, e.length, f.length, 2));
		System.out.println(arreglosIg(g, h, g.length, h.length, 2));
	}

}
