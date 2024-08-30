package com.gentech.method.Assignment;
class SecondHalf
{
	void elements(String a[])
	{
		for(int i=(a.length)/2;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
public class Main1 {

	public static void main(String[] args) {
		String s[]= {"ABC","DEF","FGH","IJK","LMN","OPQ"};
		SecondHalf sh=new SecondHalf();
		
		sh.elements(s);
	}

}
