package substituindo.condicional.por.polimorfismo;

public class Amex extends Cartao {

	public Amex(String numero, int mes, int ano) {
		super(numero, mes, ano);
	}

	@Override
	protected String formato() {
		return "^3[47]\\d{13}$";
	}

}
