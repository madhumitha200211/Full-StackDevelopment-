package com.gentech.constructors.assignment;


class TwoWheelers
{
	String TwoWheelersVehicleName;
	String TwoWheelersVehicleNumber;
	String TwoWheelersOwner;
	String color;
	int cost;
	TwoWheelers()
	{
		TwoWheelersVehicleName="DIO";
		TwoWheelersVehicleNumber="KA052610";
		TwoWheelersOwner="MADHU";
		color="red";
		cost=100000;
		
		System.out.println("Name: "+TwoWheelersVehicleName);
		System.out.println("Vehicle Number :"+TwoWheelersVehicleNumber);
		System.out.println("Vehicle owner :"+TwoWheelersOwner);
		System.out.println("Vehicle color :"+color);
		System.out.println("Vehicle cost :"+cost);
		System.out.println();
	}

}
class FourWheelers
{
	String FourWheelersVehicleName;
	String FourWheelersVehicleNumber;
	String FourWheelersOwner;
	String color;
	int cost;
	FourWheelers()
	{
		FourWheelersVehicleName="Swift";
		FourWheelersVehicleNumber="KA083038";
		FourWheelersOwner="MITHA";
		color="white";
		cost=320000;
		System.out.println("Name: "+FourWheelersVehicleName);
		System.out.println("Vehicle Number :"+FourWheelersVehicleNumber);
		System.out.println("Vehicle owner :"+FourWheelersOwner);
		System.out.println("Vehicle color :"+color);
		System.out.println("Vehicle cost :"+cost);
		System.out.println();
	}
}
class HeavyVehicle
{
	String HeavyVehicleName;
	String VehicleNumber;
	String Owner;
	String color;
	int cost;
	HeavyVehicle()
	{
		HeavyVehicleName="truck";
		VehicleNumber="KA093847";
		Owner="SOWMYA";
		color="white";
		cost=320000;
		System.out.println("Name: "+HeavyVehicleName);
		System.out.println("Vehicle Number :"+VehicleNumber);
		System.out.println("Vehicle owner :"+Owner);
		System.out.println("Vehicle color :"+color);
		System.out.println("Vehicle cost :"+cost);
	}
}

public class vehicle {

	public static void main(String[] args) {
		TwoWheelers TwoWheelersDetails=new TwoWheelers();
		FourWheelers FourWheelersDetails=new FourWheelers();
		HeavyVehicle HeavyVehicleDetails=new HeavyVehicle();

	}

}
