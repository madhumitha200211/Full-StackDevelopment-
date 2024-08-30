package com.gentech.methods;
class Count1
{
	void count()
	{
	  int count=0;
	  for(int i=50;i<=150;i++)
	  {
	 	if(i%6==0)
		{
			count++;
		}
	 }
	  System.out.println("Count:"+count);
	}
}
public class count {
	public static void main(String[] args) {
		Count1 c=new Count1();
		c.count();
	}
}
