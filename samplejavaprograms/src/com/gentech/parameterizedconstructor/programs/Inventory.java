package com.gentech.parameterizedconstructor.programs;


class Product {
    String name1;
    int price1;
    int ProdID1;
    int Quantity1;
    String Category1;
    
    Product(String name,int price,int ProdID,int Quantity,String Category)
    {
    	name1=name;
        price1=price;
        ProdID1=ProdID;
        Quantity1=Quantity;
        Category1=Category;
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("PRODUCT ID "+ProdID);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Category: "+Category);
        System.out.println();
    }
}

class Sales {
    String name1;
    int price1;
    int SalesID1;
    String Address1;
    String Status1;
    Sales(String name,int price,int SalesID,String Address,String Status) 
    {
    	name1=name;
        price1=price;
        SalesID1=SalesID;
        Address1= Address;
        Status1=Status;
        System.out.println("SALES NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Sales ID "+SalesID);
        System.out.println("ADDRESS: "+Address);
        System.out.println("Status : "+Status);
    	System.out.println();
    }
}

class Order {
    String name1;
    int price1;
    int CustomerID1;
    String StatusPayment1;
    String feedback1;
    Order(String name,int price,int CustomerID,String StatusPayment,String feedback)
    {
    	name1=name;
        price1=price;
        CustomerID1=CustomerID;
        StatusPayment1=StatusPayment;
        feedback1=feedback;
        System.out.println("ORDER NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("Customer ID "+CustomerID);
        System.out.println("StatusPayment: "+StatusPayment);
        System.out.println("feedback : "+feedback);
        System.out.println();
    }
}

class Invent {
    String name1;
    int price1;
    int ItemId1;
    String Brand1;
    String Location1;
    Invent(String name,int price,int ItemId,String Brand,String Location)
    {
    	name1=name;
        price1=price;
        ItemId1=ItemId;
        Brand1= Brand;
        Location1=Location;
        System.out.println("PRODUCT NAME : "+name);
        System.out.println("Price"+price);
        System.out.println("ItemId "+ItemId);
        System.out.println("Brand: "+Brand);
        System.out.println("Location : "+Location);
    }
}
public class Inventory {
  public static void main(String[] args) {
	Product product = new Product("PHONE",50000,1,1,"ELECTRONICS");
	Sales sales = new Sales("ECOMMERCE",20883,1,"BANGALORE","COMPLETED");
	Order order = new Order("AMAZON",36480,5001,"PAID","GOOD");
	Invent inventory = new Invent("LAPTOP",299872,11,"HP","BANGALORE");
  }
}
