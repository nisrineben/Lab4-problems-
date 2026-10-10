package student;

import java.util.Arrays;

public class Major {
    private static int nextId = 1;
    private int id;
    // for the default major it should respect question 3 so we need to make sure there will be one object of that type
    // so we can linked all students to the same object Major.
    public static final Major defaultMAjor=new Major("23","computer science");
    private String code;
    private String name;
    private Student[] students=new Student[50];
    private int studentCount;
    public Major(){}
    public Major(String code, String name) {
        this.code=code;
        this.name=name;
        this.id=nextId++;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount>50) System.out.println("A major cannot exceed 50 students.");
        else{
            //we can set a counter to track the number of elements
            students[studentCount++]=s;
        }
    }

    // Getters


    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }
    //7.the number of student enrolled
    public int getStudentCount() {
        return studentCount;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    // Display all students in the major
    public void displayStudents() {
        for(int i=0;i<students.length;i++){
            if(students[i]!=null) System.out.println((i+1)+". "+students[i].toString());// the student array for a major have size de 50 element
        }
    }
    //toString :
    //6.search student by the cne:
    public Student findStudentByCNE(String  cne){
        for(Student s:students){
            if(s!=null && s.getCne().equals(cne))return s;
        }
        return null;
    }
    //8.
    public boolean removeStudent(String cne){
        Student s=findStudentByCNE(cne);
        if(s==null)return false;
        for(int i=0;i<studentCount;i++){
           if(students[i]==s){
               while(i<studentCount){
                   students[i]=students[i+1];
                   i++;
               }
           }
        }
        return true;
    }
    //9.
    public void  getOccupancyRate(){
        System.out.printf("%s capacity:%d students%n",name,studentCount);

    }
    //10.
    public String getStudentListAsString(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<studentCount;i++){
            s.append((i + 1)).append(". ").append(students[i].getCne()).append(" ").append(students[i].getFullNameFormatted()).append("\n");
        }
        return s.toString();
    }
    @Override
    public String toString() {
        return super.toString();
    }
}