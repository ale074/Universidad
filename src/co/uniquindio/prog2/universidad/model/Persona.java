package co.uniquindio.prog2.universidad.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	// ATRIBUTOS
	protected String nombre;
	protected String apellidos;
	protected String correo;
	protected String direccion;
	protected int identificacion;
	protected int telefono;
	protected String tipoSangre;
	protected String rh;
	protected int edad;
	protected LocalDate fechaDeNacimiento;
	protected String genero;
	protected String tipoVinculacion;
	public static final String MASCULINO = "Masculino";
	public static final String FEMENINO = "Femenino";
	

	
	//GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		 DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, formatoFecha);
		 this.calcularEdad();
	}
	
	public String getGenero() {
		return genero;
	}
	
	//SE MANEJARA POR DEFECTO GENERO FEMENINO
	public void setGenero(String genero) {
		if(genero != Persona.MASCULINO && genero != Persona.FEMENINO) {
			this.genero = Persona.FEMENINO;
		} else {
			this.genero = genero;
		}
	}
	public String getTipoVinculacion() {
		return tipoVinculacion;
	}
	public void setTipoVinculacion(String tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}
	
	//CONSTRUCTORES
	
	public  Persona(String nombre, String apellido, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.setFechaDeNacimiento(fechaNacimiento);
	}
	
	//METODOS
	
	/**
	 * Método que sirve para calcular la edad y setearla con un valor fijo
	 */
    private void calcularEdad() {
    	this.edad = Period.between(this.fechaDeNacimiento,  LocalDate.now()).getYears();
    	
	}
	/**
	 * Método to string, retorna el nombre el apellido, la edad y el genero
	 */
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", genero=" + genero + "]";
	}
    
    
	
	
	

}
