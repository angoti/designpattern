package chain.of.responsability.caixa;

public class Saque50 extends SaqueChainOfResponsability {

	@Override
	public void saque(Saque saque) {
		if (saque.getValor() >= 50) {
			int quantidadeDeNotas = saque.getValor() / 50;
			int resto = saque.getValor() % 50;
			System.out.println("Liberando " + quantidadeDeNotas + " notas de R$ 50");
			if (resto != 0)
				getProximo().saque(new Saque(resto));
		} else {
			getProximo().saque(saque);
		}
	}
}
