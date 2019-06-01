package observer.alarme;

public class DelegaciaDePolicia implements Observador {

	@Override
	public void alerta(String mensagem) {
		System.out.println("Delegacia de polícia notificada de evento: " + mensagem);
	}
}
