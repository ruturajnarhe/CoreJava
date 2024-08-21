package Inheritance;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.show();
		obj.config();
	}

}

class C {
	
	public void show() {
		System.out.println("in show");
	}
	
	public void config() {
		System.out.println("in A Config");
	}
}

class D extends C {
	
	public void show() {    // Method Overriding
		System.out.println("in B show");
	}
}
