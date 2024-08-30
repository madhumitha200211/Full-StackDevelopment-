package com.gentech.method.Assignment;
class PrimeNo
{
	void prime()
	{
		for(int i=1;i<=50;i++)
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
				System.out.println(i);
			}
		}
	}
}
public class Main11 {

	public static void main(String[] args) {
		PrimeNo p=new PrimeNo();
		p.prime();
	}

}
