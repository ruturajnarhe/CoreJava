package Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VeryAdvCalc obj = new VeryAdvCalc();
		int r1 = obj.add(5, 4);
		int r2 = obj.sub(5, 4);
		int r3 = obj.multi(5, 4);
		int r4 = obj.div(15, 4);
		double r5 = obj.power(4, 2);
		
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
	}

}


// Java does not support multiple inheritance

// eg

//class A {
//	
//}
//
//class B extends A{
//	
//}
//
//class C extends A, B {
//	
//}

 

