package chain.of.responsability;

public abstract class ChainDesconto {
	private ChainDesconto proximo;

	public ChainDesconto getProximo() {
		return proximo;
	}

	public void setProximo(ChainDesconto proximo) {
		this.proximo = proximo;
	}

	public abstract double desconto(Orcamento orcamento);

}
