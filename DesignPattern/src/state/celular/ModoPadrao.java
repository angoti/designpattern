package state.celular;

public class ModoPadrao extends EstadoTelefone {

	@Override
	public void up() {
		System.out.println("Aumenta volume campainha");
	}

	@Override
	public void down() {
		System.out.println("Diminui volume campainha");
	}

	@Override
	public void snd(TelefoneCelular telefone) {
		telefone.mudaEstado(new ModoChamada());
	}

	@Override
	public void iniciarApp(TelefoneCelular telefone) {
		telefone.mudaEstado(new ModoAplicacao());
	}
}
