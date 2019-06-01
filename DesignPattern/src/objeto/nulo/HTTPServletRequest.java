package objeto.nulo;

import java.util.HashMap;
import java.util.Map;

public class HTTPServletRequest {

	Map<String, Object> mapa;

	public Map<String, Object> getMapa() {
		return mapa;
	}

	public void setMapa(Map<String, Object> mapa) {
		this.mapa = mapa;
	}

	public HTTPServletRequest() {
		mapa = new HashMap<String, Object>();
	}

	public void setAttribute(String chave, Object valor) {
		mapa.put(chave, valor);
	}

	public Object getAttribute(String chave) {
		return mapa.get(chave);
	}

}
