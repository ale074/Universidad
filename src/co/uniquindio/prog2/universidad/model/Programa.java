package co.uniquindio.prog2.universidad.model;

import java.util.ArrayList;

public class Programa {
	
	//ATRIBUTOS
	private String nombre;
	private int creditos;
	private int numeroEstudiantesRegistrados;
	private ArrayList <Curso> listaCursos;
	
	
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
	public int getNumeroEstudiantesRegistrados() {
		return numeroEstudiantesRegistrados;
	}
	public void setNumeroEstudiantesRegistrados(int numeroEstudiantesRegistrados) {
		this.numeroEstudiantesRegistrados = numeroEstudiantesRegistrados;
	}
	
	public ArrayList<Curso> getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(ArrayList<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}
	
	//CONSTRUCTORES
	
	public Programa(String nombrePrograma) {
		this.nombre = nombrePrograma;
	}
	
	//METODOS
	
	/**
	 * Método para agregar un curso a la lista de cursos
	 * @param curso
	 */
	
	public void agregarCurso(Curso curso) {
		this.listaCursos.add(curso);
	}

	
	
	
	

}
