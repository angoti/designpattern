package singleton;

public class Incremental {
	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	@Override
	public String toString() {
		return "Incremental " + numero;
	}

	
}
