package com.gentech.methods;
class Sum1
{
	void sum()
	{
		int sum=0;
		for(int i=0;i<=50;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of the Numbers: "+sum);
	}
}
public class sum {

	public static void main(String[] args) {
		Sum1 s=new Sum1();
		s.sum();
		
	}

}
