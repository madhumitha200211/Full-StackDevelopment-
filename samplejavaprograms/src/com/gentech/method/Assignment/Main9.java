package com.gentech.method.Assignment;
class Tables
{
	void tables(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int res=num*i;
			System.out.println(num+" * "+i+" = "+res);
		}
	}
}
public class Main9 {

	public static void main(String[] args) {
		Tables t=new Tables();
		t.tables(6);
	}

}
