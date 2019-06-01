//implementa o padrão chain of responsability
package chain.of.responsability;

public class CalculadorDeDescontosRefatorado {
	public double calcula(Orcamento orcamento) {
		ChainDesconto d1 = new DescontoCincoItens();//10%
		ChainDesconto d2 = new DescontoQuinhentosReais();//7%
		ChainDesconto d3 = new SemDesconto();//0%
		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconto(orcamento);
	}
}
