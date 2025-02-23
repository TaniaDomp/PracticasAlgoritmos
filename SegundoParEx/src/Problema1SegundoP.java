import java.util.ArrayList;
/*Tania Ariadna Dominguez Palma
 * 20/oct/21
 * Clase que elimina e inserta datos de acuerdo a numeros multiplos por medio de un metodo estatico
 */
public class Problema1SegundoP {

	public static void eliminaIg(double[]a1, double[]a2, int n1, int n2, ArrayList<Double> num){
		int men = 0;
		double menX = 0, mayX = 0;
		
		if (n1 != n2) {
			if (n1 < n2) {
				men = n1;
			}
			else {
				men = n2;
			}
			for (int i = 0; i < men; i++) {
				if (a1[i] % a2[i] == 0 || a2[i] % a1[i]==0) {
					if  (a1[i]<a2[i]) {
						menX = a1[i];
						mayX = a2[i];
					}
					else {
						menX = a2[i];
						mayX = a1[i];
					}
					num.remove(mayX);
					if (!num.contains(menX)) {
						num.add(menX);
					}
				}
			}
		}
		
		if (num.isEmpty()){
			num = null;
		}
	}

	public static void main(String[] args) {
		double[] a1 = {8, 18, 5, 6, 4};
		double[] a2 = {21, 3, 15};
		int n1 = 5, n2 = 3;
		ArrayList<Double> elemAr =new ArrayList<Double>();
		
		elemAr.add(18.0);
		elemAr.add(21.0);
		elemAr.add(15.0);
		elemAr.add(6.0);
		elemAr.add(4.0);
		eliminaIg(a1, a2, n1, n2, elemAr);
		if(elemAr != null) {
			System.out.println(elemAr.toString());
		}
	}
}
