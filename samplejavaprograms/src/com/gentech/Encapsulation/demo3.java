package com.gentech.Encapsulation;

class Outer2
{
    int age;
    InnerStatic2 o=new InnerStatic2();
    void showName()
    {
        o.name="madhu";
        System.out.println("Name:"+o.name);
    }

    static class InnerStatic2
    {
        String name;
    }
    void showAge()
    {
        age=22;
        System.out.println("age: "+age);
    }
}
public class demo3
{
    public static void main(String[] args)
    {
        Outer2 obj=new Outer2();
        obj.showAge();
        obj.showName();
    }

}
