package com.gentech.method.Assignment;
class TransposeMatrix
{
	void Transpose(int a[][])
	{
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				
					System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
		}
	}
}
public class Main4 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		TransposeMatrix tm=new TransposeMatrix();
		tm.Transpose(a);
	}

}
