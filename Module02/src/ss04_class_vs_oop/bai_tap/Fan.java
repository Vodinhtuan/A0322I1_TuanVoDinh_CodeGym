package ss04_class_vs_oop.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public Fan() {

    }

    @Override
    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius + " fan is on.";
        } else {
            return color + " " + radius + " fan is off.";
        }
    }

    public Fan(boolean on) {
        this.on = on;
        if (on == true) {
            speed = getFAST();
            radius = 10;
            color = "yellow";
            System.out.println(speed + " " + radius + " " + color);
        } else {
            speed = getMEDIUM();
            radius = 5;
            color = "Blue";
            System.out.println(speed + " " + radius + " " + color);
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(true);
        Fan fan2 = new Fan(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
