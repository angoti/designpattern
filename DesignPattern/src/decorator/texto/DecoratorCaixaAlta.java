package decorator.texto;

public class DecoratorCaixaAlta implements Texto {
	private Texto componente;

	public DecoratorCaixaAlta(Texto componente) {
		this.componente = componente;
	}

	public String getTexto() {
		return componente.getTexto().toUpperCase();
	}
}
