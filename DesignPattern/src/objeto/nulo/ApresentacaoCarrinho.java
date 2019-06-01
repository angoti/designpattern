package objeto.nulo;

import java.util.Map;

public class ApresentacaoCarrinho {
	public void colocarInformacoesCarrinho(HTTPServletRequest request) {
		Carrinho c = CookieFactory.criarCarrinho(request);
		if (c != null) {
			request.setAttribute("valor", c.getValor());
			request.setAttribute("qtd", c.getTamanho());
		} else {
			request.setAttribute("valor", 0.0);
			request.setAttribute("qtd", 0);
		}
		if (request.getAttribute("username") == null) {
			if (c != null) {
				request.setAttribute("userCarrinho", c.getNomeUsuario());
			} else {
				request.setAttribute("userCarrinho", "<a href=login.jsp>Login</a>");
			}
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
