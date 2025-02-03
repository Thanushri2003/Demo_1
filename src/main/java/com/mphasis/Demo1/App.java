package com.mphasis.Demo1;

/**
 * Hello world!
 *
 */
public class App 
{;

	public void add(int a,int b)
	{
		int s;
		s=a+b;
		System.out.println("sum:"+s);
	}
	public void addData(String data)
	{
		if(data.equals("thanu"))
		{System.out.println("welcome");
		}
		else {
			System.out.println("byee");
		}
	}
    public static void main( String[] args )
    {
    	App a=new App();
    	a.add(3, 4);
    	a.addData("thanu");
        System.out.println( "Hello World!" );
    }
}

///

