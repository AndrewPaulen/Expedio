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

    // At this point they are a registered user, this method is not needed
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
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * 
     * 
     * @param firstName The user's first name
     * @param lastName  The user's last name
     */
    public Guest(String firstName, String lastName) {

    }

    // This should ask for preferences, not get the preferences
    /**
     * Gets the user's preferences
     * 
     * @return preferences The user's preferences
     */
    private ArrayList<Preferences> askPreferences() {
        preferences = new ArrayList<>();
        return preferences;
    }

    public ArrayList<Preferences> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<Preferences> preferences) {
        this.preferences = preferences;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Flight> getFlightBookings() {
        return flightBookings;
    }

    public void setFlightBookings(ArrayList<Flight> flightBookings) {
        this.flightBookings = flightBookings;
    }

    public ArrayList<Hotel> getHotelBookings() {
        return hotelBookings;
    }

    public void setHotelBookings(ArrayList<Hotel> hotelBookings) {
        this.hotelBookings = hotelBookings;
    }
}