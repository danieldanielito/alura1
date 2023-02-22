package alura1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo9 {
	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("luis miguel","001");
		Alumno alumno2 =  new Alumno("antonio roberto","002");
		Alumno alumno3 =  new Alumno("juan manuel","003");
		Alumno alumno4 =  new Alumno("gabriel lucho","004");
		Alumno alumno5 =  new Alumno("maria se","005");
		Alumno alumno6 =  new Alumno("luis miguel","006");
		Alumno alumno7 =  new Alumno("jose maria","007");
		Alumno alumno8 =  new Alumno("jose maria","008");

	Collection  <Alumno> listaAlumnos = new HashSet();
	
	listaAlumnos.add(alumno1);
	listaAlumnos.add(alumno2);
	listaAlumnos.add(alumno3);
	listaAlumnos.add(alumno4);
	listaAlumnos.add(alumno5);
	listaAlumnos.add(alumno6);
	listaAlumnos.add(alumno7);
	listaAlumnos.add(alumno8);
	
	Alumno alu =  new Alumno("luis miguel","001");
	
	System.out.println(alumno1.equals(alu));
	System.out.println(listaAlumnos.contains(alu));
	}
}
