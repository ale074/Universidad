package co.uniquindio.prog2.universidad.model;

import java.util.ArrayList;

public class Profesor extends Persona {
	
	

	//ATRIBUTOS
	private String especialidad;
	private ArrayList <Curso> listaCursos;
	private ArrayList <Salon> listaSalones;

	
	//GETTERS & SETTERS

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	public ArrayList<Salon> getListaSalones() {
		return listaSalones;
	}

	public void setListaSalones(ArrayList<Salon> listaSalones) {
		this.listaSalones = listaSalones;
	}
	
	
	
	
	//CONSTRUCTORES
	
	public Profesor(String nombre, String apellido, String fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);
		this.nombre = nombre;
		this.apellidos = apellido;
		this.setFechaDeNacimiento(fechaNacimiento);
	}
	
	//METODOS
	
	

	/**
	 * Método para agregar un curso a la lista de cursos
	 * @param curso
	 */
	
	public void agregarCurso(Curso curso) {
		this.listaCursos.add(curso);
	}
	
	/**
	 * Método para agregar un salon a la lista de salones
	 * @param salon
	 */
	
	public void agregarSalon(Salon salon) {
		this.listaSalones.add(salon);
	}
	



	
	

}
