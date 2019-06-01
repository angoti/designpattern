package iterator;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		for(int x = 0; x<lista.size();x++) {
			if(lista.get(x)==3)
				lista.remove(x);
		}
	}
}
