public class Main {
    public static void main(String[] args) {
        // Example of interaction between objects and copying by reference
        ReservationSystem system = new ReservationSystem();
        // Add events and customers
        Event concert = new Event("Symphony Concert", 120.0);
        Event theater = new Event("Hamlet", 85.0);
        system.addEvent(concert);
        system.addEvent(theater);
        Customer customer1 = new Customer("John", "Smith", "john@example.com");
        Customer customer2 = new Customer("Anna", "Johnson", "anna@example.com");
        system.addCustomer(customer1);
        system.addCustomer(customer2);
        // Make reservations - passing Customer and Event objects
        system.makeReservation(customer1, concert);
        system.makeReservation(customer1, theater);
        system.makeReservation(customer2, concert);
        // Display customer's reservations
        System.out.println("Reservations for customer " + customer1.getFirstName() + " " + customer1.getLastName()
                + ":");
        customer1.displayReservations();
        // Get a reference to an event from the system
        Event concertRef = system.findEvent("Symphony Concert");
        // Modifying an event by reference - will affect all customers who have this event
        System.out.println("\nChanging concert price from " + concertRef.getPrice() + " to 150.0");
        concertRef.setPrice(150.0);
        // Check if changes are visible in customer reservations
        System.out.println("\nReservations for customer " + customer1.getFirstName() + " " +
                customer1.getLastName() + " after price change:");
        customer1.displayReservations();
        System.out.println("\nReservations for customer " + customer2.getFirstName() + " " +
                customer2.getLastName() + " after price change:");
        customer2.displayReservations();
        // Customer cancels reservation - operation on references
        System.out.println("\nCustomer " + customer1.getFirstName() + " cancels theater reservation:");
        customer1.cancelReservation(theater);
        customer1.displayReservations();
        // Check the number of available seats for the concert (should be 2 less than max)
        System.out.println("\nAvailable seats for the concert: " + concert.getAvailableSeats() +
                " out of " + concert.getMaxNumberOfSeats())

    }
}