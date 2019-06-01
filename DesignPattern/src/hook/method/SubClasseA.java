package hook.method;

public class SubClasseA extends HookClasse {

	@Override
	protected void metodoGancho() {
		System.out.println("Executando lógica A");
	}

}
