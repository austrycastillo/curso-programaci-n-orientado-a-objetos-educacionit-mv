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
		Velocista velocista3 = new Velocista(101, "Juan", 250.5, 35.2);
		velocista3.imprimir();
		// creamos un objeto de la subclase Escalador
		Escalador escalador1 = new Escalador(202, "Pedro", 3.5, 12.5);
		escalador1.imprimir();
		// creamos un objeto de la subclase Contrarrelojista
		Contrarelojista contrarelojista1 = new Contrarelojista(303, "Luis", 45.5);
		contrarelojista1.imprimir();
		// crear objeto de tipo Equipo
		Equipo equipo1 = new Equipo();
		equipo1.agregarCiclista(ciclista1);
		equipo1.agregarCiclista(velocista1);
		equipo1.agregarCiclista(escalador1);
		equipo1.agregarCiclista(contrarelojista1);
		// recorrer la lista de ciclistas del equipo
		equipo1.listarCiclistas();
	}

}
