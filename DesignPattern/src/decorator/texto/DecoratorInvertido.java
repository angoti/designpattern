package decorator.texto;

public class DecoratorInvertido implements Texto {
	private Texto componente;

	public DecoratorInvertido(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return new StringBuilder(componente.getTexto()).reverse().toString();
	}

}
