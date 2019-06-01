package adapter.somador;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		//preciso converter o array de inteiros em uma lista de inteiros
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		return somaLista(lista);
	}

}
