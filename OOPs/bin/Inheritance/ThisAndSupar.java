package Inheritance;

public class ThisAndSupar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);
	}

}

class A {
	
	public A() {
		super();
		System.out.println("in A");
	}
	
	public A(int n) {
		super();
		System.out.println("int A int");
	}
	
}

class B extends A{
	
	public B() {
		super();
		System.out.println("in B");
	}
	
	public B(int n) {
		this();
		System.out.println("in B int");
	}
	
}
