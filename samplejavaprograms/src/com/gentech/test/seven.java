package com.gentech.test;
class table
{
	static int sum(int num)
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			int k=num*i;
			sum=sum+k;
		}
		return sum;
	}
}
public class seven {

	public static void main(String[] args) {
		int k=table.sum(2);
		System.out.println("the sum of the table is"+k);

	}

}
