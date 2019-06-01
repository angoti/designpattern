package decorator.texto;

public class DecoratorTags implements Texto {
	private Texto componente;

	public DecoratorTags(Texto componente) {
		this.componente = componente;
	}

	@Override
	public String getTexto() {
		return "<b>" + componente.getTexto() + "<b>";
	}

}
