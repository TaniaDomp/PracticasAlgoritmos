import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 20/sep/2021
 * Prueba arrayList
 */
public class pruebaLista {

	public static void main(String[] args) {
		ArrayList<Double> lista;
		int pos;
		double elem;
		
		lista = new ArrayList<Double>();
		lista.add(7.1);
		System.out.println(lista.toString());
		lista.add(3.6);
		System.out.println(lista.toString());
		lista.add(0, 8.5);
		System.out.println(lista.toString());
		pos = lista.indexOf(3.6);
		System.out.println("posicion del elemento 3.6: " + pos);
		System.out.println("Existe 3.6: " + lista.contains(3.6));
		System.out.println("Num de celdas de la lista: " + lista.size());
		lista.remove(8.5);
		System.out.println(lista.toString());
		System.out.println("Resultado isEmpty: " + lista.isEmpty());
		elem = lista.get(0);
		System.out.println("El elemento 0: " + elem);
		lista.clear();
		System.out.println(lista.toString());
	}

}
