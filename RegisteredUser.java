import java.util.ArrayList;

/**
 * 
 */
public class RegisteredUser implements User
{
    private ArrayList <Preferences> preferences;
    private ArrayList <RegisteredUser> friends;
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
    public RegisteredUser (String firstName, String lastName, String passportID, String email, String phoneNumber, String address)
    {

    }
 
    /**
     * 
     * @param firstName
     * @param lastName
     */
    public RegisteredUser (String firstName, String lastName)
    {

    }

    /**
     * 
     * @param preferences
     */
    private void savePreferences (ArrayList <Preferences> preferences)
    {

    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @return
     */
    public ArrayList <Preferences> login (String firstName, String lastName)
    {

    }

    /**
     * 
     */
    public void CreateAccount()
    {
        
    }

    /**
     * 
     * @return
     */
    public ArrayList <Preferences> askPreferences()
    {
            
    }

    /**
     * 
     * @return
     */
    public String printBookingHistory()
    {

    }

    /**
     * 
     */
    private void saveUserInfo()
    {

    }

    /**
     * 
     */
    public void addFriend()
    {

    }
}
