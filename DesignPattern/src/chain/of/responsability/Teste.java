package chain.of.responsability;

public class Teste {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(1000);
		orcamento.adicionaItem(new Item("lapis"));
		orcamento.adicionaItem(new Item("caneta"));
		orcamento.adicionaItem(new Item("borracha"));
		orcamento.adicionaItem(new Item("regua"));
		orcamento.adicionaItem(new Item("apontador"));
		orcamento.adicionaItem(new Item("caderno"));
		CalculadorDeDescontosRefatorado calc = new CalculadorDeDescontosRefatorado();
		System.out.println(calc.calcula(orcamento));
	}

}
