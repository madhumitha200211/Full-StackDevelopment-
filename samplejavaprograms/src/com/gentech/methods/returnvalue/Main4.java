package com.gentech.methods.returnvalue;
class double1
{
	double[] reverse1(double a[])
	{
		double k[]=new double[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			k[i]=a[i];
		}
		return k;
	}
}
public class Main4 {

	public static void main(String[] args) {
		double a[]= {12.56,39.76,26.43,49.50,60.32,32.33};
		double1 d=new double1();
		double b[]=d.reverse1(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}

}
