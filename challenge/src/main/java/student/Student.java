package student;

import java.util.Locale;

public class Student extends Person {
    private String cne;
    private Major major;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    Student(){}
    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.email=email;
        this.cne=cne;
        major.addStudent(this);
    }


    //a constructor without specifying the major:
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,Major.defaultMAjor);

    }

    // Getters

    public String getCne() {
        return cne;
    }

    public Major getMajor() {
        return major;
    }
    // Setters


    public void setCne(String cne) {
        this.cne = cne;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
    public String getFullNameFormatted(){
        return String.format("%s, %s",prenom.toUpperCase(),nom.toLowerCase());
    }

    @Override
    public String toString() {

        return cne+" "+getFullNameFormatted();
    }
}