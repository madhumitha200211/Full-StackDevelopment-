package com.gentech.test;
class Rectangle
{
	static double Area2(int h,int b)
	{
		double r;
		r=(0.5)*b*h;
		return r;
	}
}
public class four {

	public static void main(String[] args) {
	
		double k=Rectangle.Area2(5, 10);
		System.out.println("the area of the rectangle: "+k);
	}

}
