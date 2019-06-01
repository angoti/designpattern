package state.busca.arvore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
	private Set<No> adjacentes = new HashSet<>();
	private Cor cor;
	private String name;

	public No(String name) {
		this.name = name;
		cor = new Branco();
	}

	public void buscaProfundidade(List<No> list) {
		cor.busca(this, list);
	}

	public Set<No> getAdjacentes() {
		return adjacentes;
	}

	public void addAdjacentes(No adj) {
		adjacentes.add(adj);
	}

	public void setCor(Cor cor, List<No> list) {
		this.cor = cor;
		cor.assumiu(this, list);
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		No a = new No("A");
		No b = new No("B");
		No c = new No("C");
		No d = new No("D");
		No e = new No("E");
		No f = new No("F");
		No g = new No("G");
		No h = new No("H");
		a.addAdjacentes(b);
		a.addAdjacentes(e);
		a.addAdjacentes(h);

		b.addAdjacentes(c);

		c.addAdjacentes(d);

		d.addAdjacentes(b);

		e.addAdjacentes(f);

		f.addAdjacentes(c);
		f.addAdjacentes(g);
		f.addAdjacentes(h);

		List<No> l = new ArrayList<>();
		a.buscaProfundidade(l);
		for (No n : l)
			System.out.println(n);
	}
}
