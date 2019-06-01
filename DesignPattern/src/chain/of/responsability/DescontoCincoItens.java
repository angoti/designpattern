package chain.of.responsability;

public class DescontoCincoItens extends ChainDesconto{

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5)
			return orcamento.getValor() * 0.1;
		else
			return getProximo().desconto(orcamento);
	}
}
