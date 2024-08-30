package com.gentech.method.Assignment;
class digit
{
	
	void digits(int num)
	{
		int count=0;
		if(num==0)
		{
			System.out.println("Single Digit");
		}
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count+" DIGIT NUMBER");
	}
}
public class Main7 {

	public static void main(String[] args) {
	digit d=new digit();
	d.digits(1000);
	}

}
