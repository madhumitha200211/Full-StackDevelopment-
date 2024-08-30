package com.gentech.inheritance.Assignment;
class Person
{
	Person(String name)
	{
		System.out.println("Name: "+name);
	}
}
class Employee extends Person
{
	Employee(String name,int Empid)
	{
		super(name);
		System.out.println("Employee Id: "+Empid);
	}
}
class Department extends Employee
{
	Department(String name,int Empid,String deptname)
	{
		super(name,Empid);
		System.out.println("Department Name: "+deptname);
		
	}
}
public class MultiLevelParameterized {
	public static void main(String[] args) {
		Department o=new Department("Madhu",101,"CSE");
	}
}
