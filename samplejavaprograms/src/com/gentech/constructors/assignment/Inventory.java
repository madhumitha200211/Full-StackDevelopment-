package com.gentech.constructors.assignment;


class Product {
    String name;
    int price;
    int ProdID;
    int Quantity;
    String Category;
    
    Product()
    {
    	name="PHONE";
        price=50000;
        ProdID=1;
        Quantity=1;
        Category="ELECTRONICS";
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("PRODUCT ID "+ProdID);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Category: "+Category);
        System.out.println();
    }
}

class Sales {
    String name;
    int price;
    int SalesID;
    String Address;
    String Status;
    Sales() 
    {
    	name="ECOMMERCE";
        price=20883;
        SalesID=1;
        Address="BANGALORE";
        Status="COMPLETED";
        System.out.println("SALES NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Sales ID "+SalesID);
        System.out.println("ADDRESS: "+Address);
        System.out.println("Status : "+Status);
    	System.out.println();
    }
}

class Order {
    String name;
    int price;
    int CustomerID;
    String StatusPayment;
    String feedback;
    Order()
    {
    	name="AMAZON";
        price=36480;
        CustomerID=5001;
        StatusPayment="PAID";
        feedback="GOOD";
        System.out.println("ORDER NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Customer ID "+CustomerID);
        System.out.println("StatusPayment: "+StatusPayment);
        System.out.println("feedback : "+feedback);
        System.out.println();
    }
}

class Invent {
    String name;
    int price;
    int ItemId;
    String Brand;
    String Location;
    Invent()
    {
    	name="LAPTOP";
        price=299872;
        ItemId=11;
        Brand="HP";
        Location="BANGALORE";
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("ItemId "+ItemId);
        System.out.println("Brand: "+Brand);
        System.out.println("Location : "+Location);
    }
}
public class Inventory {

	public static void main(String[] args) {
		Product product = new Product();
		Sales sales = new Sales();
		Order order = new Order();
		Invent inventory = new Invent();
	}

}
