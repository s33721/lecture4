public class Event {
    //fields
    private String name;
    private String date;
    private String location;
    private int maxNumberOfSeats = 100;
    private int availableSeats = 0;
    private double price;

    public Event(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public Event(String name, String date, double price) {
        this.name = name;
        this.date = date;
        this.price = price;
    }

    public Event(String name, String date, double price, String location) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.location = location;
    }

    public boolean reserveSeat() {
        if (availableSeats <= 0) {
            System.out.println("There are no seats available");
            return false;
        }


        this.availableSeats--;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        if(availableSeats<0){
            throw new IllegalArgumentException("The number of seats cannot be negative");
        }
        if (availableSeats > maxNumberOfSeats) {
            throw new IllegalArgumentException("The number of seats cannot be greater than max number of seats");
        }

        this.availableSeats = availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
