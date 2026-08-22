package ciclistas;

//clase derivada, subclase, hija: hereda atributos y métodos de la clase padre
//clase encapsulada: atributos privados y métodos públicos
public class Velocista extends Ciclista {
//atributos 
	private double potenciaPromedio;
	private double velocidadPromedio;

	// métodos
	public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio) {
		super(identificador, nombre);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	public Velocista() {
	}

	public Velocista(int identificador, String nombre) {
		super(identificador, nombre);
	}

	public Velocista(double potenciaPromedio, double velocidadPromedio) {
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Soy Velocista **** \n La potencia promedio es " + potenciaPromedio);
		System.out.println("La velocidad promedio es " + velocidadPromedio);
	}
}
