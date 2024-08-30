package com.gentech.programs;
class Student{
    String name;
    int rollNo;
}

class Library{
    String name;
    int roomNo;
}

class Sports{
    String sportName;
    int budget;
}

class ComputerLab{
    String name;
    int budget;
}

public class Students {

	public static void main(String[] args) {
		Student student = new Student();
        student.name = "Madhu";
        student.rollNo = 23;
        System.out.println("Student Name: " + student.name);
        System.out.println("Student RollNo: " + student.rollNo);
        System.out.println();

        Library library = new Library();
        library.name = "GCEM";
        library.roomNo = 306;
        System.out.println("Library Name: "+ library.name);
        System.out.println("Library Room No: "+ library.roomNo);
        System.out.println();

        Sports sport = new Sports();
        sport.sportName = "CRICKET";
        sport.budget = 1000;
        System.out.println("Sport Name: " + sport.sportName);
        System.out.println("Sport Budget: " + sport.budget);
        System.out.println();

        ComputerLab computerLab = new ComputerLab();
        computerLab.name = "CSE";
        computerLab.budget = 23000000;
        System.out.println("Computer Lab Name: "+computerLab.name);
        System.out.println("Computer Lab Budget: "+computerLab.budget);
	
	}

}
