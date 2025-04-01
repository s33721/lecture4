import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> eventList = new ArrayList<>();
    private ArrayList<Customer> clientList = new ArrayList<>();

    public boolean addEvent(Event e) {
        eventList.add(e);
        return true;
    }

    public boolean addEvent(String eventName, double price) {
        Event e = new Event(eventName, price);
        eventList.add(e);
        return true;
    }

    public boolean addCustomer(Customer c) {
        clientList.add(c);
        return true;
    }

    public boolean addCustomer(String firstName, String lastName) {
        Customer c = new Customer(firstName, lastName);
        clientList.add(c);
        return true;
    }

    public Event findEvent(String eventName) {
        for (Event e : eventList) {
            if (e.getName().equals(eventName)) {
                return e;
            }
        }
        return null;
    }

    public void makeReservation(Customer customer, Event event) {
        eventList.add(event);
        clientList.add(customer);
        event.reserveSeat();
        customer.addReservation(event);
    }

    public void changeEventPrice(String eventName, double price) {
        Event e = this.findEvent(eventName);
        if (e == null) {
            throw new IllegalArgumentException("No such event");
        }
        e.setPrice(price);
    }

    public Customer findClient(String lastName) {
        for (Customer c : clientList) {
            if (c.getLastName().equals(lastName)) {
                return c;
            }
        }
        return null;
    }


}
