package com.gentech.programs;
class TwoWheelers
{
	String TwoWheelersVehicleName;
	String TwoWheelersVehicleNumber;
	String TwoWheelersOwner;
}
class FourWheelers
{
	String FourWheelersVehicleName;
	String FourWheelersVehicleNumber;
	String FourWheelersOwner;
}
class HeavyVehicle
{
	String HeavyVehicleName;
	String VehicleNumber;
	String Owner;
}

public class Vehicle {

	public static void main(String[] args) {
		TwoWheelers TwoWheelersDetails=new TwoWheelers();
		TwoWheelersDetails.TwoWheelersVehicleName="DIO";
		TwoWheelersDetails.TwoWheelersVehicleNumber="KA052610";
		TwoWheelersDetails.TwoWheelersOwner="MADHU";
		System.out.println("Name: "+TwoWheelersDetails.TwoWheelersVehicleName);
		System.out.println("Vehicle Number :"+TwoWheelersDetails.TwoWheelersVehicleNumber);
		System.out.println("Vehicle owner :"+TwoWheelersDetails.TwoWheelersOwner);
		System.out.println();
		FourWheelers FourWheelersDetails=new FourWheelers();
		FourWheelersDetails.FourWheelersVehicleName="Swift";
		FourWheelersDetails.FourWheelersVehicleNumber="KA083038";
		FourWheelersDetails.FourWheelersOwner="MITHA";
		System.out.println("Name: "+FourWheelersDetails.FourWheelersVehicleName);
		System.out.println("Vehicle Number :"+FourWheelersDetails.FourWheelersVehicleNumber);
		System.out.println("Vehicle owner :"+FourWheelersDetails.FourWheelersOwner);
		System.out.println();
		HeavyVehicle HeavyVehicleDetails=new HeavyVehicle();
		HeavyVehicleDetails.HeavyVehicleName="truck";
		HeavyVehicleDetails.VehicleNumber="KA093847";
		HeavyVehicleDetails.Owner="SOWMYA";
		System.out.println("Name: "+HeavyVehicleDetails.HeavyVehicleName);
		System.out.println("Vehicle Number :"+HeavyVehicleDetails.VehicleNumber);
		System.out.println("Vehicle owner :"+HeavyVehicleDetails.Owner);
	}

}
