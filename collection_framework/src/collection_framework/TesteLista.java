package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// N�o � possivel instanciar pela interface = 
		//= List lista = new List();
		
		List <String> lista = new ArrayList <>();
		lista.add("DBA");
		lista.add("PLENO");
		lista.add("ANALISTA");
		lista.add("JR");
		lista.add("DEV");
		lista.add("JR");
		lista.add("DBA"); // List permite dados repitidos
		lista.add("SENIOR");
//		lista.remove(2);
//		Collections.sort(lista);
//		System.out.println(lista.get(1));
		for (int indice=0; indice < lista.size(); indice+=2) {
			System.out.println(lista.get(indice));
		}
		
		
	}

}
