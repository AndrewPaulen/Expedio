import java.util.ArrayList;

/**
 * A class for guest users
 * 
 * @author Sophia Riley
 */
public class Guest extends User {
    private ArrayList<Preferences> preferences;
    public String userID;
    public String firstName;
    public String lastName;
    public String passportID;
    public String email;
    public String phoneNumber;
    public String address;
    public ArrayList<Flight> flightBookings;
    public ArrayList<Hotel> hotelBookings;

    /**
     * Initializes the characteristics of a guest user
     * 
     * @param firstName   The user's first name
     * @param lastName    The user's last name
     * @param passportID  The user's passport ID
     * @param email       The user's email
     * @param phoneNumber The user's phone number
     * @param address     The user's home address
     */
    public Guest(String firstName, String lastName, String passportID, String email, String phoneNumber,
            String address) {
        super(firstName, lastName);
        this.passportID = passportID;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * An instance of a guest
     * 
     * @param firstName The user's first name
     * @param lastName  The user's last name
     */
    public Guest(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * The user's preferences
     * 
     * @return preferences The user's preferences
     */
    private ArrayList<Preferences> askPreferences() {
        preferences = new ArrayList<>();
        return preferences;
    }

    /**
     * Gets the user's preferences
     * 
     * @return The user's preferences
     */
    public ArrayList<Preferences> getPreferences() {
        return preferences;
    }

    /**
     * Set's the user's preferences
     * 
     * @param preferences The user's preferences
     */
    public void setPreferences(ArrayList<Preferences> preferences) {
        this.preferences = preferences;
    }

    /**
     * Gets the user ID
     * 
     * @return userID The user's ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the user ID
     * 
     * @return userID The user's ID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Gets the user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the user's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user's passport ID
     * 
     * @return passportID The user's passport ID
     */
    public String getPassportID() {
        return passportID;
    }

    /**
     * Sets the user's passport ID
     * 
     * @param passportID The user's passport ID
     */
    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    /**
     * Gets the user's email
     * 
     * @return email The user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the user's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the user's phone number
     * 
     * @return phoneNumber The user's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the user's phone number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the user's address
     * 
     * @return address The user's home address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * Sets the user's address
     * 
     * @param address The user's home address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get's the user's flight bookings
     * 
     * @return flightBookings The flights the user has booked
     */
    public ArrayList<Flight> getFlightBookings() {
        return flightBookings;
    }

    /**
     * Sets the user's flight bookings
     * 
     * @param flightBookings The flights the user has booked
     */
    public void setFlightBookings(ArrayList<Flight> flightBookings) {
        this.flightBookings = flightBookings;
    }

    /**
     * Gets the user's hotel bookings
     * 
     * @return hotelBookings The hotel rooms the user has booked
     */
    public ArrayList<Hotel> getHotelBookings() {
        return hotelBookings;
    }

    /**
     * Sets the user's hotel bookings
     * 
     * @param hotelBookings The hotel rooms the user has booked
     */
    public void setHotelBookings(ArrayList<Hotel> hotelBookings) {
        this.hotelBookings = hotelBookings;
    }
}