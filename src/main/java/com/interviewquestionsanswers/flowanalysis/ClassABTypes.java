package com.interviewquestionsanswers.flowanalysis;

public class ClassABTypes {

	public static void main(String[] args) {
		A.block1();
		A a = new A();
		a.block2();

		B b = new B();
		b.block1();

		A a1 = new B();
		a1.block2();
	}
}

class A {

	public final int value = 10;

	public static void block1() {
		System.out.println("Class A static block1()");
	}

	public final static void block2() {
		System.out.println("Class A  block2()");
	}

	private void block3() {
		System.out.println("Class A block3()");
	}
}

class B extends A {
	public final int value = 10;

	public static void block1() {
		System.out.println("Class B block1()");
	}

	private void block3() {
		System.out.println("Class A block390");
	}
	/*
	 * public final static void block2(){
	 * System.out.println("Class A static method()"); }
	 */
}