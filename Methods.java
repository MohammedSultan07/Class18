package com.Class18;

import java.util.Scanner;

public class Methods {
//methods describe behaviors of an object.
//methods contain a block of code
//built in methods: Ones that come in the java library. Anything you didn't type yourself is a built in method
//Ex: Scanner & NextLine(); Built in methods are unmodifiable and limited
//user defined methods: Something that a user typed in and defined. 
//Methods with NO parameters: 
//Methods with parameters:
	void myMethod() {
		System.out.println("This is a user defined method that I created");
	}
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		String str="Hello";
		str.replace("Hello","hi");
		Methods a= new Methods();
		a.myMethod();
		a.sayHello("Zain");
		a.sayHello("Asel");
		
		
		
		
	}	
}