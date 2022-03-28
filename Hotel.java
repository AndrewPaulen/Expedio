import java.util.*;
import java.util.Random;

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

    public Hotel(String name, Location location, boolean vacancy, String checkInTime, String checkOutTime,
            String checkInDate, String checkOutDate, String roomNumber, int rating, boolean pool, boolean gym,
            boolean rs) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
        this.rating = rating;
        this.pool = pool;
        this.gym = gym;
        this.rs = rs;
    }

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
        if (HotelUI.pool.equalsIgnoreCase("y")) {
            pool = true;
        }
        this.pool = pool;
    }

    public Boolean getPool() {
        return this.pool;
    }

    public void setGym(boolean gym) {
        if (HotelUI.gym.equalsIgnoreCase("y")) {
            gym = true;
        }
        this.gym = gym;
    }

    public Boolean getGym() {
        return this.gym;
    }

    public void setRS(boolean rs) {
        if (HotelUI.rs.equalsIgnoreCase("y")) {
            rs = true;
        }
        this.rs = rs;
    }

    public Boolean getRS() {
        return this.rs;
    }
    // -----------------------------------------

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

    public void printRoomOption(Location location, int num, String bedType) {
        System.out.println(
                "Room: \n A " + bedType + " style room for " + num + " located at " + location + ". Rating: " + rating +
                        "Amentities: Pool: " + " Smoking rooms: " + " Gym: " + " Laundry room: " + " Room service: ");
    }
}
