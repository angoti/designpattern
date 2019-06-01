package observer.alarme;

public class Sistema {
	public static void main(String[] args) {
		Alarme alarme = new Alarme(300);
		DelegaciaDePolicia dp = new DelegaciaDePolicia();
		CompanhiaDeSeguros cs = new CompanhiaDeSeguros();
		alarme.adicionaObservador(cs);
		alarme.adicionaObservador(dp);
		for(int x=0;x<30;x++) {
			alarme.movimentoDetectado();
		}
	}
}
