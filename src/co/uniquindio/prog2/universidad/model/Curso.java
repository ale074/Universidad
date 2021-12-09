package co.uniquindio.prog2.universidad.model;

import java.util.ArrayList;

public class Curso {
	
	//ATRIBUTOS
	private String nombre;
	private int creditos;
	private int codigo;
	private ArrayList <Salon> listaSalones;
	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public ArrayList<Salon> getListaSalones() {
		return listaSalones;
	}

	public void setListaSalones(ArrayList<Salon> listaSalones) {
		this.listaSalones = listaSalones;
	}
	
	
	//CONSTRUCTORES
	
	public Curso(String nombre) {
		this.nombre = nombre;
		
	}
	
	//METODOS
	
	/**
	 * Método para agregar un salon a la lista de salones
	 * @param salon
	 */
	
	public void agregarSalon(Salon salon) {
		this.listaSalones.add(salon);
	}
	
	

}
