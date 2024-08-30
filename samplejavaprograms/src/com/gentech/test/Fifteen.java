package com.gentech.test;
class count1
{
	int display()
	{
		int count=0;
		for(int i=30;i<=50;i++)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		return count;
	}
}
public class Fifteen {

	public static void main(String[] args) {
		count1 c=new count1();
		int c1=c.display();
		System.out.println(c1);
	}

}
