package alura1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Aula;
import model.Curso1;

public class Ejemplo4 {
	public static void main(String[] args) {
		
 Curso1 curso1 = new Curso1("matematicas",2);
curso1.addClase(new Aula("ArrayList"));
curso1.addClase(new Aula("list"));
curso1.addClase(new Aula("LinkenList"));


 
 System.out.println(curso1.getClaseList());

	}

}
