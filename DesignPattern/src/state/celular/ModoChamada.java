package state.celular;

public class ModoChamada extends EstadoTelefone {

	@Override
	public void up() {
		System.out.println("Aumenta volume chamada");
	}

	@Override
	public void down() {
		System.out.println("Diminui volume chamada");
	}

	@Override
	public void end(TelefoneCelular telefone) {
		telefone.mudaEstado(new ModoPadrao());
	}
}
