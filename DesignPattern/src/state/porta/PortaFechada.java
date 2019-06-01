package state.porta;

public class PortaFechada extends EstadoPorta {

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaAbrindo());
	}
	
}
