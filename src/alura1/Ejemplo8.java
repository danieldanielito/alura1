package alura1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Ejemplo8 {
	
	public static void main(String[] args) {

		String alumno1 = "luis miguel";
		String alumno2 = "juan manuel";
		String alumno3 = "jose maria";
		String alumno4 = "roberto carlos";
		String alumno5 = "maria magdalena";
		String alumno6 = "sergio daniel";
		String alumno7 = "maria magdalena";
		String alumno8 = "sergio daniel";

	Set <String> listaAlumnos = new HashSet();
	listaAlumnos.add(alumno1);
	listaAlumnos.add(alumno2);
	listaAlumnos.add(alumno3);
	listaAlumnos.add(alumno4);
	listaAlumnos.add(alumno5);
	listaAlumnos.add(alumno6);
	listaAlumnos.add(alumno7);
	listaAlumnos.add(alumno8);
			
	
	listaAlumnos.forEach(alu-> System.out.println(alu));
	String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
	System.out.println(max);
	System.out.println(max.length());
		
	boolean valida = listaAlumnos.contains("roberto carlos");
	System.out.println(valida);
	listaAlumnos.removeIf(alumno->"luis miguel".equalsIgnoreCase(alumno));
	System.out.println(listaAlumnos);
	
	}

}
