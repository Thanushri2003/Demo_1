package com.mphasis.Demo1;

public class Triangle extends Shape
{
	double l,b;
	public Triangle(double l,double b)
	{
		this.l=l;
		this.b=b;
		
	}
	
	double calculateArea()
	{
		return 1/2*l*b;
		
	}
	
	public static void main(String args[])
	{
		Triangle c=new Triangle(5,6);
		System.out.println(c.calculateArea());
	}
}