package observer.alarme;

import java.util.ArrayList;
import java.util.List;

public class Alarme {
	List<Observador> listaDeObservadores = new ArrayList<Observador>(); //observers na estrutura do catálogo
	List<Sensor> listaDeSensores =  new ArrayList<Sensor>();
	
	public Alarme(int numeroDeSensores) {
		for(;numeroDeSensores>0;numeroDeSensores--)
			listaDeSensores.add(new Sensor());
	}

	void adicionaObservador(Observador observador) { //attachObserver(Observer)
		listaDeObservadores.add(observador);
	}
	
	void excluiObservador(Observador observador) { //detachObserver(Observer)
		listaDeObservadores.remove(observador);
	}
	
	void notificar(String mensagem) { //notifyObservers()
		for (Observador observador : listaDeObservadores) {
			observador.alerta(mensagem);
		}
	}

	public void movimentoDetectado() {
		notificar("Movimento detectado: " + listaDeSensores.get((int)(Math.random()*listaDeSensores.size())));
	}
	
}
