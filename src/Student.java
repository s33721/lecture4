public class Student extends Person {
    private int indexNumber;
    private String studentEmail;

    public Student(String firstName, String lastName, int indexNumber, String studentEmail) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
        this.studentEmail = studentEmail;
    }
    @Override
    public void displayInfo(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Index Number: " + indexNumber);
        System.out.println("Student Email: " + studentEmail);
    }

}
