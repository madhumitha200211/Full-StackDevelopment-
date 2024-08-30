package com.gentech.parameterizedconstructor.programs;

class Country2
{
	String CountryName;
	int CountryId;
	int population;
	String CapitalCity;
	String Currency;
	Country2(String CountryName1,int CountryId1,int population1,String CapitalCity1,String Currency1)
	{
		CountryName=CountryName1;
		CountryId=CountryId1;
		population=population1;
		CapitalCity=CapitalCity1;
		Currency=Currency;
		System.out.println("COUNTRY NAME : "+CountryName);
		System.out.println("COUNTRY ID : "+CountryId);
		System.out.println("Population : "+population);
		System.out.println("CapitalCity NAME : "+CapitalCity);
		System.out.println("Currency : "+Currency);
		System.out.println();
	}
	
}
class State2
{
	String StateName;
	int StateId;
	int CountryId;
	String Language;
	int Population;
	State2(String StateName1,int StateId1,int CountryId1,String Language1,int Population1)
	{
		StateName=StateName1;
		StateId=StateId1;
		CountryId=CountryId1;
		Language=Language1;
		Population=Population1;
		System.out.println("STATE NAME : "+StateName);
		System.out.println("STATE ID : "+StateId);
		System.out.println("CountryId : "+CountryId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
		System.out.println();
	}
}
class District2
{
	String DistrictName;
	int StateId;
	int DistrictId;
	String Language;
	int Population;
	District2(String DistrictName1,int StateId1,int DistrictId1,String Language1,int Population1)
	{
		DistrictName=DistrictName1;
		StateId=StateId1;
		DistrictId=DistrictId1;
		Language=Language1;
		Population=Population1;
		System.out.println("DISTRICT NAME : "+DistrictName);
		System.out.println("STATE ID : "+StateId);
		System.out.println("DistrictId : "+DistrictId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
		System.out.println();
	}
}
class Village2
{
	String VillageName;
	int VillageId;
	int DistrictId;
	String Language;
	int Population;
	Village2(String VillageName1,int VillageId1,int DistrictId1,String Language1,int Population1)
	{
		VillageName=VillageName1;
		VillageId=VillageId1;
		DistrictId=DistrictId1;
		Language=Language1;
		Population=Population1;
		System.out.println("Village NAME : "+VillageName);
		System.out.println("VILLAGE ID : "+VillageId);
		System.out.println("DistrictId : "+DistrictId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
	}
	
}

public class CSDV2 {

	public static void main(String[] args) {
		Country2 c =new Country2("India",1000,2000000,"Hindi","INR");
		State2 s=new State2("Karnataka",2776,57565,"KANNADA",475857);
		District2 d=new District2("RAMAGAR",47448,465585,"kannada",857585);
		Village2 v=new Village2("Harihara",83637,95754,"kannada",976585);

	}

}
