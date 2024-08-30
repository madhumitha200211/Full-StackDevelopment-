package com.gentech.test;
class fact1
{
	static int factorial(int num)
	{
		int k=1;
		for(int i=1;i<=num;i++)
		{
			 k=num*k;
			 
		}
		return k;
	}
}
public class ten {
	public static void main(String[] args) {
		int k=fact1.factorial(5);
		System.out.println("the factorial:"+k);

	}
}
