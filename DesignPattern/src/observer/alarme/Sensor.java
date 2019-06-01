package observer.alarme;

public class Sensor {
	private static int numeroSerie = 0;
	private int codigo = ++numeroSerie;

	@Override
	public String toString() {
		return "sensor " + codigo;
	}
}
