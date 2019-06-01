package state.porta;

public class PortaAntesDeRefatorar {
	private String estado;

	public PortaAntesDeRefatorar() {
		setEstado("Porta Aberta");
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstado() {
		return estado;
	}

	void clicar() {
		switch (estado) {
		case "Porta Aberta":
			setEstado("Porta Permanentemente Aberta");
			break;
		case "Porta Permanentemente Aberta":
			setEstado("Porta Fechando");
			break;
		case "Porta Fechando":
			setEstado("Porta Abrindo");
			break;
		case "Porta Abrindo":
			setEstado("Porta Fechando");
			break;
		case "Porta Fechada":
			setEstado("Porta Abrindo");
			break;
		default:
			System.out.println("Erro!");
		}
	}

	void fimDeCiclo() {
		switch (estado) {
		case "Porta Fechando":
			setEstado("Porta Fechada");
			break;
		case "Porta Abrindo":
			setEstado("Porta Aberta");
			break;
		default:
			System.out.println("Erro!");
			break;
		}
	}

	void timeOut() {
		if (estado.equals("Porta Aberta"))
			setEstado("Porta Fechando");
		else
			System.out.println("Erro!");
	}

	public static void main(String[] args) {
		PortaAntesDeRefatorar porta = new PortaAntesDeRefatorar();
		porta.clicar();
		System.out.println(porta.getEstado());

		porta.clicar();
		System.out.println(porta.getEstado());

		porta.clicar();
		System.out.println(porta.getEstado());

		porta.clicar();
		System.out.println(porta.getEstado());

		porta.fimDeCiclo();
		System.out.println(porta.getEstado());

		porta.timeOut();
		System.out.println(porta.getEstado());
	}
}
