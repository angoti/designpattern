package chain.of.responsability.caixa;

public class Saque20 extends SaqueChainOfResponsability {

	@Override
	public void saque(Saque saque) {
		if (saque.getValor() >= 20) {
			int quantidadeDeNotas = saque.getValor() / 20;
			int resto = saque.getValor() % 20;
			System.out.println("Liberando " + quantidadeDeNotas + " notas de R$ 20");
			if (resto != 0)
				getProximo().saque(new Saque(resto));
		} else {
			getProximo().saque(saque);
		}
	}
}
