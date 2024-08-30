package com.gentech.method.Assignment;
class BooleanValues
{
	void reverse(boolean b[])
	{
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}
}
public class Main3 {

	public static void main(String[] args) {
	boolean b[]= {true,false,true,true,false,false};
	BooleanValues bv=new BooleanValues();
	bv.reverse(b);

	}

}
