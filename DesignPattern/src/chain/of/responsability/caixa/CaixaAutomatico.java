package chain.of.responsability.caixa;

import java.util.Scanner;

public class CaixaAutomatico {
	private SaqueChainOfResponsability caixaAutomatico;

	public CaixaAutomatico() {
		caixaAutomatico = new Saque50();
		SaqueChainOfResponsability c2 = new Saque20();
		SaqueChainOfResponsability c3 = new Saque10();

		caixaAutomatico.setProximo(c2);
		c2.setProximo(c3);
	}

	public static void main(String[] args) {
		CaixaAutomatico caixa = new CaixaAutomatico();
		int valor = 0;
		while (true) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Entrar valor do saque:");
			valor = teclado.nextInt();
			if(valor<10) {
				teclado.close();
				return;
			}
			else if (valor % 10 != 0) {
				System.out.println("Valor deve ser múltiplo de R$ 10.");
			} else
				caixa.caixaAutomatico.saque(new Saque(valor));
		}

	}
}
