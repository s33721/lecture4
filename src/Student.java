public class Student extends Person {
    private String studentIndex;
    private String studentEmail;
    public Student(String firstName, String lastName, String studentIndex, String studentEmail) {
        super(firstName, lastName);
        this.studentIndex = studentIndex;
        this.studentEmail = studentEmail;
    }
    @Override
    public void displayInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Index Number: " + studentIndex);
        System.out.println("Position: " + studentIndex);
    }
}
