package collection_framework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// Criamos pela interface
		// Instanciamos pela class (implementação)
		
		Set lista = new HashSet();
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("DEV");
// 		lista.add("DBA"); // SET não aceita dados duplicados
//		Collections.sort(lista); // Não pode ordenar no SET
		System.out.println(lista);

	}

}
