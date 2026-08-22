package ciclistas;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
//atributos
	private String nombre;
	private double totalTiempo;
	private String pais;
	private List<Ciclista> ciclistas;

//métodos
	// constructor
	public Equipo(String nombre, double totalTiempo, String pais, List<Ciclista> ciclistas) {
		this.nombre = nombre;
		this.totalTiempo = totalTiempo;
		this.pais = pais;
		this.ciclistas = new ArrayList<>(ciclistas);
	}

	// sobrecarga de constructor
	public Equipo() {
	}

//setters y getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setTotalTiempo(double totalTiempo) {
		this.totalTiempo = totalTiempo;
	}

	public double getTotalTiempo() {
		return totalTiempo;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void imprimir() {
		System.out.println("El nombre del equipo es " + nombre);
		System.out.println("El tiempo total es " + totalTiempo);
		System.out.println("El país es " + pais);
	}

	// Método para agregar un ciclista al equipo
	public void agregarCiclista(Ciclista ciclista) {
		if (ciclistas == null) {
			ciclistas = new ArrayList<>();
		}
		ciclistas.add(ciclista);

	}

	// método para listar los ciclistas del equipo
	public void listarCiclistas() {
		if (ciclistas == null || ciclistas.isEmpty()) {
			System.out.println("No hay ciclistas en el equipo.");
			return;
		}
		System.out.println("Ciclistas del equipo " + nombre + ":");
		for (Ciclista ciclista : ciclistas) {
			ciclista.imprimir();
			System.out.println("--------------------");
		}
	}
}
