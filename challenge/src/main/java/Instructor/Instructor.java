package Instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email, String employeeNumber){
        super(firstName,secondName, telephone, email);
        this.employeeNumber=employeeNumber;
    }
    public String cleanEmployeeNumber(){
        return employeeNumber.trim();
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",employeeNumber,this.secondName,this.firstName);
    }
    public String toCard(){
        StringBuilder result=new StringBuilder();
        result.append(String.format("Instructor  %n " +
                "----------%n" +
                "Employee #: %s%n" +
                "Name      : %s, %s%n" +
                "Email     : %s%n" +
                "Phone     : %s%n",employeeNumber,this.firstName,this.secondName,this.email,this.phone));
        return result.toString();
    }
    public String displayName(){
        StringBuilder name=new StringBuilder();

        if(secondName!=null)name.append(secondName);
        name.append(" ");
        if(firstName!=null)name.append(firstName);
        return name.toString();
    }
}
