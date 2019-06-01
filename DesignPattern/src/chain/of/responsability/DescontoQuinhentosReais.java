package chain.of.responsability;

public class DescontoQuinhentosReais extends ChainDesconto {

	@Override
	public double desconto(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else
			return getProximo().desconto(orcamento);
	}
}
