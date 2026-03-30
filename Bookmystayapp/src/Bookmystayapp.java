/**
 * ======================================================================
 * ABSTRACT CLASS - Room
 * ======================================================================
 */
abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;


    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + squareFeet + " sqft");
        System.out.println("Price per night: " + pricePerNight);
    }
}


class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

/**
 * CLASS - DoubleRoom
 */
class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

/**
 * CLASS - SuiteRoom
 */
class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

/**
 * MAIN CLASS - UseCase2RoomInitialization
 */
public class Bookmystayapp {

    /** Application entry point. */
    public static void main(String[] args) {
        System.out.println("Hotel Room Initialization\n");

        // Single Room Section
        SingleRoom single = new SingleRoom();
        System.out.println("Single Room:");
        single.displayRoomDetails();
        System.out.println("Available: 5\n");

        // Double Room Section
        DoubleRoom doubleRm = new DoubleRoom();
        System.out.println("Double Room:");
        doubleRm.displayRoomDetails();
        System.out.println("Available: 3\n");

        // Suite Room Section
        SuiteRoom suite = new SuiteRoom();
        System.out.println("Suite Room:");
        suite.displayRoomDetails();
        System.out.println("Available: 2");
    }
}