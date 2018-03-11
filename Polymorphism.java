package com.qa.oops;

public class Polymorphism {
	//method overloading
	public void add(int a , int b){
		int sum = a+b;
		System.out.println(sum);
	}
public void add(int a,int b ,int c){
	int sum = a+b+c;
	System.out.println(sum);

}
	public static void main(String[]arg){
		Polymorphism p = new Polymorphism ();
		p.add(10, 20);
		p.add(10, 20, 30);
	}
}

