package alura1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejemplo3 {
	
	public static void main(String[] args) {
		
 Curso curso1 = new Curso("matematicas",2);
 Curso curso2 = new Curso("historia",5);
 Curso curso3 = new Curso("ruso",4);
 Curso curso4 = new Curso("geografia",3);
 	
 ArrayList<Curso> cursos = new ArrayList();

 cursos.add(curso1); 
 cursos.add(curso2); 
 cursos.add(curso3); 
 cursos.add(curso4);
 
 System.out.println(cursos.toString());
 
 Collections.sort(cursos);
 
 System.out.println(cursos.toString());
 
 Collections.sort(cursos, Collections.reverseOrder());
 
 System.out.println(cursos.toString());
 
 List <Curso> cursosList = cursos.stream().filter(curso->!curso.getNombre().equalsIgnoreCase("ruso")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
 
 System.out.println(cursosList.toString());
	}
}
