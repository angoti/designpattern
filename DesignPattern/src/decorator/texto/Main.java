package decorator.texto;

public class Main {
	public static void main(String[] args) {
		Texto textoSimples = new TextoSimples();
		System.out.println("\n"+textoSimples.getTexto());
		
		Texto texto = new DecoratorTags(textoSimples);
		System.out.println("\n"+texto.getTexto());

		texto = new DecoratorCaixaAlta(textoSimples);
		System.out.println("\n"+texto.getTexto());
		
		texto = new DecoratorInvertido(textoSimples);
		System.out.println("\n"+texto.getTexto());
		
		texto = new DecoratorInvertido(new DecoratorCaixaAlta(textoSimples));
		System.out.println("\n"+texto.getTexto());
		
		texto = new DecoratorTags(new DecoratorInvertido(new DecoratorCaixaAlta(textoSimples)));
		System.out.println("\n"+texto.getTexto());
		
	}
}
