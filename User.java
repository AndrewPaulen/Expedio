import java.util.ArrayList;

/**
 * 
 */
public interface User 
{
    // No clue what these errors are for
    public String userID;
    public String firstName;
    public String lastName;
    public String passportID;
    public String email;
    public String phoneNumber;
    public String address;
    public ArrayList <Flight> flightBookings;
    public ArrayList <Hotel> hotelBookings;
}