package template.method.imposto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestaImposto {

	@Test
	void testaICPPComOrcamentoMenorQue500() {
		Orcamento orcamento = new Orcamento(100);
		assertEquals(5, new ICPP().calcula(orcamento));
	}

	@Test
	void testaICPPComOrcamentoMaior500() {
		Orcamento orcamento = new Orcamento(600);
		assertEquals(42, new ICPP().calcula(orcamento),0.0001);
	}

	@Test
	void testaICPPComOrcamentoIgualA500() {
		Orcamento o2 = new Orcamento(500);
		assertEquals(35, new ICPP().calcula(o2));
	}

	@Test
	void testaIKCVComOrcamentoMenorQue500() {
		Item i1 = new Item("a", 10);
		Orcamento o1 = new Orcamento(100);
		o1.adicionaItem(i1);
		assertEquals(6, new IKCV().calcula(o1));
	}

	@Test
	void testaIKCVComOrcamentoMaior500() {
		Item i1 = new Item("a", 10);
		Orcamento o3 = new Orcamento(600);
		o3.adicionaItem(i1);
		assertEquals(36, new IKCV().calcula(o3));
	}

	@Test
	void testaIKCVComOrcamentoIgualA500() {
		Item i2 = new Item("b", 150);
		Orcamento o2 = new Orcamento(500);
		assertEquals(30, new IKCV().calcula(o2));
	}

	@Test
	void testaIKCVComOrcamentoMenorQue500ComItemValorSuperiorA100() {
		Item i2 = new Item("b", 150);
		Orcamento o1 = new Orcamento(100);
		o1.adicionaItem(i2);
		assertEquals(6, new IKCV().calcula(o1));
	}

	@Test
	void testaIKCVComOrcamentoMaior500ComItemValorSuperiorA100() {
		Item i2 = new Item("b", 150);
		Orcamento o3 = new Orcamento(600);
		o3.adicionaItem(i2);
		assertEquals(60, new IKCV().calcula(o3));
	}

	@Test
	void testaIKCVComOrcamentoIgualA500ComItemValorSuperiorA100() {
		Item i2 = new Item("b", 150);
		Orcamento o2 = new Orcamento(500);
		o2.adicionaItem(i2);
		assertEquals(50, new IKCV().calcula(o2));
	}

}
