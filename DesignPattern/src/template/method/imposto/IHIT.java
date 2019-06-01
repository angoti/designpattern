package template.method.imposto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IHIT extends TemplateImposto {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if(existeDoisItensComMesmoNome(orcamento.getItens()))
			return true;
		return false;
	}

	private boolean existeDoisItensComMesmoNome(List<Item> itens) {
		Set<Item> conjunto = new HashSet<Item>(itens);
		if(itens.size()>conjunto.size())
			return true;
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.13 + 100.0;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*(0.01*orcamento.getItens().size());
	}
	
	public static void main(String[] args) {
		Orcamento o = new Orcamento(10000.0);
		Item i1 = new Item("lapis", 1);
		Item i2 = new Item("borracha", 1);
		Item i3 = new Item("lapis preto", 1);
		o.adicionaItem(i1);
		o.adicionaItem(i2);
		o.adicionaItem(i3);
		System.out.println(new IHIT().calcula(o));
	}

}
