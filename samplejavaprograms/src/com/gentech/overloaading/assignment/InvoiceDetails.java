package com.gentech.overloaading.assignment;
class Invoice
{
	Invoice(String InvoiceNumber)
	{
		System.out.println("INVOICE NUMBER: "+InvoiceNumber);
		System.out.println();
	}
	Invoice(int InvoiceID,String CustomerName)
	{
		System.out.println("INVOICE NUMBER: "+InvoiceID);
		System.out.println();
		System.out.println("CUSTOMER NAME: "+CustomerName);
		System.out.println();
	}
	Invoice(double Amount,String IssueDate)
	{
		System.out.println("INVOICE NUMBER: "+Amount);
		System.out.println();
		System.out.println("ISSUE DATE : "+IssueDate);
	}
	
	
}
public class InvoiceDetails {

	public static void main(String[] args) {
		
		Invoice invoice2 = new Invoice("INV67890");
		Invoice invoice3 = new Invoice(1001,"MADHU");
		Invoice invoice4 = new Invoice(250.75,"12-06-2024");
		
	}

}
