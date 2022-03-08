import java.util.ArrayList;

/**
 * 
 */
public class Guest implements User
{
    private ArrayList <Preferences> preferences;
    public String userID;
    public String firstName;
    public String lastName;
    public String passportID;
    public String email;
    public String phoneNumber;
    public String address;
    public ArrayList <Flight> flightBookings;
    public ArrayList <Hotel> hotelBookings;

    /**
     * 
     * @param firstName
     * @param lastName
     * @param passportID
     * @param email
     * @param phoneNumber
     * @param address
     */
    public Guest (String firstName, String lastName, String passportID, String email, String phoneNumber, String address)
    {

    }

    /**
     * 
     * @param firstName
     * @param lastName
     */
    public Guest (String firstName, String lastName)
    {

    }

    /**
     * 
     * @return
     */
    public ArrayList <Preferences> askPreferences()
    {

    }
}