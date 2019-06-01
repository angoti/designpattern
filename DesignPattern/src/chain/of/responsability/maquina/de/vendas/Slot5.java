package chain.of.responsability.maquina.de.vendas;

public class Slot5 extends Slot {

	@Override
	public void capturar(int moeda) {
		if(moeda == 5)
			valorCapturado+=moeda;
		else
			getProximo().capturar(moeda);
	}
}
