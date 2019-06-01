package decorator.carro;

public class CarroEsporte extends DecoratorCarro {

	public CarroEsporte(Carro c) {
		super(c);
	}

	@Override
	public void montar(){
		super.montar();
		System.out.print("Adicionando caracteristicas de carro esporte.");
	}
}
