package co.uniquindio.prog2.universidad.aplication;

import java.util.ArrayList;

import javax.print.attribute.standard.Finishings;
import javax.swing.JOptionPane;

import co.uniquindio.prog2.universidad.model.Curso;
import co.uniquindio.prog2.universidad.model.Estudiante;
import co.uniquindio.prog2.universidad.model.Facultad;
import co.uniquindio.prog2.universidad.model.Persona;
import co.uniquindio.prog2.universidad.model.Programa;
import co.uniquindio.prog2.universidad.util.Number;

/**
 * PROYECTO FINAL PROGRAMACIÓN 2 
 * @author Juan Diego Cortes & Juan Sebastian Sanchez
 *
 */

public class Aplicacion {

	public static void main(String[] args) {
		String opcionMenu;
		
		do {
			
			opcionMenu = mostrarMenu();
			switch (opcionMenu) {
			
			case "a": //FUNCIONALIDAD A
				Estudiante[] listaEstudiantes;
				listaEstudiantes = generarListaEstudiantesAleatorios();
				String[][] datosEstudiantes = generarMatrizEstudiantesFuncionalidadA(listaEstudiantes);
				imprimirMatrizEstudiantes(datosEstudiantes);
				break;
				
			case "b": //FUNCIONALIDAD B
				System.out.println("b");
				listaEstudiantes = generarListaEstudiantesAleatorios();
				String[][] datosEstudiantes2 = generarMatrizEstudiantesFuncionalidadB(listaEstudiantes);
				imprimirMatrizEstudiantes(datosEstudiantes2);
				break;
				
			case "c": //FUNCIONALIDAD C
				System.out.println("c");
				
				
				break;
				
				
			case "d": //FUNCIONALIDAD D
				System.out.println("d");
				
				break;
				
			case "e": 
				
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "OPCIÓN ERRONEA, POR FAVOR INGRESE [A,B,C,D,E]");
				break;
			}
			
			
		}while ( opcionMenu.equals("e") != true);
		
		
		
		
		


	}
	




	/**
	 * Método que genera un lista de estudiantes con datos aleatorios
	 * @return arraylist de estudiantes con datos aleatorios
	 */
	
	
	public static Estudiante[] generarListaEstudiantesAleatorios() {
		ArrayList listaEstudiantes = null;
		final int TOTALESTUDIANTES = 40;
		listaEstudiantes = new ArrayList<Estudiante>();
		Estudiante[] listaEstudiantesAleatoria = new Estudiante[TOTALESTUDIANTES];
		/**
		 * Se considerarán 4 cursos posibles:
		 * Calculo
		 * Literatura
		 * SegundaLengua
		 * Quimica
		 */
		Curso curso1 = new Curso("Calculo");
		Curso curso2 = new Curso("Literatura");
		Curso curso3 = new Curso("Medicina");
		Curso curso4 = new Curso("Quimica");
		
		Curso[] listaCursos = {curso1, curso2, curso3, curso4};
		/**
		 * Listado de nombres posibles
		 * 
		 */
		String nombre1 = "Juan";
		String nombre2 = "Pedro";
		String nombre3 = "Maria";
		String nombre4 = "Andrea";
		
		String[] listaNombres = {nombre1, nombre2, nombre3, nombre4};
		
		/**
		 * Listado de apellidos disponibles
		 */
		
		String apellido1 = "Perez";
		String apellido2 = "Cortes";
		String apellido3 = "Sanchez";
		String apellido4 = "Valverde";
		
		String[] listaApellidos = {apellido1, apellido2, apellido3, apellido4};
		
		/**
		 * Genero la lista aleatoria
		 */
		for (int i = 0; i < listaEstudiantesAleatoria.length; i++) {
			String nombre = listaNombres[Number.generateRandomIntegerNumberUpTo(listaNombres.length-1)];
			String apellido = listaApellidos[Number.generateRandomIntegerNumberUpTo(listaApellidos.length-1)];
			int anoNacimiento = 1960 +  Number.generateRandomIntegerNumberUpTo(50);
			listaEstudiantesAleatoria[i] = new Estudiante(nombre, apellido, anoNacimiento+"-01-01");
			String genero;
			if(nombre.equals("Juan") || nombre.equals("Pedro")) {
				 genero = Persona.MASCULINO;
			}else {
				 genero = Persona.FEMENINO;
			}
			listaEstudiantesAleatoria[i].setGenero(genero);
			Curso curso = listaCursos[Number.generateRandomIntegerNumberBetween(0,4)];
			listaEstudiantesAleatoria[i].setCurso(curso);
			
		}
		
		
		//retorno 
		return listaEstudiantesAleatoria;
	}



	/**
	 * Método que me muestra el menú y retorna la opción que desea el usuario
	 * @return
	 */
	
	public static String mostrarMenu() {
		String opcion;
		opcion = JOptionPane.showInputDialog(null, "a. Determinar numero de estudiantes agrupados por curso y genero\n"
				+ "b. Determinar numero de estudiantes de la universidad separando por genero y programa\n"
				+ "c. Ver los cursos dictados por un profesor y el programa y facultad donde los dicta \n"
				+ "d. Ver los cursos vistos por un estudiante, el salón, el programa y la facultad \n"
				+ "e. Salir");
		return opcion;
	}
	
	/**
	 * Método para imprimir un arraylist de estudiantes
	 */
	public static void imprimirArrayListEstudiantes(ArrayList<Estudiante> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(i).toString();
		}
	}
		

	
	/**
	 * Método para imprimir un arraylist de cursos
	 */
	public static void imprimirArraylistCursos(ArrayList<Curso> cursos) {
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i).getNombre());
			
		}
	}
	
	/**
	 * Método que convierte un arreglo de cursos a un arraylist de cursos
	 * @param arreglo de cursos
	 * @return arraylist de cursos
	 */
	
	public static ArrayList<Curso> convertirAarray(Curso[] listaCursosAleatoria) {
		ArrayList <Curso> cursos = new ArrayList<Curso>();
		for (int i = 0; i < listaCursosAleatoria.length; i++) {
			cursos.add(listaCursosAleatoria[i]);
		}
		return cursos;
	}
	
	/**
	 * Método que me genera una matriz de estudiantes con la información solicitada en la funcionalidad A
	 * 1. Curso
	 * 2. Genero
	 * 3. Numero de estudiantes
	 * 4. Edad promedio
	 */
	
	public static String[][] generarMatrizEstudiantesFuncionalidadA(Estudiante[] listaEstudiantes) {
		String[][] infoEstudiantes = null;
		// COMO SE CONSIDERAN SOLO 4 CURSOS POSIBLES LA MATRIZ SIEMPRE TENDRÁ POR TANTO 8 FILAS Y TENDRÁ 4 COLUMNAS = [CURSO, GENERO, NUMERO ESTUDIANTES, EDAD PROMEDIO]
		
		infoEstudiantes = new String[8][4];
		
		//CREACIÓN DE LAS FILAS
		String[] infoEstudiantes1;
		String[] infoEstudiantes2;
		String[] infoEstudiantes3;
		String[] infoEstudiantes4;
		String[] infoEstudiantes5;
		String[] infoEstudiantes6;
		String[] infoEstudiantes7;
		String[] infoEstudiantes8;
		
		// CALCULO MASCULINO
		infoEstudiantes1 = generarInfoEstudiantesFuncionA("Calculo","Masculino", listaEstudiantes);
		// CALCULO FEMENINO
		infoEstudiantes2 = generarInfoEstudiantesFuncionA("Calculo","Femenino", listaEstudiantes);
		// LITERATURA MASCULINO
		infoEstudiantes3 = generarInfoEstudiantesFuncionA("Literatura","Masculino", listaEstudiantes);
		// LITERATURA FEMENINO
		infoEstudiantes4 = generarInfoEstudiantesFuncionA("Literatura","Femenino", listaEstudiantes);
		// MEDICINA MASCULINO
		infoEstudiantes5 = generarInfoEstudiantesFuncionA("Medicina","Masculino", listaEstudiantes);
		// MEDICINA FEMENINO
		infoEstudiantes6 = generarInfoEstudiantesFuncionA("Medicina","Femenino", listaEstudiantes);
		//QUIMICA MASCULINO
		infoEstudiantes7 = generarInfoEstudiantesFuncionA("Quimica","Masculino", listaEstudiantes);
		//QUIMICA FEMENINO
		infoEstudiantes8 = generarInfoEstudiantesFuncionA("Quimica","Femenino", listaEstudiantes);
		
		//ASIGNACIÓN
		
		infoEstudiantes[0] = infoEstudiantes1;
		infoEstudiantes[1] = infoEstudiantes2;
		infoEstudiantes[2] = infoEstudiantes3;
		infoEstudiantes[3] = infoEstudiantes4;
		infoEstudiantes[4] = infoEstudiantes5;
		infoEstudiantes[5] = infoEstudiantes6;
		infoEstudiantes[6] = infoEstudiantes7;
		infoEstudiantes[7] = infoEstudiantes8;
		
		
		return infoEstudiantes;
	}
	
	/**
	 * Método el cual me genera un arreglo tal que [CURSO, GENERO, NUMERO ESTUDIANTES, PROMEDIO EDAD] con un arreglo de estudiantes, un curso y un genero
	 * @param curso
	 * @param genero
	 * @param listaEstudiantes
	 * @return info
	 */


	public static String[] generarInfoEstudiantesFuncionA(String curso, String genero, Estudiante[] listaEstudiantes) {
		String[] info = new String[4];
		info[0] = curso;
		info[1] = genero;
		info[2] = retornarNumeroEstudiantes(curso, genero, listaEstudiantes);
		info[3] = retornarPromedioEdadEstudiantes(curso, genero, listaEstudiantes);
		return info;
	}
	
	/**
	 * Método que retorna el numero de estudiantes de una lista de estudiantes dependiendo su genero y curso
	 * @param curso
	 * @param genero
	 * @param listaEstudiantes
	 * @return numeroestudiantes
	 */


	public static String retornarNumeroEstudiantes(String curso, String genero, Estudiante[] listaEstudiantes) {
		int contador = 0;
		String numeroEstudiantes = Integer.toString(contador);
		
		for (int i = 0; i < listaEstudiantes.length; i++) {
			if(listaEstudiantes[i].verificarCurso(curso) && listaEstudiantes[i].getGenero().equals(genero)) {
				contador++;
			}
			
		}
		
		numeroEstudiantes = Integer.toString(contador);
		
		return numeroEstudiantes;
	}
	
	/**
	 * Método que retorna el promedio de edad de los estudiantes según su genero y curso
	 * @param curso
	 * @param genero
	 * @param listaEstudiantes
	 * @return promedioedad
	 */
	
	public static String retornarPromedioEdadEstudiantes(String curso, String genero, Estudiante[] listaEstudiantes) {
		double promedio = 0;
		double suma = 0;
		int contador = 0;
		String promedioEdades = String.valueOf(promedio);
		for (int i = 0; i < listaEstudiantes.length; i++) {
			if(listaEstudiantes[i].verificarCurso(curso) && listaEstudiantes[i].getGenero().equals(genero)) {
				suma += listaEstudiantes[i].getEdad();
				contador++;
			}
			
		}
		
		promedio = suma/contador;
		promedioEdades = String.valueOf(promedio);
		return promedioEdades;
	}
	
	/**
	 * Método para imprimir una matriz con datos de estudiantes
	 * @param datosEstudiantes
	 */
	
	public static void imprimirMatrizEstudiantes(String[][] datosEstudiantes) {
		for (int i = 0; i < datosEstudiantes.length; i++) {
			JOptionPane.showMessageDialog(null, datosEstudiantes[i]);
		}
		
	}
	
	/**
	 * Método para generar una matriz de información para la funcionalidad b
	 * @param listaEstudiantes
	 * @return matriz info
	 */
	
	public static String[][] generarMatrizEstudiantesFuncionalidadB(Estudiante[] listaEstudiantes) {
		/**
		 * En este caso siempre serán 8 filas porque son 4 programas y 2 generos, 4*2 = 8
		 * y las columnas son 5 ya que se organizará de modo que:
		 * [FACULTAD, PROGRAMA, GENERO, NUMERO ESTUDIANTES, EDAD PROMEDIO]
		 */
		String[][] matrizInfo = new String[8][5];
		
		//Ingenieria en sistemas - M
		String[] matrizInfo1 = generarInfoEstudiantesFuncionB("Masculino", "Ingenieria en sistemas", listaEstudiantes);
		//Ingenieria en sistemas - F
	    String[] matrizInfo2 = generarInfoEstudiantesFuncionB("Femenino", "Ingenieria en sistemas", listaEstudiantes);
		//Lenguas modernas - M
		String[] matrizInfo3 = generarInfoEstudiantesFuncionB("Masculino", "Lenguas modernas", listaEstudiantes);
		//Lenguas modernas - F
		String[] matrizInfo4 = generarInfoEstudiantesFuncionB("Femenino", "Lenguas modernas", listaEstudiantes);
		//Enfermeria - M
		String[] matrizInfo5 = generarInfoEstudiantesFuncionB("Masculino", "Enfermeria", listaEstudiantes);
		//Enfemeria - F
		String[] matrizInfo6 = generarInfoEstudiantesFuncionB("Femenino", "Enfermeria", listaEstudiantes);
		//Quimica - M
		String[] matrizInfo7 = generarInfoEstudiantesFuncionB("Masculino", "Quimica", listaEstudiantes);
		//Quimica - F
		String[] matrizInfo8 = generarInfoEstudiantesFuncionB("Femenino", "Quimica", listaEstudiantes);
		
		//ASIGNACION
		
		matrizInfo[0] = matrizInfo1;
		matrizInfo[1] = matrizInfo2;
		matrizInfo[2] = matrizInfo3;
		matrizInfo[3] = matrizInfo4;
		matrizInfo[4] = matrizInfo5;
		matrizInfo[5] = matrizInfo6;
		matrizInfo[6] = matrizInfo7;
		matrizInfo[7] = matrizInfo8;
	    
		
		
		
		
		return matrizInfo;
	}
	
	
	
	/**
	 * Método que me genera información de los estudiantes en un arreglo para la funcionalidad b
	 * @param genero
	 * @param nombrePrograma
	 * @param listaEstudiantes
	 * @return arreglo con info
	 */





	public static String[] generarInfoEstudiantesFuncionB(String genero, String nombrePrograma, Estudiante[] listaEstudiantes) {
		String[] info = new String[5];
		String nombreFacultad = "";
		if(nombrePrograma.equals("Ingenieria en sistemas")) {
			nombreFacultad = "Ingenieria";
		}
		if(nombrePrograma.equals("Lenguas modernas")) {
			nombreFacultad = "Educacion";
		}
		if(nombrePrograma.equals("Enfermeria")) {
			nombreFacultad = "Medicina";
		}
		if(nombrePrograma.equals("Quimica")) {
			nombreFacultad = "Ciencias basicas";
		}
		info[0] = nombreFacultad;
		info[1] = nombrePrograma;
		info[2] = genero;
		info[3] = generarNumeroEstudiantesProgramaGenero(genero, nombrePrograma, listaEstudiantes);
		info[4] = generarPromedioEdadProgramaGenero(genero, nombrePrograma, listaEstudiantes);
		
		
		
		
		
		
		return info;
	}
	
	
	





	/**
	 * Método que retorna el numero de estudiantes por programa y genero de una lista de estudiantes
	 * @param genero
	 * @param nombrePrograma
	 * @param listaEstudiantes
	 * @return
	 */





	public static String generarNumeroEstudiantesProgramaGenero(String genero, String nombrePrograma,
			Estudiante[] listaEstudiantes) {
		
		
		
			int contador = 0;
			String numeroEstudiantes = Integer.toString(contador);
			
			for (int i = 0; i < listaEstudiantes.length; i++) {
				if(listaEstudiantes[i].verificarPrograma(nombrePrograma) && listaEstudiantes[i].getGenero().equals(genero)) {
					contador++;
				}
				
			}
			
			numeroEstudiantes = Integer.toString(contador);
			
			
		
		
		return numeroEstudiantes;
	}
	
	/**
	 * Método que me retorna el promedio de una lista de estudiantes dependiendo un genero y un programa
	 * @param genero
	 * @param nombrePrograma
	 * @param listaEstudiantes
	 * @return promedio edades
	 */
	
	public static String generarPromedioEdadProgramaGenero(String genero, String nombrePrograma,
			Estudiante[] listaEstudiantes) {
		double promedio = 0;
		double suma = 0;
		int contador = 0;
		String promedioEdades = String.valueOf(promedio);
		for (int i = 0; i < listaEstudiantes.length; i++) {
			if(listaEstudiantes[i].verificarPrograma(nombrePrograma) && listaEstudiantes[i].getGenero().equals(genero)) {
				suma += listaEstudiantes[i].getEdad();
				contador++;
			}
			
		}
		promedio = suma/contador;
		promedioEdades = String.valueOf(promedio);
		return promedioEdades;
	}








	
	
	

}
