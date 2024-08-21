package Polymorphism;

public class AbstractAnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A() {
			public void show() {
				System.out.println("in new show");
			}
			public void config() {
				System.out.println("in config");
			}
		}; 
		obj.show();
	}

}


abstract class A {
	public abstract void show();
	public abstract void config();
}

//class B extends A {
//	public void show() {
//		System.out.println("in B show");
//	}
//}