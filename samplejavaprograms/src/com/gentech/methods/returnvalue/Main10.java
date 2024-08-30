package com.gentech.methods.returnvalue;
class TwoDArray
{
	short[][] diagnol(short a[][])
	{
		short k[][]=new short[a.length][a[0].length];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				if(i==j)
				{
					k[i][j]=a[i][j];
				}
			}
		}
		return k;
	}
}
public class Main10 {

	public static void main(String[] args) {
	short a[][]= {{5,10,15},{20,25,30},{35,40,45}};
	TwoDArray t=new TwoDArray();
	short s[][]=t.diagnol(a);
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a[i].length-1;j++)
		{
			if(i==j)
			{
				System.out.print(s[i][j]+" ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	}

}
