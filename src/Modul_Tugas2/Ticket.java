package Modul_Tugas2;

public abstract class Ticket {
    public String passengerName;
    public String startLocation;
    public String destination;

    public Ticket(String passengerName, String startLocation, String destination) {
        this.passengerName = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
    }

    // Method to display basic info passenger and trip
    public abstract void displayInfo();
}
