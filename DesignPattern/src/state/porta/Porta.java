package state.porta;

public class Porta {
	private EstadoPorta estado;

	public Porta() {
		estado = new PortaFechada();
	}

	public void setEstado(EstadoPorta estado) {
		this.estado = estado;
	}

	public EstadoPorta getEstado() {
		return estado;
	}

	public void clicar() {
		estado.clicar(this);
	}

	public void fimDeCiclo() {
		estado.fimDeCiclo(this);
	}

	public void timeOut() {
		estado.timeOut(this);
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
