package decorator.carro;

public class DecoratorCarro implements Carro {
	protected Carro carro;

	public DecoratorCarro(Carro c) {
		this.carro = c;
	}

	@Override
	public void montar() {
		this.carro.montar();
	}
}
