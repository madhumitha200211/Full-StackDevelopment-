package com.gentech.overloaading.assignment;


class Userprofile1
{
    Userprofile1(String Name,String EmailId)
    {
        System.out.println("Name is:"+Name);
        System.out.println();
        System.out.println("Emailid is:"+EmailId);
        System.out.println();
    }
    Userprofile1(String Password)
    {
        System.out.println("password is:"+Password);
        System.out.println();
    }
    Userprofile1(int PhnNo,String Bio)
    {
        System.out.println("Phone Number is:"+PhnNo);
        System.out.println();
        System.out.println("Bio:"+Bio);
    }
}
public class Userprofile {
    public static void main(String[] args)
    {
        Userprofile1 N1=new Userprofile1("MADHUMITHA","madhu@gmail.com");
        Userprofile1 PW=new Userprofile1("Madhu@2011");
        Userprofile1 Phn=new Userprofile1(46938234,"Student");
    }
}