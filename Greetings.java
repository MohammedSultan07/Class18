package com.Class18;
public class Greetings {
	void sayHello(String country) {

	switch(country.toLowerCase()){
	case "usa":
	System.out.println("Hello");
		break;
	case "paraguay":
	System.out.println("Hola");
		break;
	default:
		System.out.println("Don't know");
	}
}
	void nameAge(String name, int age) {
		System.out.println("My name is "+ name+" and I am "+age+" yrs old");
	
}
	void weather(boolean snowing) {
		if (snowing) {
			System.out.println("stay home");
		}else {
			System.out.println("go for a walk");
		}
}
	/////1
	void numbers(int a, int b) {
		if (a>b) {
			System.out.println(a+" is greater");
		}else if (b>a){
			System.out.println(b+" is greater");
		}else {
			System.out.println("they are equal");
		}
	}
	/////2
	void evenOdd(int aa) {
		if (aa%2==0) {
			System.out.println(aa+" is even");
		}else if (aa%2==1) {
			System.out.println(aa+" is odd");
		}else {
			System.out.println("aa is Zero");
		}
	}
	/////3
	void palindrome(String c, String d) {
		for (int i=c.length()-1; i>=0;i--) {
			d=d+c.charAt(i);
		}
		System.out.println(d);
		if (d.contentEquals(c)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	public static void main(String[] args) {
		
		Greetings obj= new Greetings();
		obj.sayHello("Usa");
		obj.sayHello("ParaGUAY");
		obj.nameAge("J", 19);
		obj.weather(true);
		obj.weather(false);
		//1
		obj.numbers(19, 16);
		obj.numbers(25, 19);
		//2
		obj.evenOdd(19);
		//3
		obj.palindrome("racecar", "");
	}
	
}