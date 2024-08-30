package com.gentech.test;
class voting
{
	static boolean vote(int age)
	{
		if(age>=18)
		{
			return true;
		}
		return false;
	}
}
public class five {

	public static void main(String[] args) {
	boolean result=voting.vote(19);
	if(result=true)
	{
		System.out.println("the person can vote");
	}
	else if(result==false)
	{
		System.out.println("the person cannot vote");
	}
		
	}

}
