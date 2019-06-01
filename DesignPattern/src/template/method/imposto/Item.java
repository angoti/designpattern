package template.method.imposto;

public class Item implements Comparable<Item>  {
	private String nome;
	private double valor;

	public Item(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		return nome.equals(((Item) obj).getNome());
	}

	@Override
	public int hashCode() {
		return nome.toCharArray()[0];
	}

	@Override
	public int compareTo(Item o) {
		return nome.compareTo(o.getNome());
	}
}
