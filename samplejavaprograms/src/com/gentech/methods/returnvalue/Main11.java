package com.gentech.methods.returnvalue;
class Concatenation
{
	String concat(String a[])
	{
		String conc="";
		for(int i=0;i<=a.length-1;i++)
		{
				conc+=a[i];
			
		}
		return conc;
	}
}
public class Main11 {

	public static void main(String[] args) {
	String a[]= {"ABC","DEF","GHI","JKL"};
	Concatenation c=new Concatenation();
	String k=c.concat(a);
	System.out.println(k);
	}

}
