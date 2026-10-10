package Instructor;

import java.util.Locale;

public class Subject  {
    int id;
    String code;
    String title;
    Instructor instructor;
    public Subject(int id, String code, String title, Instructor instructor){
        this.code=code;
        this.id=id;
        this.title=title;
        this.instructor=instructor;
    }
    public String normalizedCode(){
        return code.trim().toUpperCase();
    }
    public String properTitle(){
        String[] words=title.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:words){
            result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1));
            result.append(" ");
        }
        return result.toString();

    }
    public boolean isIntroCourse(){
        return title.toLowerCase().contains("intro") || code.startsWith("INTRO-");
    }
    public String syllabusLine(){
        StringBuilder result=new StringBuilder();
        result.append(String.format("%s - %s (Instructor: %s %s )",code,title,instructor.getSecondName(),instructor.getFirstName()));
        return result.toString();
    }

}
