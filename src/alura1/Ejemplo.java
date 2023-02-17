package alura1;

import java.util.ArrayList;

public class Ejemplo {
	public static void main(String[] args) {

		String variable1 = "ejemplo1";
		String variable2 = "ejemplo2";

		ArrayList<String> lista = new ArrayList();

		lista.add(variable1);
		lista.add(variable2);

		// System.out.println(lista);

		lista.set(1, "ejemploAlterado");

		// System.out.println(lista);

		/*
		 * for (int i = 0; i < lista.size(); i++) { System.out.println(lista.get(i)); }
		 */

		/*
		 * for (String aux : lista) { System.out.println(aux); }
		 */
		lista.forEach(aux -> {
			System.out.println(aux);
		});
	}

}
