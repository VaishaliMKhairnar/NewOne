package com.csi.core;
class A{
	void get(int a) {
		System.out.println("GET method");
	}
	 void get( String b) {
		System.out.println("Same Method");
	}
}
public class Employee {
public static void main(String[] args) {
A a=new A();
a.get(13);
a.get("veer");
}
}
