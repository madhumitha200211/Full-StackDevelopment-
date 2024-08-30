package com.gentech.method.Assignment;
class PrimeNoCount
{
	void count1()
	{
		int count=0;
		for(int i=50;i<=150;i++)
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
				count=count+1;
				
			}
			
		}
		System.out.println("COUNT IS "+count);
	}
	
}
public class Main12 {

	public static void main(String[] args) {
		PrimeNoCount p=new PrimeNoCount();
		p.count1();
	}

}
