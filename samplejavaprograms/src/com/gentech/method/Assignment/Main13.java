package com.gentech.method.Assignment;
class PrimeNoSum
{
	void sum1()
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				sum+=i;
			}
			
		}
		System.out.println("sum of prime Numbers is "+sum);
	}
}
public class Main13 {

	public static void main(String[] args) {
		PrimeNoSum p=new PrimeNoSum();
		p.sum1();

	}

}
