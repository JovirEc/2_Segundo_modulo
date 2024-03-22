package com.krakedev.entidades;
import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;

	
	//CONSTRUCTOR
	public Curso () {
		estudiantes = new ArrayList<Estudiante>();
	}
	
	//GETTER SETTERS
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	
	//METODOS
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String cedulaEncontrada = null;
		String cedulaNueva = estudiante.getCedula();
		Estudiante estudianteX = null;
		String cedulaX = null;
		
		for(int i=0; i<estudiantes.size(); i++) {
			estudianteX = estudiantes.get(i);
			cedulaX = estudianteX.getCedula();
			if(cedulaNueva.equals(cedulaX)) {
				cedulaEncontrada = "Estudiante en curso activo";
			}
		}
		
		return cedulaEncontrada;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String resultadoEstudiante = buscarEstudiantePorCedula(estudiante);
		if(resultadoEstudiante == null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso () {
		double promedioX = 0;
		double sumaPromedios = 0;
		double promedioTotal = 0;
		Estudiante estudianteX = null;
		
		for(int i=0; i<estudiantes.size(); i++) {
			estudianteX = estudiantes.get(i);
			promedioX = estudianteX.calcularPromedioNotasEstudiante();
			sumaPromedios += promedioX;
		}
		
		promedioTotal = sumaPromedios / estudiantes.size();

		return promedioTotal;
	}
	
	public void mostrar() {
		Estudiante estudianteX = null;
		for(int i=0; i<estudiantes.size(); i++) {
			estudianteX = estudiantes.get(i);
			estudianteX.mostrar();
		}
	}
}