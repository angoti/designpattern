package chain.of.responsability.maquina.de.vendas;

public abstract class Slot {
	private Slot proximo;
	protected int valorCapturado;
	
	public final Slot getProximo() {
		return proximo;
	}

	public final void setProximo(Slot proximo) {
		this.proximo = proximo;
	}
	
	public int valorCapturadoTotal() {
		return valorCapturado + ((proximo == null) ? 0 : proximo.valorCapturadoTotal());
	}
	
	public abstract void capturar(int moeda);
	
}
