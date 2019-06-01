package chain.of.responsability.maquina.de.vendas;

import java.util.Scanner;

public class Maquina {

	private Slot cadeia;

	public Maquina() {
		cadeia = new Slot1();
		Slot s5 = new Slot5();
		Slot s10 = new Slot10();
		Slot s50 = new Slot50();
		cadeia.setProximo(s5);
		s5.setProximo(s10);
		s10.setProximo(s50);
	}

	
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Maquina maquina = new Maquina();
		while (maquina.cadeia.valorCapturadoTotal() < 100) {
			System.out.println("Insira uma moeda");
			int moeda = entrada.nextInt();
			maquina.cadeia.capturar(moeda);
		}
		System.out.println("Entregando refrigerante R$ 1,00 e seu troco de "+(maquina.cadeia.valorCapturadoTotal()-100));
		entrada.close();
	}

}
