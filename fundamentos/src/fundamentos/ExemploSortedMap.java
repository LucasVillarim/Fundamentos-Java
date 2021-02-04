package fundamentos;

import java.util.*;
import java.util.Map.Entry;

public class ExemploSortedMap {
	
	public static void main(String[] args) {
		
		// cria o SortedMap
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		// insere os elementos
		sm.put(3, "Cebola");
		sm.put(2, "Bolacha");
		sm.put(1, "Abacaxi");
		sm.put(4, "Detergente");
		sm.put(5, "Escova");
		
		// exibe
		System.out.println(sm); 
		System.out.println();
		
		// remove o elemento pela chave
		sm.remove(4);
		// substitui um elemento
		sm.put(2, "Biscoito");
		
		//exibe
		System.out.println(sm); 
		System.out.println();
		
		// percorre o SortedMap
		for (Entry<Integer, String> mapElement : sm.entrySet()) {
			// pega a chave
			Integer chave = (Integer) mapElement.getKey(); 
			// pega o valor
			String valor = (String) mapElement.getValue(); 
			// exibe
			System.out.println(chave + " : " + valor); 
		}
		
	}
	
}
