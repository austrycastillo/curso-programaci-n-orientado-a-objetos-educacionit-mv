package ciclistas;

//clase derivada, subclase, hija: hereda atributos y métodos de la clase padre
//clase encapsulada: atributos privados y métodos públicos
public class Contrarelojista extends Ciclista {
//atributos
	private double velocidadMaxima;

	// métodos
	// constructor
	public Contrarelojista(int identificador, String nombre, double velocidadMaxima) {
		super(identificador, nombre);
		this.velocidadMaxima = velocidadMaxima;
	}

	// constructor sobrecargado
	public Contrarelojista() {
	}

	// setters y getters
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Soy Contrareloj*** \n La velocidad máxima es " + velocidadMaxima);
	}
}
