/**
 * A hotel room
 * 
 * @author
 */
public class HotelRoom {
    protected int numBeds;
    private int numGuests;
    protected String bedType;
    private String bookingDate;

    /**
     * Gets the number of beds in a room
     * 
     * @return numBeds The number of beds in a room
     */
    public int getNumBeds() {
        return numBeds;
    }

    /**
     * Sets the number of beds in a room
     * 
     * @param numBeds The number of beds in a room
     */
    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    /**
     * Gets the number of guests staying in a room
     * 
     * @return numGuests The number of guests staying in a room
     */
    public int getNumGuests() {
        return numGuests;
    }

    /**
     * Sets the number of guests staying in a room
     * 
     * @param numGuests The number of guests staying in a room
     */
    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    /**
     * Gets the type of bed(s) in a room
     * 
     * @return bedType The type of bed(s)
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * Sets the type of bed(s) in a room
     * 
     * @param bedType The type of bed(s)
     */
    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    /**
     * Gets the booking date
     * 
     * @return bookingDate The date(s) the hotel room is booked for
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the booking date
     * 
     * @param bookingDate The date(s) the hotel room is booked for
     */
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }
}