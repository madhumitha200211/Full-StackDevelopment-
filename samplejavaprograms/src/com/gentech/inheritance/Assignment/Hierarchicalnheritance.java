package com.gentech.inheritance.Assignment;
class TrafficLight
{
	void signal()
	{
		System.out.println("TRAFFIC SIGNAL:");
	}
}
class RedSignal extends TrafficLight
{
	void red()
	{
		System.out.println("Red:Stop the vehicle");
	}
}
class YellowSignal extends TrafficLight
{
	void yellow()
	{
		System.out.println("Yellow:Ready");
	}
}
class GreenSignal extends TrafficLight
{
	void green()
	{
		System.out.println("Green:The vehicle can go");
	}
}
public class Hierarchicalnheritance {

	public static void main(String[] args) {
		RedSignal t1=new RedSignal();
		t1.signal();
		t1.red();
		System.out.println("--------------------------------------");
		YellowSignal t2=new YellowSignal();
		t2.signal();
		t2.yellow();
		System.out.println("--------------------------------------");
		GreenSignal t3=new GreenSignal();
		t3.signal();
		t3.green();

	}

}
