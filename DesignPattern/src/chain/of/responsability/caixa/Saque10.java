package chain.of.responsability.caixa;

public class Saque10 extends SaqueChainOfResponsability {

	@Override
	public void saque(Saque saque) {
		if (saque.getValor() >= 10) {
			int quantidadeDeNotas = saque.getValor() / 10;
			int resto = saque.getValor() % 10;
			System.out.println("Liberando " + quantidadeDeNotas + " notas de R$ 10");
			if (resto != 0)
				getProximo().saque(new Saque(resto));
		} else {
			getProximo().saque(saque);
		}
	}

}
