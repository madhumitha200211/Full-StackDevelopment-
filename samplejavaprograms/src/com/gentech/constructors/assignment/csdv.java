package com.gentech.constructors.assignment;


class Country
{
	String CountryName;
	int CountryId;
	int population;
	String CapitalCity;
	String Currency;
	Country()
	{
		CountryName="INDIA";
		CountryId=1;
		population=287989169;
		CapitalCity="DELHI";
		Currency="INR";
		System.out.println("COUNTRY NAME : "+CountryName);
		System.out.println("COUNTRY ID : "+CountryId);
		System.out.println("Population : "+population);
		System.out.println("CapitalCity NAME : "+CapitalCity);
		System.out.println("Currency : "+Currency);
		System.out.println();
	}
	
}
class State
{
	String StateName;
	int StateId;
	int CountryId;
	String Language;
	int Population;
	State()
	{
		StateName="KARNATAKA";
		StateId=101;
		CountryId=1;
		Language="KANNADA";
		Population=4500000;
		System.out.println("STATE NAME : "+StateName);
		System.out.println("STATE ID : "+StateId);
		System.out.println("CountryId : "+CountryId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
		System.out.println();
	}
}
class District
{
	String DistrictName;
	int StateId;
	int DistrictId;
	String Language;
	int Population;
	District()
	{
		DistrictName="RAICHUR";
		StateId=101;
		DistrictId=11;
		Language="KANNADA";
		Population=4500000;
		System.out.println("DISTRICT NAME : "+DistrictName);
		System.out.println("STATE ID : "+StateId);
		System.out.println("DistrictId : "+DistrictId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
		System.out.println();
	}
}
class Village
{
	String VillageName;
	int VillageId;
	int DistrictId;
	String Language;
	int Population;
	Village()
	{
		VillageName="Beninganahalli";
		VillageId=501;
		DistrictId=11;
		Language="KANNADA";
		Population=39000;
		System.out.println("Village NAME : "+VillageName);
		System.out.println("VILLAGE ID : "+VillageId);
		System.out.println("DistrictId : "+DistrictId);
		System.out.println("Language Used Mostly: "+Language);
		System.out.println("Population : "+Population);
	}
	
}

public class csdv {

	public static void main(String[] args) {
		Country c =new Country();
		State s=new State();
		District d=new District();
		Village v=new Village();

	}

}
