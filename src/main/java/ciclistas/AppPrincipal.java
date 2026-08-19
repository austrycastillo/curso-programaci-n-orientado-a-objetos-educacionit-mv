package ciclistas;

//clase principal, clase de prueba, clase ejecutable
public class AppPrincipal {

	public static void main(String[] args) {
		// creamos un objeto de tipo Ciclista
		Ciclista ciclista1 = new Ciclista(123, "Santiago");// objeto
		Ciclista ciclista2 = new Ciclista();
		ciclista2.setIdentificador(456);
		System.out.println("El identificador es " + ciclista2.getIdentificador());
		ciclista1.imprimir();
		// creamos un objeto de la subclase Velocista
		Velocista velocista1 = new Velocista();// objeto de tipo Velocista
		Velocista velocista2 = new Velocista();
		velocista1.setIdentificador(789);
		velocista1.setNombre("Carlos");
		velocista1.imprimir();
	}

}
