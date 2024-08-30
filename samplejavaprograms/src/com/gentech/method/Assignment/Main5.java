package com.gentech.method.Assignment;
class DoubleArray
{
	void sum(double a[][])
	{
		
		double sum=0.0;
		int i=1;
		for(int j=0;j<=a[i].length-1;j++)
		{
			sum+=a[i][j];
		}
		System.out.println("SUM: "+sum);
	}
	
}
public class Main5 {
	
	public static void main(String[] args) {
	double a[][]= {{72.45,94.34,74.56},{20.48,59.36,62.32},{24.84,37.37,42.36}};
	DoubleArray d=new DoubleArray();
	d.sum(a);

	}

}
