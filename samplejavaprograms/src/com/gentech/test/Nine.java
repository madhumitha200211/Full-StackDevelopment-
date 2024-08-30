package com.gentech.test;
class Transpose
{
   static
   {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		transpose(a);
   }
   static void transpose(int a[][])
	{
	    for(int i=0;i<=a.length-1;i++)
		{
		   for(int j=0;j<=a[0].length-1;j++)
		   {
				
				System.out.print(a[j][i]+" ");
		   }
		   System.out.println();
		}
	}
}
public class Nine
{
	public static void main(String args[])
	{
		Transpose t=new Transpose();
		
	}
}