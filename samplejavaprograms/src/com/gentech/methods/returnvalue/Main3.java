package com.gentech.methods.returnvalue;
class Short1
{
	short[] display(short a[])
	{
		short k[]=new short[a.length];
		for(int i=a.length/2;i<=a.length-1;i++)
		{
			k[i]=a[i];
		}
		return k;
	}
}
public class Main3 {

	public static void main(String[] args) {
		short a[]= {21,34,45,67,89,99};
		Short1 s=new Short1();
		short b[]=s.display(a);
		for(int i=a.length/2;i<=a.length-1;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}

}
