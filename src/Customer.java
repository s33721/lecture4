import java.util.ArrayList;

public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private ArrayList<Event> reservationList = new ArrayList<>();

    //only create getters and setter for String and primitive data types

    public Customer(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public boolean addReservation(Event event) {
        reservationList.add(event);
        return true;
    }

    public void displayReservations() {
        for (Event event : reservationList) {
            System.out.println(event);
        }
    }

    public boolean cancelReservation(Event event) {
        this.reservationList.remove(event);
        return true;
    }

    public boolean cancelReservation(String eventName) {
        for (int i = 0; i < reservationList.size(); i++) {
            Event e = reservationList.get(i);
            if (e.getName().equals(eventName)) {
                reservationList.remove(e);
                return true;
            }
        }
        return false;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
