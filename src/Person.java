public class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void displayInfo(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
    public void calculateSalary(){

    }
}
