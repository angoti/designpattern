package observer.alarme;

public class CompanhiaDeSeguros implements Observador {
	@Override
	public void alerta(String mensagem) {
		System.out.println("Companhia de seguros notificada de evento: " + mensagem);
	}
}
