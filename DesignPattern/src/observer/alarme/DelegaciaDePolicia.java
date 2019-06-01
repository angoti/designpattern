package observer.alarme;

public class DelegaciaDePolicia implements Observador {

	@Override
	public void alerta(String mensagem) {
		System.out.println("Delegacia de pol�cia notificada de evento: " + mensagem);
	}
}
