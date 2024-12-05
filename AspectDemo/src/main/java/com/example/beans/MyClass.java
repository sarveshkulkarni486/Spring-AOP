package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class MyClass {
	public void m1() {
		System.out.println("In m1 method");
	}
	public void m2() {
		System.out.println("In m2 method");
	}
	public void m3(int x) {
		System.out.println("in m3 method"+x);
	}
	public void getX() {
		System.out.println("In getx method");
	}

}
