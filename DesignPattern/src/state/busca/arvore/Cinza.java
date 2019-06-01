package state.busca.arvore;

import java.util.List;

public class Cinza extends Cor {
	void assumiu(No no, List<No> list) {
		System.out.println("Nó " + no + " ficou cinza");
		for (No adj : no.getAdjacentes())
			adj.buscaProfundidade(list);
		no.setCor(new Preto(), list);
	}
}
