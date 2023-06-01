package calculator;



//Defining a method
public class Calc {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void subract(int a, int b) {
		System.out.println(a-b);
	
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		//Class object = new Class();
		Calc addition = new Calc();
		//object.method();
		addition.add(12, 13);
		
		Calc sub = new Calc();
		sub.subract(12, 14);
		
		Calc multi = new Calc();
		multi.multiply(12, 12);
		Calc div = new Calc();
		div.divide(12, 6);
		
		
		
	}
}
