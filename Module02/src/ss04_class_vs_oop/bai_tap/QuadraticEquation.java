package ss04_class_vs_oop.bai_tap;

public class QuadraticEquation {
    // Phương trình bặc 2:
    private double a, b, c;

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(-8,6,2);
        System.out.println("Discriminant: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>=0){
            System.out.println("x1= " + quadraticEquation.getRoot1());
            System.out.println("x2= " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("x1 = x2 = " + -quadraticEquation.getB()/2* quadraticEquation.getA());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
