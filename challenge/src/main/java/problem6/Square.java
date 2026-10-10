package problem6;

public class Square implements Forme{
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public String getSurface() {
        return String.format("%.2f ",side*side);
    }


    public String toString() {
        return String.format("Square (side = %.1f cm )",side);
    }
}
