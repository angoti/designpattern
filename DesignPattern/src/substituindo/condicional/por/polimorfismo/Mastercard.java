package substituindo.condicional.por.polimorfismo;

public class Mastercard extends Cartao{

	public Mastercard(String numero, int mes, int ano) {
		super(numero, mes, ano);
	}

	@Override
	protected String formato() {
		return "^5[1-5]\\d{14}$";
	}

}
