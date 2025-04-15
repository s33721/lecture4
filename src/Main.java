import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        ArrayList<Person> people = new ArrayList<>();
        Student s1 = (Student) people.get(0);
        if (people.get(0) instanceof Student) {
            Student student1 = (Student) people.get(0)
        } else if (people.get(0) instanceof Teacher) {
            Teacher teacher1 = (Teacher) people.get(0)
        }


    }
}