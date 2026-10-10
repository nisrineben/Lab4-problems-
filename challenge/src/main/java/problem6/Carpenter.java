package problem6;

public class Carpenter extends Person{
    public Carpenter(String name){
        super(name);
    }
    public void display(){
        super.display();
        System.out.print("the Carpenter");
        System.out.println();
    }
}
