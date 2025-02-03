package com.mphasis.Demo1;

public class Circle extends Shape
{
	double r;
	public Circle(double ra)
	{
		this.r=ra;
	}
	
	double calculateArea()
	{
		return 3.14*r*r;
		
	}
	
	public static void main(String args[])
	{
		Circle c=new Circle(5);
		System.out.println(c.calculateArea());
	}
}