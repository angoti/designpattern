package chain.of.responsability;

public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento) {
		//mais de cinco itens, desconto de 10%
		if (orcamento.getItens().size() > 5)
			return orcamento.getValor() * 0.1;
		//orçamento maior que 500 reais
		else if (orcamento.getValor()>500) {
			return orcamento.getValor()*0.07;
		}
		return 0;
	}
}
