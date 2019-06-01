package substituindo.condicional.por.polimorfismo;

public class ValidadeIncorretaException extends RuntimeException {
	public ValidadeIncorretaException(Cartao cartao) {
		super(cartao.getMes() + "/" + cartao.getAno());
	}
}