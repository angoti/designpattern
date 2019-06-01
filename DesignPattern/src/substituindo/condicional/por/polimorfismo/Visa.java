package substituindo.condicional.por.polimorfismo;

public class Visa extends Cartao {

	public Visa(String numero, int mes, int ano) {
		super(numero, mes, ano);
	}

	@Override
	protected String formato() {
		return "^4(\\d{12}|\\d{15})$";
	}

}
