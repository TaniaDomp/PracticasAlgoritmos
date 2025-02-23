/*Tania Ariadna Dominguez Palma
 * 13/sep/2021
 * Prueba la clase Venta
 */
public class PruebaVenta {

	public static void main(String[] args) {
		Venta v1, v2;
		
		v1 = new Venta (850, "Manuel");
		v2 = new Venta (2350, "Lourdes");
		
		System.out.println("La comision del vendedor " + v1.getNomVendedor() + " es " + v1.CalculaComision());
		System.out.println("La comision del vendedor " + v2.getNomVendedor() + " es " + v2.CalculaComision());
	}

}
