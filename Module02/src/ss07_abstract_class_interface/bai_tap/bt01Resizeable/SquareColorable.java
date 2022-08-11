package ss07_abstract_class_interface.bai_tap.bt01Resizeable;

public class SquareColorable extends Square implements Colorable{
    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    public SquareColorable() {
    }

    public SquareColorable(double side, String color, boolean filled) {
        super(side, color, filled);
    }
}
