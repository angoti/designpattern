package substituindo.condicional.por.polimorfismo;

public class NumeroIncorretoException extends RuntimeException {
	public NumeroIncorretoException(Cartao cartao) {
		super(cartao.getNumero());
	}
}
