package com.gentech.method.Assignment;
class Table
{
	void tables()
	{
		for(int i=1;i<=10;i++)
		{
			int res=20*i;
			System.out.println("20 * "+i+" = "+res);
		}
	}
}
public class Main6 {
	public static void main(String args[]) {
		Table t=new Table();
		t.tables();
	}

}
