package chain.of.responsability.caixa;

public abstract class SaqueChainOfResponsability {
	private SaqueChainOfResponsability proximo;

	public final SaqueChainOfResponsability getProximo() {
		return proximo;
	}

	public final void setProximo(SaqueChainOfResponsability proximo) {
		this.proximo = proximo;
	}

	public abstract void saque(Saque saque);
}
