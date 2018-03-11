package com.qa.oops;

 abstract class Shape {
	int no_of_sides;
	double height ;
	double width;
	double length ;
	double area;
	double perimeter;
	
	abstract void calcuteArea();
	abstract void calculatePerimeter();
	public void setSide(){
		double length;
		double width;
		double height; 
	}
	
	}
	
 abstract  class Triangle  extends Shape{
		
	 @Override
	 public void calcuteArea(){
		 width =20;
		 height =4;
		 area= (width*height)/2;	
		 System.out.println(area);
	
	}
	 
}
 
abstract class Square extends Shape{
	 @Override
	 public void calculatePerimeter(){	
		 perimeter = length+length+length+length;
	 }
}
 
 
