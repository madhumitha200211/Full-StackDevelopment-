package com.gentech.test;
class Brand
{
	static String Laptopname(String name)
	{
		return name;
	}
}
public class two {

	public static void main(String[] args) {
		String k=Brand.Laptopname("DELL");
		System.out.println("The name of the laptop is:"+k);
	}

}
