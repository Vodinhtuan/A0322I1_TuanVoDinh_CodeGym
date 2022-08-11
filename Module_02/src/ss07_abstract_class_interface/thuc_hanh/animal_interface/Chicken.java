package ss07_abstract_class_interface.thuc_hanh.animal_interface;

public class Chicken extends Animal implements Edible{
    @Override
    public String howtoEat() {
        return "cap cap";
    }

    @Override
    public String makeSound() {
        return " alo";
    }
}
