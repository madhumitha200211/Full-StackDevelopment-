package com.gentech.methods.returnvalue;
class tables
{
	int[] seven(int num)
	{
		int a[]=new int[10];
		for(int i=9;i>=0;i--)
		{
			a[i]=num*(i+1);
		}
		return a;
	}
}
public class Main8 {

	public static void main(String[] args) {
		tables t=new tables();
		int r[]=t.seven(7);
		for(int i=9;i>=0;i--)
		{
			System.out.println(r[i]);
		}

	}

}
