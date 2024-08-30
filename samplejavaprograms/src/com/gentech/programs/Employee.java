package com.gentech.programs;
class Emp
{
	int EmpNo;
	String  Ename;
	String Address;
	int Salary;
	
}
class Dept
{
	int Deptno;
	String Deptname;
	
}
class Insurance
{
	int InsuranceNo;
	String InsuranceName;
	String InsuranceType;
}
public class Employee {

	public static void main(String[] args) {
		
		Emp employee=new Emp();
		employee.EmpNo=1;
		employee.Ename="Madhu";
		employee.Address="Bangalore";
		employee.Salary=25000;
		System.out.println("Employee Number is : "+employee.EmpNo);
		System.out.println("Employee Name is "+employee.Ename);
		System.out.println("Employee Address: "+employee.Address);
		System.out.println("Employee Salary: "+employee.Salary);
		System.out.println();
		Dept Department=new Dept();
		Department.Deptno=101;
		Department.Deptname="CSE";
		System.out.println("Department Number is : "+Department.Deptno);
		System.out.println("Department Name is "+Department.Deptname);
		System.out.println();
		Insurance InsuranceDetails=new Insurance();
		InsuranceDetails.InsuranceNo=1;
		InsuranceDetails.InsuranceName="LIC";
		InsuranceDetails.InsuranceType="Health";
		System.out.println("Insurance Number is : "+InsuranceDetails.InsuranceNo);
		System.out.println("Insurance Name is "+InsuranceDetails.InsuranceName);
		System.out.println("Insurance Type: "+InsuranceDetails.InsuranceType);
		
	}

}
