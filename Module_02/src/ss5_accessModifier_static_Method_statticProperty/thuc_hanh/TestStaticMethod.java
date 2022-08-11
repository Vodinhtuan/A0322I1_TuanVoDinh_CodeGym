package ss5_accessModifier_static_Method_statticProperty.thuc_hanh;

public class TestStaticMethod {
    public static void main(String[] args) {
        student.change(); // calling change method
        student student1 = new student(12,"tuan");
        student student2 = new student(18,"tuan");
        student student3 = new student(19,"tuan");
        student1.display();
        student2.display();
        student3.display();
    }
}
