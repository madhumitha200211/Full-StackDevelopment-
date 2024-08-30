package com.gentech.method.Assignment;
class Sum
{
	int sum=0;
	void sum(int a[])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum:"+sum);
	}
}
public class Main2 {

	public static void main(String[] args) {
	Sum s=new Sum();	
	int a[]= {10,20,30,40,50,60};
	s.sum(a);
	}

}
