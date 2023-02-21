package alura1;

import java.util.ArrayList;
import java.util.List;

import model.Aula;
import model.Curso1;

public class Ejemplo5 {
	
	public static void main(String[] args) {
		
 Curso1 curso1 = new Curso1("matematicas",2);
curso1.addClase(new Aula("ArrayList"));
curso1.addClase(new Aula("list"));
curso1.addClase(new Aula("LinkenList"));
curso1.addClase(new Aula("inmutable"));


 List<Aula> aulaList = curso1.getClaseList();
 //aulaList.add(new Aula("inmutable"));//para que adhiera esta clase el get del curso1 va sin colection
 ArrayList<Curso1>cursos=new ArrayList();
 cursos.add(curso1);
 System.out.println(cursos.get(0).getClaseList());

	}

}
