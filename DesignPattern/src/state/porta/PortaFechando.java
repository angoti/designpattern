package state.porta;

public class PortaFechando extends EstadoPorta {

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaAbrindo());
	}

	@Override
	public void fimDeCiclo(Porta porta) {
		porta.setEstado(new PortaFechada());
	}

}
