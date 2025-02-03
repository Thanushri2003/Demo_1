package com.mphasis.Demo1;
import java.util.*;

public class Emp
{
	int id;
	String name;
	float sal;
	
	public Emp(int a,String n,float s)
	{
		this.id=a;
		this.name=n;
		this.sal=s;
	}
	public void calsal()
	{
		float p=this.sal+this.sal*(10/100);
		System.out.println(p);
	}
	public void setName(String na)
	{
		this.name=na;
	}
	
	public float getSal()
	{
		return this.sal;
	}
	
	public String tostring()
	{
		return getClass()+"emp id:"+this.id+"emp name:"+this.name;
	}
	
	public static void main(String[] args)
	{
		Emp e=new Emp(1,"thanu",500000);
		e.calsal();
		e.setName("sarukshana");
		e.getSal();
		System.out.println(e.tostring());
		System.out.println(e);
		System.out.println("done");
	}
}