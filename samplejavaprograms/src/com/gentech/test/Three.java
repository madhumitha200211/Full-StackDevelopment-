package com.gentech.test;
class radius1
{
	
	static double Area1(int r)
	{
		double a;
		a=(3.14)*r*r;
		return a;
	}
}
public class Three {

	public static void main(String[] args) {
		double k=radius1.Area1(5);
		System.out.println("the area of the circle: "+k);
	}

}
