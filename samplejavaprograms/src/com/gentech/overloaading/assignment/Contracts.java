package com.gentech.overloaading.assignment;
class contract
{
    contract(String Cname,int CId)
    {
        System.out.println("Contract name is:"+Cname);
        System.out.println();
        System.out.println("contract id is:"+CId);
        System.out.println();
    }
    contract(String StartDate,String EndDate)
    {
        System.out.println("start date is:"+StartDate);
        System.out.println();
        System.out.println("End date is:"+EndDate);
        System.out.println();
    }
    contract(String Type)
    {
        System.out.println("C type is:"+Type);
    }
}


class Contracts {

	public static void main(String[] args) {
		contract c1=new contract("Lease agreement",501);
        contract c2=new contract("2024-11-04","2025-10-09");
        contract c3=new contract("EMPLOYEMENT");
	}

}
