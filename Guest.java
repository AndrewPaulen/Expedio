import java.util.ArrayList;

/**
 * A class for guest users
 * 
 * @author Sophia Riley
 */
public class Guest implements User {
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
     * @param address     The user's home addresss
     */
    public Guest(String firstName, String lastName, String passportID, String email, String phoneNumber,
            String address) {
        firstName = this.firstName;
        lastName = this.lastName;
        passportID = this.passportID;
        email = this.email;
        phoneNumber = this.phoneNumber;
        address = this.address;
    }

    /**
     * Gets the guest's name
     * 
     * @param firstName The user's first name
     * @param lastName  The user's last name
     */
    public Guest(String firstName, String lastName) {

    }

    /**
     * Gets the user's preferences
     * 
     * @return preferences The user's preferences
     */
    private ArrayList<Preferences> askPreferences() {
        preferences = new ArrayList<>();
        return preferences;
    }
}