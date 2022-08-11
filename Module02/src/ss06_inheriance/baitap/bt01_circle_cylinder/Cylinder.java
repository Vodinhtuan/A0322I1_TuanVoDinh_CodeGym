package ss06_inheriance.baitap.bt01_circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2*Math.PI * getRadius() *(getRadius() +height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + " " + super.toString() +
                '}';
    }
}

