package singleton;

public class Teste {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			//Incremental inc = new Incremental();
			IncrementalSingleTon inc = IncrementalSingleTon.getInstancia();
			System.out.println(inc);
		}
	}
}
