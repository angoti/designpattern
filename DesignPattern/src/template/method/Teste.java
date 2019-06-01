package template.method;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Teste {
	public static void main(String[] args) {
		GeradorArquivo ga = new GeradorXMLCompactado();
		GeradorArquivo gb = new GeradorPropriedadesCriptografado(2);
		Map<String, Object> propriedades = new HashMap<String,Object>();
		propriedades.put("a", 1);
		propriedades.put("b", 2);
		propriedades.put("c", 3);
		propriedades.put("d", 4);
		try {
			ga.gerarArquivo("teste.txt", propriedades);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			gb.gerarArquivo("teste2.txt", propriedades);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("arquivos gerados");
	}

}
