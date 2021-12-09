package co.uniquindio.prog2.universidad.model;

import java.util.ArrayList;

public class Facultad {
	
	//ATRIBUTOS
	private String nombre;
	private int numeroProgramas;
	private ArrayList <Programa> listaProgramas;
	private ArrayList <Salon> listaSalones;
	
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumeroProgramas() {
		return numeroProgramas;
	}
	public void setNumeroProgramas(int numeroProgramas) {
		this.numeroProgramas = numeroProgramas;
	}
	public ArrayList<Programa> getListaProgramas() {
		return listaProgramas;
	}
	public void setListaProgramas(ArrayList<Programa> listaProgramas) {
		this.listaProgramas = listaProgramas;
	}
	public ArrayList<Salon> getListaSalones() {
		return listaSalones;
	}
	public void setListaSalones(ArrayList<Salon> listaSalones) {
		this.listaSalones = listaSalones;
	}
	
	
	
	//CONSTRUCTORES
	
	public Facultad(String nombre) {
		this.nombre = nombre;
	}
	
	//METODOS
	
	/**
	 * Método para agregar un programa a la lista de programas
	 * @param programa
	 */
	
	public void agregarPrograma(Programa programa) {
		this.listaProgramas.add(programa);
	}
	
	/**
	 * Método para agregar un salon a la lista de salones
	 * @param salon
	 */
	
	public void agregarSalones(Salon salon) {
		this.listaSalones.add(salon);
	}
	
	
	

}
