//package Polymorphism;
//
//import java.util.Objects;
//
//public class ObjectClass {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Laptop obj1 = new Laptop();
//		obj1.model = "Lenovo Yoga";
//		obj1.price = 1000;
//		
//		Laptop obj2 = new Laptop();
//		obj2.model = "Lenovo Yoga";
//		obj2.price = 1000;
//		
//		boolean result = obj1.equals(obj2);
//		
//		System.out.println(result);
//	}
//
//}
//
//class Laptop {
//	String model;
//	int price;
//	
//	public String toString() {
//		return model + " : " + price;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(model, price);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Laptop other = (Laptop) obj;
//		return Objects.equals(model, other.model) && price == other.price;
//	}
//	
//	
//}
