package state.porta;

public class PortaAberta extends EstadoPorta {

	@Override
	void clicar(Porta porta) {
		porta.setEstado(new PortaPermanentementeAberta());
	}

	@Override
	public void timeOut(Porta porta) {
		porta.setEstado(new PortaFechando());
	}

}
