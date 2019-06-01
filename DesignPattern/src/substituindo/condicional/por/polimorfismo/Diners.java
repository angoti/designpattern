package substituindo.condicional.por.polimorfismo;

public class Diners extends Cartao {

	public Diners(String numero, int mes, int ano) {
		super(numero, mes, ano);
	}

	@Override
	protected String formato() {
		return "^3[68]\\d{12}|0[0-5]\\d{11})$";
	}

}
