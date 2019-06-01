package chain.of.responsability.maquina.de.vendas;

public class Slot50 extends Slot {

	@Override
	public void capturar(int moeda) {
		valorCapturado += moeda;
	}

}
