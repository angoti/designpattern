package state.busca.arvore;

import java.util.List;

public class Preto extends Cor {
	void assumiu(No no, List<No> list) {
		System.out.println("Nó " + no + " ficou preto");
		list.add(no);
	}
}
