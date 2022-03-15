import java.util.ArrayList;

/**
 * 
 */
public interface User 
{
    // No clue what these errors are for
    public ArrayList <Preferences> askPreferences();
    public String printBookingHistory();
    public String getUserID();
    public void setUserID(String userID);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getPassportID();
    public void setPassportID(String passportID);
    public String getEmail();
    public void setEmail(String email);
    public String getPhoneNumber();
    public void setPhoneNUmber(String phoneNumber);
    public String getAddress();
    public void setAddress(String address);
    public ArrayList<Flight> getFlightBookings();
    public ArrayList<Hotel> getHotelBookings();
}