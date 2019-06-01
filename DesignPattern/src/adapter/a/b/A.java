package adapter.a.b;

public class A {
	B b;
	public A(B b) {this.b = b;}
	void f() {b.g();}
}

interface B {public void g();}

class C implements B {
	B1 b;
	public C() {b = new B1();}
	public void g() {b.h();}
}

class B1 {void h() { } }

class Sistema {
	public static void main(String[] args) {
		A a = new A(new C());
		a.f();
	}
}

