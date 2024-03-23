package com.interviewquestionsanswers.flowanalysis;

public class StaticAbstractDemo {

	public static void main(String[] args) {
		AbstractA abs = new AbsA();
		
		abs.method1();
		abs.method2();
		Demo1 demo1 = new AbsB();
		demo1.methodInterface();
	Demo1.m1();
	

	}

}
abstract class AbstractA{
	
	public abstract void method1();
	
	public void method2() {
		
		System.out.println("From AbstractA Non Abstract Method");
	}
}
class AbsA extends AbstractA{

	@Override
	public void method1() {
System.out.println("From AbsA class Method");		
	}
	
	
}

class AbsB implements Demo1{

	@Override
	public void methodInterface() {

		System.out.println("From AbsB implements methodInterface");
	}
	
	
	
}
 interface Demo1{
	
	public void methodInterface();
	
	static void m1(){
		
		System.out.println("Static Method from Interface");
	};
	
}