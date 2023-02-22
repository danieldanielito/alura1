package alura1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejemplo7 {
	
	public static void main(String[] args) {
		
 Curso curso1 = new Curso("matematicas",2);
 Curso curso2 = new Curso("historia",5);
 Curso curso3 = new Curso("ruso",4);
 Curso curso4 = new Curso("ruso",3);
 Curso curso5 = new Curso("historia",12);
 Curso curso6 = new Curso("ingles",15);
 Curso curso7 = new Curso("arabe",14);
 Curso curso8 = new Curso("etica",13);
 	
 ArrayList<Curso> cursos = new ArrayList();

 cursos.add(curso1); 
 cursos.add(curso2); 
 cursos.add(curso3); 
 cursos.add(curso4);
 cursos.add(curso5); 
 cursos.add(curso6); 
 cursos.add(curso7); 
 cursos.add(curso8);
 
 int tiempo = 0;
 for (Curso curso : cursos) {
	 tiempo += curso.getTiempo();
	 
 }

 
 List <Curso> cursosList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("ruso")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
 
 System.out.println(cursos.toString());
 
//te evitas el for con stream
 int sumaFiltrada = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("ruso")).mapToInt(Curso::getTiempo).sum();
 int suma = cursos.stream().mapToInt(Curso::getTiempo).sum();
 int maximo = cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt();
 double promedio = cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble();
 System.out.println(suma);
 Map< String , List<Curso>>groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
 
groupCurso.forEach((key , value)->System.out.println(key + " - "+ value.size()));
	
int sumas = cursos.parallelStream().mapToInt(Curso::getTiempo).sum();
System.out.println(sumas);
 //System.out.println(groupCurso);
 System.out.println(sumaFiltrada);
 System.out.println(maximo);
 System.out.println(promedio);
 
	}
}
