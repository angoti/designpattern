package decorator.carro;

public class CarroDeLuxo extends DecoratorCarro {

	public CarroDeLuxo(Carro c) {
		super(c);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.print("Adicionando caracteristicas de carro de luxo.");
	}
}
