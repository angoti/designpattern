package substituindo.condicional.por.polimorfismo.antesDaRefatoracao;

public class Teste {
	public static void main(String[] args) {
		try {
			Cartao black = new Cartao("5536360280967415", "10/2025","mastercard");
			System.out.println(black.validar());
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
