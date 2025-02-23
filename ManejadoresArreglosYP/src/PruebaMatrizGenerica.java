/*Tania Ariadna Dominguez Palma
 * 21/nov/2021
 * Prueba la clase ManejadorMatricesGenerico
 */
public class PruebaMatrizGenerica {

	public static void main(String[] args) {
		String [ ][ ] mat  = {{"platano","guayaba","pepino","naranja"}, {"manzana","melocoton","sandia","mango"}, {"fresa","uva","durazno","pera"}};
		String [ ][ ] matIg  = {{"platano","guayaba","pepino","naranja"}, {"manzana","melocoton","sandia","mango"}, {"fresa","uva","durazno","pera"}};
		String [ ][ ] mat2  = {{"J","B","C","D"}, {"F","G","H","A"}, {"J","K","L","M"}};
		String[][] mSim = {{"A","B","C"},{"B","C","A"},{"C","A","B"}};
		int [] pos = new int[2];
		int [] posMen = new int[2];
		int [] busE = new int[2];
		
		System.out.println(ManejadorMatricesGenerico.posMinCol(mat2, 3, 3));
		System.out.println(ManejadorMatricesGenerico.posMaxCol(mat2, 3, 3));
		System.out.println(ManejadorMatricesGenerico.posMaxRen(mat2, 2, 4));
		System.out.println(ManejadorMatricesGenerico.posMinRen(mat2, 2, 4));
		pos = ManejadorMatricesGenerico.posMaxMat(mat2, 3, 4);
		for (int i = 0; i < 2; i++) {
			System.out.print(pos[i] + " ");
		}
		System.out.println();
		posMen = ManejadorMatricesGenerico.posMenMat(mat2, 3, 4);
		for (int i = 0; i < 2; i++) {
			System.out.print(posMen[i] + " ");
		}
		System.out.println();
		System.out.println(ManejadorMatricesGenerico.matrizSim(mSim, 3));
		busE = ManejadorMatricesGenerico.buscaElem(mat2, 3, 4, "M");
		for (int i = 0; i < 2; i++) {
			System.out.print(busE[i] + " ");
		}
		System.out.println();
		System.out.println(ManejadorMatricesGenerico.buscaElemRen(mat2, 0, 4, "D"));
		System.out.println(ManejadorMatricesGenerico.buscaElemColum(mat2, 1, 3, "K"));
		System.out.println(ManejadorMatricesGenerico.sonIguales(mat2, 3, 4, matIg, 3, 4));
	}
	
}
