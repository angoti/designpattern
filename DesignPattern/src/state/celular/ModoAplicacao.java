package state.celular;

public class ModoAplicacao extends EstadoTelefone {

	@Override
	public void up() {
		System.out.println("Scroll para cima");
	}

	@Override
	public void down() {
		System.out.println("Scroll para baixo");
	}

	@Override
	public void end(TelefoneCelular telefone) {
		telefone.mudaEstado(new ModoPadrao());
	}
}
