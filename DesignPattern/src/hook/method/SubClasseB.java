package hook.method;

public class SubClasseB extends HookClasse {

	@Override
	protected void metodoGancho() {
		System.out.println("Executando lógica B");
	}

}
