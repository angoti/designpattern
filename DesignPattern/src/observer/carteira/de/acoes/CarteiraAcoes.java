package observer.carteira.de.acoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarteiraAcoes {
	private Map<String, Integer> acoes = new HashMap<>();
	private List<Observador> obs = new ArrayList<>();

	public void adicionaAcoes(String acao, Integer qtd) {
		if (acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		acoes.put(acao, qtd);
		notificar(acao, qtd);
	}

	private void notificar(String acao, Integer qtd) {
		for (Observador o : obs)
			o.mudancaQuantidade(acao, qtd);
	}

	public void addObservador(Observador o) {
		obs.add(o);
	}

	public static void main(String[] args) throws Exception {
		GraficoBarras gb = new GraficoBarras();
		AcoesLogger al = new AcoesLogger();
		CarteiraAcoes c = new CarteiraAcoes();
		c.addObservador(gb);
		c.addObservador(al);
		Thread.sleep(200);
		c.adicionaAcoes("COMP02", 200);
		Thread.sleep(200);
		c.adicionaAcoes("EMP34", 400);
		Thread.sleep(200);
		c.adicionaAcoes("ACDF89", 300);
		Thread.sleep(2000);
		c.adicionaAcoes("EMP34", -200);
		Thread.sleep(2000);
		c.adicionaAcoes("COMP02", 150);
		for (int i = 10; i < 30; i++) {
			c.adicionaAcoes(new Character((char)(int)(Math.random() * 26)).toString(), (int) (i * Math.random()));
			Thread.sleep(200);
		}
	}
}
