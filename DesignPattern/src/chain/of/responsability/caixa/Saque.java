//armazena o valor do saque
package chain.of.responsability.caixa;
public class Saque {
	private int valor;
	public Saque(int qtde) {
		this.valor = qtde;
	}
	public int getValor() {
		return this.valor;
	}
}