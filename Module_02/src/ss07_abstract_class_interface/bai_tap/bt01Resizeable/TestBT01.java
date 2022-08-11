package ss07_abstract_class_interface.bai_tap.bt01Resizeable;

import ss06_inheriance.thuchanh.Shape;

public class TestBT01 {
    public static void main(String[] args) {
        Circle circle = new Circle(17,"Blue",true);
        Rectangle rectangle = new Rectangle(9,17,"Blue",true);
        Square square = new Square(17,"Blue",true);
        System.out.println( "Before change: \n" + circle + "\n" + rectangle + "\n" + square);
        System.out.println("Circle: "+circle.getArea());
        System.out.println("Square"+square.getArea());
        System.out.println("Rectangle: "+rectangle.getArea());
        circle.resize(50);
        square.resize(50);
        rectangle.resize(50);
        System.out.println("Circle: "+circle.getArea());
        System.out.println("Square"+square.getArea());
        System.out.println("Rectangle: "+rectangle.getArea());
        SquareColorable squareColorable = new SquareColorable(17," blue ",false);
        Shape[] shapes = new Shape[4];
        shapes[0] = new SquareColorable(17," blue ",false);
        shapes[1] = new Square(17,"blue",false);
        shapes[2] = new Circle(17,"Blue",true);
        shapes[3] = new Rectangle(17,17,"blue",true);
        for (Shape shape: shapes) {
            if (shape instanceof SquareColorable ){
                SquareColorable squareColorable1 =(SquareColorable) shape;
                squareColorable1.howToColor();
                break;
            }
        }
    }
}
