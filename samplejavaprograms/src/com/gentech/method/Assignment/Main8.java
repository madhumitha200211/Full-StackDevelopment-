package com.gentech.method.Assignment;
class DigitSum
{
	void digit(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num = num / 10; 
		}
		System.out.println(sum);
	}
}
public class Main8 {

	public static void main(String[] args) {
		DigitSum ds=new DigitSum();
		ds.digit(244);
	}

}
