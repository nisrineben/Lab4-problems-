package student;

import Instructor.Instructor;
import Instructor.Subject;
public class Test {
    public static void main(String[] args) {
        //4.
        //a.Couple of major :
        Major medical=new Major("22","medical");
        Major architect=new Major("21","architect");
        Major computerScience=new Major("23","Computer science");
        //b.Some students
        Student  s1=new Student("SAFI","amal","06","amalSAFI@gmail.com","22885676",computerScience);
        Student  s2=new Student("ALAMI","Samir","06","alamisamir@gmail.com","23585976",computerScience);
        Student  s3=new Student("CHAFI","ahmed","06","ahmedchafi@gmail.com","22885679",architect);
        Student  s4=new Student("Rahimi","yosra","06","yosrarahimi@gmail.com","22885671",medical);
        //c.Display computer science students
        System.out.println("Test display methods:------------------------------------------------------------");
        System.out.println("The list of students in the computer major is:");
        computerScience.displayStudents();
        System.out.println();
        //with a single formated string
        System.out.println("The display with a single formated string");
        System.out.println(computerScience.getStudentListAsString());
        System.out.println();
        // display the capacity for each major:
        System.out.println("Test get capacity method:------------------------------------------------------------");
        computerScience.getOccupancyRate();
        architect.getOccupancyRate();
        medical.getOccupancyRate();
        System.out.println();
        //test the remove method
        System.out.println("Test remove method:------------------------------------------------------------");
        System.out.println("Remove the student withe cne = 22885676 ,the remove has been done :"+computerScience.removeStudent("22885676"));
        System.out.println("The list of students in the computer major is:");
        computerScience.displayStudents();
        System.out.println();
        //test pour instructor
        System.out.println("Test Instructor class method:------------------------------------------------------------");
        Instructor instructor = new Instructor("mohamed","amine","06888888888","amine@gmail.com"," AB 123  ");
        System.out.println(instructor.cleanEmployeeNumber()); // AB123
        System.out.println(instructor.summaryLine());
        System.out.println(instructor.toCard());
        System.out.println();
        //test pour Subject
        System.out.println("Test Subject class method:------------------------------------------------------------");
        Subject subject1 = new Subject(1," cs-101 ", "introduction to java",instructor);
        System.out.println(subject1.normalizedCode());  // CS-101
        System.out.println(subject1.properTitle());     // Introduction To Java
        System.out.println(subject1.isIntroCourse());   //true
        System.out.println(subject1.syllabusLine());

        Subject subject2 = new Subject(2,"INTRO-200", "Algorithms",instructor);
        System.out.println(subject2.isIntroCourse());   //true

        Subject subject3 = new Subject(3,"CS-300", "Advanced Java",instructor);
        System.out.println(subject3.isIntroCourse());   // false
    }
}

