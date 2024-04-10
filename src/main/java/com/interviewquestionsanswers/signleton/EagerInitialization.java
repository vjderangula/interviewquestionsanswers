package com.interviewquestionsanswers.signleton;

public final class EagerInitialization {
	// https://techvidvan.com/tutorials/java-singleton-class/
	private static EagerInitialization eagerInitialization = new EagerInitialization();
	public String str;
	private EagerInitialization() {
		str = "This is Sreenu";
	}
	public static EagerInitialization getInstance() {
		return eagerInitialization;
	}

	public static void main(String[] args) {
		
		EagerInitialization ei = EagerInitialization.getInstance();
		System.out.println(ei.str);
		System.out.println(ei.str.toUpperCase());

	}

}
