/*Tania Ariadna Dominguez Palma
 * 25/09/2021
 * Prueba la clase piloto
 */
public class pruebaPil {

	public static void main(String[] args) {
		Piloto pil1, pil2;
		int totcar, ig;
		
		pil1 = new Piloto ("Pedro", "masculino", 71, 182, 2, false);
		pil2 = new Piloto ("Juana", "femenino", 71, 182, 1, true);
		
		totcar = pil1.calculaCarbo();
		System.out.println("El total de carbohidratos que debe consumir el piloto es: " + totcar);
		
		ig = pil1.compareTo(pil2);
		if (ig == 0) {
			System.out.println("El piloto 1 es igual al piloto 2");
		}
		else {
			System.out.println("El piloto 1 y piloto 2 son distintos");
		}
		
		pil1.conteoPuntos(12);
		System.out.println("El puntaje obtenido por el piloto 1 en la actualidad: " + pil1.getPuntosOb());
	}

}
