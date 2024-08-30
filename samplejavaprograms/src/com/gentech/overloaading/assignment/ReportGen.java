package com.gentech.overloaading.assignment;
class ReportGeneration
{
    ReportGeneration(String Format,String PageType)
    {
        System.out.println("formate is:"+Format);
        System.out.println();
        System.out.println("PageType is:"+PageType);
        System.out.println();
    }
    ReportGeneration(int cost,String Title)
    {
        System.out.println("Cost of report is:"+cost);
        System.out.println();
        System.out.println("Title of report is:"+Title);
        System.out.println();
    }
    ReportGeneration(int ReportId)
    {
        System.out.println("Id is:"+ReportId);
    }
}

public class ReportGen {
    public static void main(String[] args)
    {
        ReportGeneration Ft=new ReportGeneration("PDF","A4");
        ReportGeneration CT=new ReportGeneration(500,"PROJECT");
        ReportGeneration RI=new ReportGeneration(1);
    }
}

