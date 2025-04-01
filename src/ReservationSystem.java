import java.util.ArrayList;

public class ReservationSystem {
    private ArrayList<Event> eventList = new ArrayList<>();
    private ArrayList<Client> clientList = new ArrayList<>();

    public boolean addEvent(Event e) {
        eventList.add(e);
        return true;
    }

    public boolean addEvent(String eventName, double price) {
        Event e = new Event(eventName, price);
        eventList.add(e);
        return true;
    }

    public boolean addClient(Client c) {
        clientList.add(c);
        return true;
    }

    public boolean addClient(String firstName, String lastName) {
        Client c = new Client(firstName, lastName);
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

    public void makeReservation(Event event, Client client) {
        eventList.add(event);
        clientList.add(client);
        event.reserveSeat();
        client.addReservation(event);
    }

    public void changeEventPrice(String eventName, double price) {
        Event e = this.findEvent(eventName);
        if (e == null) {
            throw new IllegalArgumentException("No such event");
        }
        e.setPrice(price);
    }

    public Client findClient(String lastName) {
        for (Client c : clientList) {
            if (c.getLastname().equals(lastName)) {
                return c;
            }
        }
        return null;
    }


}
