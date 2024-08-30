package com.gentech.parameterizedconstructor.programs;

class Student2
{
	String StdName;
	String RigNo;
	int Phnno;
	String Address;
	String ParentName;
	int ParentPhnno;
	Student2(String StdName1,String RigNo1,int Phnno1,String Address1,String ParentName1,
	int ParentPhnno1)
	{
		StdName=StdName1;
		RigNo=RigNo1;
		Phnno=Phnno1;
		Address=Address1;
		ParentName=ParentName1;
		ParentPhnno=ParentPhnno1;	
		System.out.println("StdNAme is:"+StdName);
		System.out.println("RigNo is:"+RigNo);
		System.out.println("Phonenum is:"+Phnno);
		System.out.println("Parent name is:"+ParentName);
		System.out.println("Parent phone no is:"+ParentPhnno);		
	}
}
class Library2
{
	String LibName;
	String Location;
	int LibId;
	int NoOfBooks;
	Library2(String LibName1,String Location1,int LibId1,int NoOfBooks1)
	{
                    
		LibName=LibName1;
		Location=Location1;
		LibId=LibId1;
		NoOfBooks=NoOfBooks1;
		System.out.println("Lib name is:"+LibName);
		System.out.println("Lib Location is:"+Location);
		System.out.println("Lib Id is:"+LibId);
		System.out.println("Lib no of books is:"+NoOfBooks);
		
	}
}
class Sports2
{
	 int SportsId;
	 String SportsName;
	 String Item;
	 String Participate;
	 Sports2( int SportsId1,String SportsName1,String Item1,String Participate1)
	 {
		 SportsId=SportsId1;
		 SportsName=SportsName1;
		 Item=Item1;
		 Participate=Participate1;
		 System.out.println("Sportsid :"+SportsId);
		 System.out.println("SportsNameS:"+SportsName);
		 System.out.println("Sportsitem:"+Item);
		 System.out.println("Participate:"+Participate);
	 }
}
class ComputerLab2
{
	int Labid;
	int Noofsystem;
	String Faculty;
	String Rule;
	ComputerLab2(int Labid1,int Noofsystem1,String Faculty1,String Rule1)
	{
		Labid=Labid1;
		Noofsystem=Noofsystem1;
		Faculty=Faculty1;
		Rule=Rule1;
		System.out.println("Lab id is:"+Labid);
		System.out.println("No of system:"+Noofsystem);
		System.out.println("rule is:"+Rule);
		System.out.println("Faculty is:"+Faculty);
		
	}
}	 
		 
public class college{
	public static void main(String args[])
	{
	Student2 Std1=new Student2("Darshan","4MG20CS043",990182017,"Benglore","Raju",88363936);
	Library2 lib1=new Library2("PHYSICS","BANGLORE",100,1000);
	Sports2 sp1=new Sports2(11,"Badmiton","Settle","vijith");
	ComputerLab2 Comp1=new ComputerLab2(1,100,"Rani","Please make Computer shutdown before leaving");
	}
}
