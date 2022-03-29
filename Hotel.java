import java.util.*;
import java.util.Random;

/**
 * A hotel
 * 
 * @authors Andrew Paulen, Shash Comandur, Sophia Riley, David Wamai
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
     * 
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
     * 
     * 
     * @param desiredCity Where the user wants to book a hotel
     * @param numGuests   The number of guests staying in the hotel room
     * @param bedType     What type of bed(s) the hotel room has
     */
    public Hotel(Location desiredCity, int numGuests, String bedType) {
        this.location = desiredCity;
        this.guests = numGuests;
        this.bedType = bedType;
    }

    public UUID getID() {
        return id;
    }

    public void setID(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean getVacancy() {
        return vacancy;
    }

    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }

    public void setRating(int rating) {
        // only outputs 0- come back to this
        Random r = new Random();
        int upper = 4;
        rating = r.nextInt(upper + 1);
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    // pool, gym, room service- come back to this
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public void setRS(boolean rs) {
        this.rs = rs;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public boolean getGym() {
        return this.gym;
    }

    public boolean getRS() {
        return this.rs;
    }

    public boolean getPool() {
        return this.pool;
    }

    public String getCheckInTime() {
        return this.checkInTime;
    }

    public String getCheckInDate() {
        return this.checkInDate;
    }

    public String getCheckOutTime() {
        return this.checkOutTime;
    }

    public String getCheckOutDate() {
        return this.checkOutDate;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public UUID getHotelID() {
        return this.id;
    }

    public String getBedType() {
        return this.bedType;
    }

    public void printRoomOption(Location location, int num, String bedType) {
        System.out.println("\nRoom: \n A " + bedType + " style room for " + num + " located at " + location
                + ". \nRating: " + rating +
                "\nAmenities: \nPool: " + pool + " \nGym: " + gym + " \nRoom service: " + rs);
    }
}
