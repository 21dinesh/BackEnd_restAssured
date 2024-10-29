package com.BankEnd.Testing;

public class A {
	public  A a() {
		System.out.println("execute a method");
		return new A();
	}
	public  A b() {
		System.out.println("execute b mtd");
		return new A();
	}
    public B c() {
    	System.out.println("execute c mtd");
		return new B(); 
    }
}
