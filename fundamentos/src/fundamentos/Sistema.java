package fundamentos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sistema {

  	public static void main(String[] args) {
  		// Cria um map.
  		Map<String, String> frutas = new HashMap<String, String>();
  		frutas.put("0", "ma��");
  		frutas.put("1", "banana");
  		frutas.put("2", "mel�ncia");
  		frutas.put("3", "maracuj�");
  		frutas.put("4", "banana");
  		
  		//Mostra os diferentes m�todos existentes na classe HashMap.
  		System.out.println("M�todo .keySet() => " + frutas.keySet());
  		System.out.println("M�todo .values() => " + frutas.values());
  		System.out.println("M�todo .entrySet() => " + frutas.entrySet());
  		  		
  		//Cria um Iterator para percorrer os dados do map frutas.
  		Iterator it = frutas.entrySet().iterator();
  		
  		//Itera sobre o map frutas e mostra em tela as chaves e valores.
  		while(it.hasNext()){
  	      Entry entry = (Entry)it.next();
  	      System.out.println(entry.getKey() + "\t"+entry.getValue());
  	    }
	}
}
