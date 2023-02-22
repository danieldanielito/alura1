package alura1;

import java.util.Collection;
import java.util.HashSet;

public class Ejemplo10 {
	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("luis miguel","001");
		Alumno alumno2 =  new Alumno("antonio roberto","002");
		Alumno alumno3 =  new Alumno("juan manuel","003");
		Alumno alumno4 =  new Alumno("gabriel lucho","004");
		Alumno alumno5 =  new Alumno("maria se","005");
		Alumno alumno6 =  new Alumno("luis miguel","006");
		Alumno alumno7 =  new Alumno("jose maria","007");
		Alumno alumno8 =  new Alumno("jose maria","008");
		
		 Curso curso1 = new Curso("matematicas",2);
	//Collection  <Alumno> listaAlumnos = new HashSet();
	

	
	curso1.addAlumno(alumno1);
	curso1.addAlumno(alumno2);
	curso1.addAlumno(alumno3);
	curso1.addAlumno(alumno4);
	curso1.addAlumno(alumno5);
	curso1.addAlumno(alumno6);
	curso1.addAlumno(alumno7);
	curso1.addAlumno(alumno8);
	
	Alumno alu =  new Alumno("luis miguel","001");
	
	System.out.println(alumno1.equals(alu));
	System.out.println(curso1.getAlumno().contains(alu));
	System.out.println("verificar alumno es como contains, "+curso1.verificarAlumno(alu));
	System.out.println(curso1);
	}

}
