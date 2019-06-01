package substituindo.condicional.por.polimorfismo;

public class FormatoIncorretoException extends RuntimeException {
	public FormatoIncorretoException(Cartao cartao) {
		super(cartao.getNumero());
	}
}