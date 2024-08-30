package com.gentech.methods.returnvalue;
class Square1
{
	int[] element()
	{
		int k[]=new int[10];
		for(int i=0;i<=9;i++)
		{
			k[i]=(i+1)*(i+1);
		}
		return k;
	}
}
public class Main6 {

	public static void main(String[] args) {
		Square1 s=new Square1();
		int a[]=s.element();
		for(int i=0;i<=9;i++)
		{
			System.out.println(a[i]);
		}
	}

}
