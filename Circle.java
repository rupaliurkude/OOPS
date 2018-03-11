package com.qa.oops;

abstract class Circle extends Shape implements ShapeConstants{
	double a;
	double b;
	double diamemeter;
	double Radius;
public Circle(double a,double b ) {
	this.a=a;
	this.b=b;
}
public void radius(){
	Radius = diamemeter/2;
}

public void Area(){
	area = pi*Radius*Radius;
	System.out.println(area);
}
public void Perimeter(){
	perimeter =2 *pi*Radius;
}

}
