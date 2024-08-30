package com.gentech.methods.returnvalue;
class factorial
{
	int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class Main5 {

	public static void main(String[] args) {
		factorial f=new factorial(); 
		int k=f.fact(5);
		System.out.println("factorial of the number is "+k);

	}

}
