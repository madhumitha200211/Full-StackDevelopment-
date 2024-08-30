package com.gentech.programs;
class Product {
    String name;
    int price;
}

class Sales {
    String name;
    int price;
}

class Order {
    String name;
    int price;
}

class Invent {
    String name;
    int price;
}

public class Inventory {

	public static void main(String[] args) {
		
		Product product = new Product();
        product.name = "PHONE";
        product.price = 20000;
        System.out.println("Product Name: " + product.name);
        System.out.println("Product Price: " + product.price);
        System.out.println();

        Sales sales = new Sales();
        sales.name = "ECOMMERCE";
        sales.price = 35000;
        System.out.println("Sales Name: " + sales.name);
        System.out.println("Sales Price: " + sales.price);
        System.out.println();

        Order order = new Order();
        order.name = "AMAZON";
        order.price = 45000;
        System.out.println("Order Name: " + order.name);
        System.out.println("Order Price: " + order.price);
        System.out.println();

        Invent inventory = new Invent();
        inventory.name = "Warehouse";
        inventory.price = 304000;
        System.out.println("Inventory Name: " + inventory.name);
        System.out.println("Inventory Price: " + inventory.price);
	}

}
