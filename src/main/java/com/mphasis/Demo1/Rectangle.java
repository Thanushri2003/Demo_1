package com.mphasis.Demo1;

public class Rectangle extends Shape
{
	double l,b,h;
	public Rectangle(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	double calculateArea()
	{
		return l*b*h;
		
	}
	
	public static void main(String args[])
	{
		Rectangle c=new Rectangle(5,6,7);
		System.out.println(c.calculateArea());
		}
}