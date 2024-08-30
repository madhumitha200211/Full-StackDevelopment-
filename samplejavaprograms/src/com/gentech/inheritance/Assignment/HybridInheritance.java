package com.gentech.inheritance.Assignment;
class PersonalInfo 
{
	void info()
	{
		System.out.println("Personal information");
	}
}
class Address extends PersonalInfo 
{
	void Add()
	{
		System.out.println("Address:Bangalore");
	}
}
class Hobbies extends PersonalInfo 
{
	void hobby()
	{
		System.out.println("Madhu hobby is to paint");
	}
}
class Painting extends Hobbies
{
	void paint()
	{
		System.out.println("The painting is colorful");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		Address  h1=new Address();
		h1.info();
		h1.Add();
		System.out.println("************************************");
		Painting h2=new Painting();
		h2.info();	
		h2.hobby();
		h2.paint();
	}

}
