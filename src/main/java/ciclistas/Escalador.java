package ciclistas;

//clase derivada, subclase, hija: hereda atributos y métodos de la clase padre
//clase encapsulada: atributos privados y métodos públicos
public class Escalador extends Ciclista {
//atributos
	private double aceleracionPromedio;
	private double gradoRampa;

//métodos
	// constructor
	public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	// sobrecarga de constructor
	public Escalador() {
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Soy Escalador *** \n La aceleración promedio es " + aceleracionPromedio);
		System.out.println("El grado de la rampa es " + gradoRampa);
	}

}
