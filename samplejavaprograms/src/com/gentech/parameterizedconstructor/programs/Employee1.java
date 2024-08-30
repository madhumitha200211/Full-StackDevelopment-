package com.gentech.parameterizedconstructor.programs;


class Emp
{
	int Empid1;
	String EmpName1;
	String Address1;
	String job1;
	int PhoneNo1;
	int salary1;
	Emp(int Empid,String EmpName,String Address,String job,int PhoneNo,int salary)
	{
		Empid1=Empid;
		EmpName1=EmpName;
		Address1=Address;
		job1=job;
		PhoneNo1=PhoneNo;
		salary1=salary;
		System.out.println("Employee id is "+Empid);
		System.out.println("employee name is "+EmpName);
		System.out.println("Address is "+Address);
		System.out.println("job : "+job);
		System.out.println("PhoneNo : "+PhoneNo);
		System.out.println("Salary:"+salary);
		System.out.println();
	}
}
class Dept
{
	int Deptno1;
	String Deptname1;
	String Location1;
	int NoOfEmployees1;
	int OperatingHours1;
	Dept(int Deptno,String Deptname,String Location,int NoOfEmployees,int OperatingHours)
	{
	Deptno1=Deptno;
	Deptname1=Deptname;
	Location1=Location;
	NoOfEmployees1=NoOfEmployees;
	OperatingHours1=OperatingHours;
	System.out.println("Department number is "+Deptno);
	System.out.println("Department name is "+Deptname);
	System.out.println("Location is "+Location);
	System.out.println("No Of Employees: "+NoOfEmployees);
	System.out.println("Operating Hours: "+OperatingHours);
	System.out.println();
	}
	
}
class Insurance
{
	int InsuranceNo1;
	String InsuranceName1;
	String InsuranceType1; 
	int Amount1;
	String Payment1;
	Insurance(int InsuranceNo,String InsuranceName,String InsuranceType,int Amount,String Payment)
	{
		InsuranceNo1=InsuranceNo;
		InsuranceName1=InsuranceName;
		InsuranceType1=InsuranceType; 
		Amount1=Amount;
		Payment1=Payment;
		
		System.out.println("Insurance Number: "+InsuranceNo);
		System.out.println("Insurance Name: "+InsuranceName);
		System.out.println("Insurance Type: "+InsuranceType);
		System.out.println("Amount is "+Amount);
		System.out.println("Payment Type: "+Payment);
		System.out.println();
		
	}
}
public class Employee1 {

	public static void main(String[] args) {
		
		Emp Employee=new Emp(101,"Madhu","Bangalore","Software Developer",237727982,38000);
		Dept Department=new Dept(101,"CSE","BANGALORE",1000,7);
		Insurance I=new Insurance(1,"LIC","HEALTH",50000,"ONLINE");
		
		
	}

}

