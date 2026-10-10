package problem6;

public class Circle implements Forme {
    private double radius;

    public Circle(double radius) {
        this.radius=radius;
    }
    public String getSurface() {
        return String.format("%.2f ",Math.PI*radius*radius);
    }
    public String toString() {
        return String.format("Circle (radius = %.1f cm )",radius);
    }

}
