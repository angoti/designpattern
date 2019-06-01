package celular.sem.padrao;

public class Celular {
	String modo;

	public Celular() {
		super();
		modo = "standby";
	}

	void snd() {
		if (modo.equals("standby")) {
			modo = "chamada";
			System.out.println("Realiza chamada");
		}
	}

	void end() {
		if (modo.equals("chamada") || modo.equals("aplicação")) {
			modo = "standby";
			System.out.println("Mudando para modo standby");
		}
	}

	void up() {
		if (modo.equals("standby")) {
			System.out.println("Aumentando volume da chamada");
		} else if (modo.equals("chamada")) {
			System.out.println("Aumentando o volume da voz");
		} else if (modo.equals("aplicação")) {
			System.out.println("Scroll pra cima na tela");
		}
	}

	void down() {
		if (modo.equals("standby")) {
			System.out.println("Diminuindo o volume da chamada");
		} else if (modo.equals("chamada")) {
			System.out.println("Diminuindo o volume da voz");
		} else if (modo.equals("aplicação")) {
			System.out.println("Scroll pra baixo na tela");
		}
	}
	
	void iniciarApp() {
		if(modo.equals("standby")) {
			modo="aplicação";
			System.out.println("App");
		}
	}

	public static void main(String[] args) {
		Celular celular = new Celular();
		celular.snd();
		celular.down();
		celular.end();
		celular.iniciarApp();
	}
}
