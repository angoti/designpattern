package state.porta;

public class PortaAbrindo extends EstadoPorta {

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaFechando());
	}

	@Override
	public void fimDeCiclo(Porta porta) {
		porta.setEstado(new PortaAberta());
	}
}
