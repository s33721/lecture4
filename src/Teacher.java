public class Teacher extends Person {

    private int salary;
    private String position;

    public Teacher(String firstName, String lastName, int salary, String position) {
        super(firstName, lastName);
        this.salary = salary;
        this.position = position;
    }
    @Override
    public void displayInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Salary : " + salary);
        System.out.println("Position : " + position);
    }

}
