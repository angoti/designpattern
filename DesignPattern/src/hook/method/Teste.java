package hook.method;

public class Teste {
	public static void main(String[] args) {
		HookClasse objeto1 = new SubClasseA();
		HookClasse objeto2 = new SubClasseB();
		objeto1.metodoPrincipal();
		objeto2.metodoPrincipal();
	}
}
