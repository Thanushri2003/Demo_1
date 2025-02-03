package com.mphasis.Demo1;

public class Staticpra
{
	static int a,b;
	
	public Staticpra(int aa,int bb)
	{
		this.a=aa;
		this.b=bb;
	}
	
	public static void area()
	{
		int area=a*b;
		System.out.println(area);
	}
	
	public static void main(String args[])
	{
		Staticpra p=new Staticpra(10,20);
		p.area();
	}
	
}
