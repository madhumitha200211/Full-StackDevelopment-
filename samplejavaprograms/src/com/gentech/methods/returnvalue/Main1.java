package com.gentech.methods.returnvalue;
class Elements
{
	int[] Array1(int a[])
	{
		int k[]=new int[a.length];
		for(int i=0;i<a.length/2;i++)
		{
			k[i]=a[i];
		}
		return k;
	}
}
public class Main1 {

	public static void main(String[] args) {
		
		Elements e=new Elements();
		int a[]= {10,20,30,40,50,60,70,80};
		int b[]=e.Array1(a);
		for(int i=0;i<a.length/2;i++)
		{
		  System.out.print(b[i]+" ");
		}
	}

}
