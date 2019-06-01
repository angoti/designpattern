package decorator.carro;

public class Teste {
	public static void main(String[] args) {
		Carro esporte = new CarroEsporte(new CarroBasico());
		esporte.montar();
		System.out.println("\n*****");

		Carro esporteLuxo = new CarroEsporte(new CarroDeLuxo(new CarroBasico()));
		esporteLuxo.montar();
	}
}
