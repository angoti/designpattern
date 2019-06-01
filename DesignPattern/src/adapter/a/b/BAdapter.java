package adapter.a.b;

public class BAdapter implements B{
	B1 b;
	
	public BAdapter(B1 b) {
		super();
		this.b = b;
	}

	@Override
	public void g() {
		b.h();		
	}
	
}
