package com.gentech.overloaading.assignment;
class Product
{
	Product(String ProductName,double Price)
	{
		System.out.println("PRODUCT NAME : "+ProductName);
		System.out.println();
		System.out.println("Price: "+Price);
		System.out.println();
	}
	Product(String DeveloperName,float ratings)
	{
		System.out.println("Developer Name : "+DeveloperName);
		System.out.println();
		System.out.println("Ratings: "+ratings);
		System.out.println();
	}
	Product(int ActiveUsers,String version)
	{
		
		System.out.println("ActiveUsers: "+ActiveUsers);
		System.out.println();
		System.out.println("version : "+version);
		System.out.println();
		
	}
}
public class SoftwareProduct {

	public static void main(String[] args) {
		Product p=new Product("PRODUCT A",50000);
		Product p1=new Product("MADHU",4.0f);
		Product p2=new Product(15,"5.0");
		
	}

}
