package state.celular;

public class TelefoneCelular {
	private EstadoTelefone modo;

	public TelefoneCelular() {
		modo = new ModoPadrao();
	}

	public void teclaParaCima() {
		modo.up();
	}

	public void teclaParaBaixo() {
		modo.down();
	}

	public void chamada() {
		modo.snd(this);
	}

	public void encerrar() {
		modo.end(this);
	}

	public void iniciarApp() {
		modo.iniciarApp(this);
	}

	void mudaEstado(EstadoTelefone estado) {
		modo=estado;
	}
	
	public static void main(String[] args) {
		TelefoneCelular phone = new TelefoneCelular();
		phone.teclaParaCima();
		phone.iniciarApp();
		phone.teclaParaCima();
		phone.chamada();//erro para o estado atual
		phone.encerrar();
		phone.teclaParaCima();
	}
}

