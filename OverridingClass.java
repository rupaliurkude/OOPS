package com.qa.oops;

public class OverridingClass {
	//method overriding
		public void name(){
			System.out.println("I am Animal ");
		}
	}


	class Dog extends OverridingClass{
		@Override
		public void name(){
			System.out.println("I am dog ");
		}
		public  static void main(String []arg){
		OverridingClass o = new Dog();//upcasting
		o.name();
	}

}

