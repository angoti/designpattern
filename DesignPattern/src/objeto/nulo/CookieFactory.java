package objeto.nulo;

public class CookieFactory {

	public static Carrinho criarCarrinho(HTTPServletRequest request) {
		if (usuarioTemCarrinho())
			return new Carrinho();
		else
			return new CarrinhoNulo();
	}

	private static boolean usuarioTemCarrinho() {
		if (Math.random() > 0.5)
			return false;
		else
			return true;
	}

}
