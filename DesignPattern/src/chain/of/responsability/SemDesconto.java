package chain.of.responsability;

public class SemDesconto extends ChainDesconto {

	@Override
	public double desconto(Orcamento orcamento) {
		return 0;
	}

}
