package alura1;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Curso implements Comparable<Curso>{

	private String nombre;
	private int tiempo;
	private Collection <Alumno> alumno= new HashSet();
	//private Collection <Alumno> alumno= new LinkedHashSet();
	private Map<String,Alumno>alumnoMap=  new HashMap();
	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	

	public void addAlumno(Alumno alumno) {
		this.alumno.add(alumno);
		this.alumnoMap.put(alumno.getCodigo(), alumno);
	}
	public boolean verificarAlumno(Alumno alumno) {
		return this.alumno.contains(alumno);
	}
	

	public Collection<Alumno> getAlumno() {
		return alumno;
	}
	

	public Map<String, Alumno> getAlumnoMap() {
		return alumnoMap;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", tiempo=" + tiempo + " " + alumno + "]";
	}
	

	@Override
	public int compareTo(Curso o) {
		
		return this.nombre.compareTo(o.getNombre());
	}
	
	
}
