/*Tania Ariadna Dominguez Palma
 * 27/09/2021
 * Clase que deposita metodos estaticos de un profesor
 */
public class MetodosProfesor {
	public static boolean retaA(int num) {
		boolean resF;
		int res, con = 0;
		
		for (int i = 1; i < num; i++) {
			res = num % i;
			if (res == 0) {
				con += i;
			}
		}
		
		if (con == num) {
			resF = true;
		}
		else {
			resF = false;
		}
		return resF;	
	}
}
