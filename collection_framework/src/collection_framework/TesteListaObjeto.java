package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List <Cargo> lista = new ArrayList<>();
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4500));
		lista.add(new Cargo("DBA", "PLENO", 10000));
		
		Collections.sort(lista);
		
		for (Cargo objeto: lista) {
			System.out.println(objeto.getAll() + "\n");
		}
		
		// System.out.println(lista.get(0).getAll());

	}

}
