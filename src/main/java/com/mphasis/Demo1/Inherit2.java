package com.mphasis.Demo1;

public class Inherit2 extends Inherit1
{
	public Inherit2(int a,int b)
	{
		super(a,b);
	}
	public static void main(String[] args)

	{
		Inherit2 i=new Inherit2(10,20);
		i.calarea();
		}
}