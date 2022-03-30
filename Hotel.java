import java.util.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * A hotel
 * 
 * @author Andrew Paulen
 * @author Shash Comandur
 * @author Sophia Riley
 * @author David Wamai
 */
public class Hotel {
    private UUID id;
    private String name;
    private Location location;
    private boolean vacancy;
    private String checkInTime;
    private String checkOutTime;
    private String checkInDate;
    private String checkOutDate;
    private String roomNumber;
    private int rating;
    private boolean pool;
    private boolean gym;
    private boolean rs;
    private int guests;
    private String bedType;

    /**
     * An instance of a hotel
     * 
     * @param name         The name of the hotel
     * @param location     The location of the hotel
     * @param vacancy      If the hotel has vacancy or not
     * @param checkInTime  The check in time
     * @param checkOutTime The check out time
     * @param checkInDate  The check in date
     * @param checkOutDate The check out date
     * @param roomNumber   The room number
     */
    public Hotel(String name, Location location, boolean vacancy, String checkInTime, String checkOutTime,
            String checkInDate, String checkOutDate, String roomNumber) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
    }

    /**
     * An instance of a hotel
     * 
     * @param id       The hotels's ID
     * @param name     The name of the hotel
     * @param location The location of the hotel
     * @param vacancy  If the hotel has vacancy or not
     */
    public Hotel(UUID id, String name, Location location, boolean vacancy) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
    }

    /**
     * An instance of a hotel
     * 
     * @param desiredCity The city where the user wants to stay
     * @param guests      The number of guests in a room
     * @param bedType     The type of bed(s) in the room
     * @param startDate   The check in date/when the booking starts
     * @param endDate     The check out date/when the booking ends
     * @param pool        If the hotel has a pool
     * @param gym         If the hotel has a gym
     * @param rs          If the hotel has room service
     */
    public Hotel(Location desiredCity, int guests, String bedType, String startDate,
            String endDate, boolean pool, boolean gym, boolean rs) {
        this.location = desiredCity;
        this.guests = guests;
        this.bedType = bedType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.pool = pool;
        this.gym = gym;
        this.rs = rs;
        this.rating = ThreadLocalRandom.current().nextInt(2, 5 + 1);
    }

    /**
     * An instance of a hotel
     * 
     * @param desiredCity The city where the user wants to stay
     * @param guests      The number of guests in a room
     * @param bedType     The type of bed(s) in the room
     */
    public Hotel(Location desiredCity, int numGuests, String bedType) {
        this.location = desiredCity;
        this.guests = numGuests;
        this.bedType = bedType;
    }

    public void printHotel(Location location, int num, String bedType, String startDate, String endDate) {
        // System.out.println ("gets here");
        ArrayList<String> roomTypes = new ArrayList<String>();
        roomTypes.add("king-couch");
        roomTypes.add("king");
        roomTypes.add("queen-queen-couch");
        roomTypes.add("queen-queen");
        roomTypes.add("double-double");
        roomTypes.add("double");
        roomTypes.add("twin");

        // System.out.println("\nRoom: \nA " + roomTypes.get(Integer.parseInt(bedType))
        // + " style room for " + num + " located at " + location
        // + ". \nRating: " + rating + " out of 5 stars " +
        // "\nAmenities: \n-Pool: " + pool + " \n-Gym: " + gym + " \n-Room Service: " +
        // rs);

        String roomHeader = "Room: ";
        String roomType = "A " + roomTypes.get(Integer.parseInt(bedType)) + " style room for " + num + " located at "
                + location + ".";
        String checkInDate = "Check In Date: " + startDate;
        String checkOutDate = "Check Out Date: " + endDate;

        System.out.println(roomHeader);
        System.out.println(roomType);
        System.out.println(checkInDate);
        System.out.println(checkOutDate);
    }

    /**
     * Gets the hotel's ID
     * 
     * @return id The hotel's ID
     */
    public UUID getID() {
        return id;
    }

    /**
     * Sets the hotel's ID
     * 
     * @param id The hotel's ID
     */
    public void setID(UUID id) {
        this.id = id;
    }

    /**
     * Gets the name of the hotel
     * 
     * @return name The name of the hotel
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel
     * 
     * @param name The name of the hotel
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the location of the hotel
     * 
     * @return location The location of the hotel
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the location of the hotel
     * 
     * @param location The location of the hotel
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Gets the vacancy of the hotel
     * 
     * @return vacancy Whether or not the hotel has vacancy
     */
    public boolean getVacancy() {
        return vacancy;
    }

    /**
     * Sets the vacancy of the hotel
     * 
     * @param vacancy Whether or nor the hotel has vacancy
     */
    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }

    /**
     * Sets the rating of the hotel
     * 
     * @param rating The rating of the hotel
     */
    public void setRating(int rating) {
        // only outputs 0- come back to this
        Random r = new Random();
        int upper = 4;
        rating = r.nextInt(upper + 1);
        this.rating = rating;
    }

    /**
     * Gets the rating of the hotel
     * 
     * @return this.rating The rating of the hotel
     */
    public int getRating() {
        return this.rating;
    }

    /**
     * Sets the pool of the hotel
     * 
     * @param pool Whether or not the hotel has a pool
     */
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    /**
     * Gets the pool of the hotel
     * 
     * @return this.pool The hotel's pool
     */
    public boolean getPool() {
        return this.pool;
    }

    /**
     * Sets the gym of the hotel
     * 
     * @param gym Whether or not the hotel has a pool
     */
    public void setGym(boolean gym) {
        this.gym = gym;
    }

    /**
     * Gets the gym of the hotel
     * 
     * @return this.gym The gym of the hotel
     */
    public boolean getGym() {
        return this.gym;
    }

    /**
     * Sets the room service of the hotel
     * 
     * @param rs Whether or not the hotel has a gym
     */
    public void setRS(boolean rs) {
        this.rs = rs;
    }

    /**
     * Gets the room service of the hotel
     * 
     * @return this.rs The hotel's room service
     */
    public boolean getRS() {
        return this.rs;
    }

    /**
     * Sets the bed type in the hotel room
     * 
     * @param bedType The type of bed(s) in the hotel room
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * Gets the bed type in the hotel room
     * 
     * @return this.bedType The hotel room's type of bed(s)
     */
    public String getBedType() {
        return this.bedType;
    }

    /**
     * Gets the check in time
     * 
     * @return this.checkInTime The user's check in time
     */
    public String getCheckInTime() {
        return this.checkInTime;
    }

    /**
     * Gets the check in date
     * 
     * @return this.checkInDate The user's check in date
     */
    public String getCheckInDate() {
        return this.checkInDate;
    }

    /**
     * Gets the check out time
     * 
     * @return this.checkOutTime The user's check out time
     */
    public String getCheckOutTime() {
        return this.checkOutTime;
    }

    /**
     * Gets the check out date
     * 
     * @return this.checkOutDate The user's check out date
     */
    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    /**
     * Gets the room number of the hotel room
     * 
     * @return this.roomNumber The hotel room's room number
     */
    public String getRoomNumber() {
        return this.roomNumber;
    }

    /**
     * Gets the ID of the hotel
     * 
     * @return this.id The hotel's ID
     */
    public UUID getHotelID() {
        return this.id;
    }

    /**
     * Prints the available room options
     * 
     * @param location The location of the hotel
     * @param num      The number of people able to stay in a room
     * @param bedType  The type of bed(s) in the room
     */
    public void printRoomOption(Location location, int num, String bedType) {
        ArrayList<String> roomTypes = new ArrayList<String>();
        roomTypes.add("king-couch");
        roomTypes.add("king");
        roomTypes.add("queen-queen-couch");
        roomTypes.add("queen-queen");
        roomTypes.add("double-double");
        roomTypes.add("double");
        roomTypes.add("twin");

        System.out.println("\nRoom: \nA " + roomTypes.get(Integer.parseInt(bedType)) + " style room for " + num
                + " located at " + location
                + ". \nRating: " + rating + " out of 5 stars " +
                "\nAmenities: \n-Pool: " + pool + " \n-Gym: " + gym + " \n-Room Service: " + rs);
    }
}