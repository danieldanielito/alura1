package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import alura1.Curso;

public class Curso1 {
	private String nombre;
	private int tiempo;
	private List <Aula> claseList = new ArrayList(); 
	
	
	
	public Curso1(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}

	public Curso1(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	

	public List<Aula> getClaseList() {
		return Collections.unmodifiableList(claseList);
		//return claseList;
	}

	public void setClaseList(List<Aula> claseList) {
		this.claseList = claseList;
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

	@Override
	public String toString() {
		return  this.nombre ;
	}
	 public void addClase(Aula clase) {
		this.claseList.add(clase);
		 
	 }


}
