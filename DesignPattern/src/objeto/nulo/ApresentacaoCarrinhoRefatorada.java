package objeto.nulo;

import java.util.Map;

public class ApresentacaoCarrinhoRefatorada {
	public void colocarInformacoesCarrinho(HTTPServletRequest request) {
		Carrinho c = CookieFactory.criarCarrinho(request);

		request.setAttribute("valor", c.getValor());
		request.setAttribute("qtd", c.getTamanho());

		if (request.getAttribute("username") == null) {
			request.setAttribute("userCarrinho", c.getNomeUsuario());
		} else {
			request.setAttribute("userCarrinho", request.getAttribute("username"));
		}
	}
	
	public static void main(String[] args) {
		HTTPServletRequest req = new HTTPServletRequest();
		ApresentacaoCarrinho apresentacaoCarrinho = new ApresentacaoCarrinho();
		apresentacaoCarrinho.colocarInformacoesCarrinho(req);
		for (Map.Entry<String, Object> item : req.getMapa().entrySet()) {
			System.out.println(item.getKey() + "/" + item.getValue());
		}
	}
}
