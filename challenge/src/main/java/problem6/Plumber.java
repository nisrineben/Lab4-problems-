package problem6;

public class Plumber extends Person{
    public Plumber(String name){
        super(name);
    }
    public void display(){
        super.display();
        System.out.print("the Plumber");
        System.out.println();
    }
}
