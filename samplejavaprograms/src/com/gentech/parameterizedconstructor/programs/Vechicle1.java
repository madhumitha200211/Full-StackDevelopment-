package com.gentech.parameterizedconstructor.programs;

class TwoWheeler2
{
	 String TwoWhName;
	 String TwoWhNo;
	 String TwoWhColor;
	 String Owner;
	 int Amount;
	 TwoWheeler2(String TwoWhName1,String TwoWhNo1,String TwoWhColor1,String Owner1,int Amount1)
	 {
		 TwoWhName=TwoWhName1;
		 TwoWhNo=TwoWhNo1;
		 TwoWhColor=TwoWhColor1;
		 Owner=Owner1;
		 Amount=Amount1;
		 System.out.println("TwoWhaname:"+TwoWhName);
		 System.out.println("TwoWhaNo:"+TwoWhNo);
		 System.out.println("twoWhColor:"+TwoWhColor);
		 System.out.println("TwoWhowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
		 System.out.println();
	 }
}
class FourWheeler2
{
	 String FourWhName;
	 String FourWhNo;
	 String FourWhColor;
	 String Owner;
	 int Amount;
	 FourWheeler2(String FourWhName1,String FourWhNo1,String FourWhColor1,String Owner1,int Amount1)
	 {
		 FourWhName=FourWhName1;
		 FourWhNo=FourWhNo1;
		 FourWhColor=FourWhColor1;
		 Owner=Owner1;
		 Amount=Amount1;
		 System.out.println("FourWhaname:"+FourWhName);
		 System.out.println("FourWhaNo:"+FourWhNo);
		 System.out.println("FourWhColor:"+FourWhColor);
		 System.out.println("FourWhowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
		 System.out.println();
		 
	 } 
}
class HeavyVehicle2
{
	 String HeavyVehicleName;
	 String HeavyVehicleNo;
	 String HeavyVehicleColor;
	 String Owner;
	 int Amount;
	 HeavyVehicle2( String HeavyVehicleName1,String HeavyVehicleNo1,String HeavyVehicleColor1,String Owner1,int Amount1)
	 {
		 HeavyVehicleName=HeavyVehicleName1;
		 HeavyVehicleNo=HeavyVehicleNo1;
		 HeavyVehicleColor=HeavyVehicleColor;
		 Owner=Owner1;
		 Amount=Amount1; 
		 System.out.println("HeavyVehiclename:"+HeavyVehicleName);
		 System.out.println("HeavyVehicleNo:"+HeavyVehicleNo);
		 System.out.println("HeavyVehicleColor:"+HeavyVehicleColor);
		 System.out.println("HeavyVehicleowner:"+Owner);
		 System.out.println("Amount is:"+Amount);
		 System.out.println();
	 } 
}


public class Vechicle1 {
	public static void main(String[] args)
	{
		TwoWheeler2 Wh2=new TwoWheeler2("RX","KD865","BLACK","MADHU",120000);
		FourWheeler2 Wh4=new FourWheeler2("Car","KD865yh","Blue","SAHANA",1220000);
		HeavyVehicle2 HeavyVeh=new HeavyVehicle2("JCB","KD63FG","Blue","VINU",1220000);
	}

}
