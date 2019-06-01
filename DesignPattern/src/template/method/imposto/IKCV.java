package template.method.imposto;

import java.util.List;

public class IKCV extends TemplateImposto {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() >= 500 && algumItemComValorSuperiorA100(orcamento.getItens()));
	}

	private boolean algumItemComValorSuperiorA100(List<Item> itens) {
		for (Item item : itens)
			if (item.getValor() > 100)
				return true;
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor()*0.06;
	}

}
