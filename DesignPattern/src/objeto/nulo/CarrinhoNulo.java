package objeto.nulo;

public class CarrinhoNulo extends Carrinho {
	public double getValor() {
		return 0.0;
	}

	public int getTamanho() {
		return 0;
	}

	public String getNomeUsuario() {
		return "<a href=login.jsp>Login</a>";
	}
}
