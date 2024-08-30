package com.gentech.inheritance.Assignment;
class Animal
{
	void dog()
	{
		System.out.println("Dog is an animal");
	}
}
class action extends Animal
{
	void Action()
	{
		System.out.println("The dog is barking");
	}
}
class color extends action
{
	void color()
	{
		System.out.println("Color of the dog is brown");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		color dog=new color();
		dog.dog();
		dog.Action();
		dog.color();
		
	}

}
