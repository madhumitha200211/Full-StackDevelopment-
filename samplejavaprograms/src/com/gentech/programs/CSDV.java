package com.gentech.programs;
class Country
{
	String CountryName;
}
class State
{
	String StateName;
}
class District
{
	String DistrictName;
}
class Village
{
	String VillageName;
}

public class CSDV {

	public static void main(String[] args) {
		Country c =new Country();
		c.CountryName="INDIA";
		System.out.println("COUNTRY NAME : "+c.CountryName);
		State s=new State();
		s.StateName="karnataka";
		System.out.println("STATE NAME : "+s.StateName);
		District d=new District();
		d.DistrictName="BANGALORE";
		System.out.println("DISTRICT NAME : "+d.DistrictName);
		Village v=new Village();
		v.VillageName="UPUPI";
		System.out.println("VILLAGE NAME : "+v.VillageName);
		
		

	}

}
