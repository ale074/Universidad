package co.uniquindio.prog2.universidad.model;

import java.util.ArrayList;

public class Estudiante extends Persona {
	

	//ATRIBUTOS
	private Facultad facultad;
	private Programa programa;
	private int semestre;
	private int codigoEstudiante;
	private Curso curso;
	private ArrayList <Salon> listaSalones;
	

	//GETTERS & SETTERS
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
		if(curso.getNombre().equals("Calculo")) {
			this.setPrograma("Ingenieria en sistemas");
		}
		if(curso.getNombre().equals("Literatura")) {
			this.setPrograma("Lenguas modernas");
		}
		if(curso.getNombre().equals("Medicina")) {
			this.setPrograma("Enfermeria");
		}
		if(curso.getNombre().equals("Quimica")) {
			this.setPrograma("Quimica");
		}
	}
	public ArrayList<Salon> getListaSalones() {
		return listaSalones;
	}

	public void setListaSalones(ArrayList<Salon> listaSalones) {
		this.listaSalones = listaSalones;
	}
	
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(String nombreFacultad) {
		Facultad facultadNueva = new Facultad(nombreFacultad);
		this.facultad = facultadNueva;
	}
	public Programa getPrograma() {
		return programa;
	}
	public void setPrograma(String nombrePrograma) {
		if(nombrePrograma.equals("Ingenieria en sistemas")) {
			this.setFacultad("Ingenieria");
		}
		if(nombrePrograma.equals("Lenguas modernas")) {
			this.setFacultad("Educacion");
		}
		if(nombrePrograma.equals("Enfermeria")) {
			this.setFacultad("Medicina");
		}
		if(nombrePrograma.equals("Quimica")) {
			this.setFacultad("Ciencias basicas");
		}
		Programa programaNuevo = new Programa(nombrePrograma);
		this.programa = programaNuevo;
	}
	
	
	
	//CONSTRUCTORES
	

	public Estudiante(String nombre, String apellido, String fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);
		this.nombre = nombre;
		this.apellidos = apellido;
		this.setFechaDeNacimiento(fechaNacimiento);
	}
	
	
	//METODOS

	/**
	 * Método para agregar un salon a la lista de salones
	 * @param salon
	 */
	
	public void agregarSalon(Salon salon) {
		this.listaSalones.add(salon);
	}
	
	/**
	 * Método que verifica si el estudiante pertenece a un curso dado
	 * @param curso
	 * @return true o false
	 */
	
	
	public boolean verificarCurso(String nombreCurso) {
		boolean verificacion = false;
		if(this.curso.getNombre().equals(nombreCurso)) {
			verificacion = true;
		}
		return verificacion;
	}
	
	/**
	 * Método que verifica si el estudiante pertenece a x programa
	 * @param nombrePrograma
	 * @return true o false
	 */
	public boolean verificarPrograma(String nombrePrograma) {
		boolean verificacion = false;
		if(programa.getNombre().equals(nombrePrograma)) {
			verificacion = true;
		}
		
		return verificacion;
	}
	

	
}
