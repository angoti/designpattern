package observer.carteira.de.acoes;

public class AcoesLogger implements Observador {

	@Override
	public void mudancaQuantidade(String nomeDaAcao, Integer quantidade) {
		System.out.println("Alterada a quantidade da a��o " + nomeDaAcao + " para " + quantidade);
	}

}
