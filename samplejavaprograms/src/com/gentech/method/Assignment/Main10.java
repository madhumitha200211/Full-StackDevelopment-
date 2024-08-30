package com.gentech.method.Assignment;
class OneDArray
{
	void OneD(int a[])
	{
	
		for(int i=0;i<=a.length-1;i++)
		{
			 a[i]=a[i]*a[i]*a[i];
			System.out.print(a[i]+" ");
		}
		
	}
	
}
public class Main10 {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,7,8,12};
		OneDArray o=new OneDArray();
		o.OneD(a);
		
	}

}
