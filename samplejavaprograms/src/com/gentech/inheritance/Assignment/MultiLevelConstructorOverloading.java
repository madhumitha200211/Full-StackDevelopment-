package com.gentech.inheritance.Assignment;
class Numbers
{
	Numbers(int x,int y)
	{
		System.out.println("The two numbers are: "+x+" ,"+y);
	}
	Numbers(int x,int y,int z)
	{
		System.out.println("The three numbers are: "+x+" ,"+y+" ,"+z);
	}
}
class Addition extends Numbers
{
	Addition(int x,int y)
	{
		super(x,y);
		int z;
		z=x+y;
		System.out.println("The sum Of two Numbers: "+z);
	}
	Addition(int w,int x,int y)
	{
		
		super(w,x,y);
		int z;
		z=x+y+w;
		System.out.println("The sum of three numbers: "+z);
	}
}
class Multiplication extends Addition
{
	Multiplication(int x,int y)
	{
		super(x,y);
		int z;
		z=x*y;
		System.out.println("The difference between the two Numbers: "+z);
	}
	Multiplication(int w,int x,int y)
	{
		
		super(w,x,y);
		int z;
		z=w*x*y;
		System.out.println("The Multiplication of the three numbers: "+z);
	}
}

public class MultiLevelConstructorOverloading {

	public static void main(String[] args) {
		Multiplication o=new Multiplication(20,10);
		System.out.println("****************************************");
		Multiplication o1=new Multiplication(30,20,10);
		
	}

}
