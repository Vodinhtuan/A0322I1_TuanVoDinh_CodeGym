package casestudy_furamaresort.models.person_inheritance;

public class Employee extends Person {
    private String academicLevel, position;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, String birthDay, String sex, int idCard, int phoneNumber, String email, String academicLevel, String position, double salary) {
        super(id, name, birthDay, sex, idCard, phoneNumber, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + super.toString() +
                " academicLevel='" + academicLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
