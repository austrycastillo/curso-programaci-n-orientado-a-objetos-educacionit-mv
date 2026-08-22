package ciclistas;

//clase padre, superclase, base: atributos y métodos comunes
//clase encapsulada: atributos privados y métodos públicos
public class Ciclista {
//atributos: características, descripción
	private int identificador;// variable
	private String nombre;
	private int tiempoAcumulado = 0;
//métodos: funciones, procedimientos, acciones
	// constructor
	@override
	public Ciclista(int identificador, String nombre) {
		this.identificador = identificador;
		this.nombre = nombre;
	}

	// polimorfismo: sobrecargar el constructor
	public Ciclista() {

	}

	// setters y getters
	// setters: inicializan o modifican los atributos
	// getters: retornan el valor de los atributos
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}

	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	// otros métodos
	public void imprimirTipo() {
		System.out.println("Soy un ciclista");
	}

	public void imprimir() {
		System.out.println("El identificador es " + identificador);
		System.out.println("El nombre es " + nombre);
		System.out.println("El tiempo acumulado es " + tiempoAcumulado);
	}

	@Override
	public String toString() {
		return "Ciclista [identificador=" + identificador + ", nombre=" + nombre + ", tiempoAcumulado="
				+ tiempoAcumulado + "]";
	}

}
