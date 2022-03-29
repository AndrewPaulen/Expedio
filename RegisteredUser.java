import java.util.ArrayList;
import java.util.Scanner;

/**
 * A registered user
 */
public class RegisteredUser extends User {
    MainMenuLoginUI main;
    private ArrayList<Preferences> preferences;
    private ArrayList<RegisteredUser> friends;
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
     * An instance of a registered user
     * 
     * @param firstName   The user's first name
     * @param lastName    The user's last name
     * @param passportID  The user's passport ID
     * @param email       The user's email
     * @param phoneNumber The user's phone number
     * @param address     The user's home address
     */
    public RegisteredUser(String firstName, String lastName, String passportID, String email, String phoneNumber,
            String address) {
        super(firstName, lastName);
        this.passportID = passportID;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * An instance of a registered user
     * 
     * @param firstName The user's first name
     * @param lastName  The user's last name
     */
    public RegisteredUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * The user logs in using their username
     * 
     * @param username The user's username
     * @return UserLoader.getUser(username) != null The user's username is not null
     */
    public boolean login(String username) {
        return (UserLoader.getUser(username) != null);
    }

    /**
     * Asks for the user's preferences
     * 
     * @return preferences The user's preferences
     */
    public ArrayList<Preferences> askPreferences() {
        return preferences;
    }

    /**
     * Saves the user's preferences
     * 
     * @param preferences The user's preferences
     */
    private void savePreferences(ArrayList<Preferences> preferences) {

    }

    /**
     * Method to print booking history of a user.
     * 
     * @return ret The string containing what will be printed to the console
     */
    public String printBookingHistory() {
        String ret = "";
        ret += "Flight History:" + "\n" + "\n";
        for (Flight x : flightBookings) {
            ret += x.getAirline() + "\n";
            ret += x.getArrivalDate() + "\n";
            ret += x.getArrivalLocation() + "\n";
            ret += x.getArrivalTime() + "\n";
            ret += x.getDepartureDate() + "\n";
            ret += x.getDepartureLocation() + "\n";
            ret += x.getDepartureTime() + "\n";
        }

        ret += "Hotel History:" + "\n";
        for (Hotel x : hotelBookings) {
            ret += x.getLocation();
            ret += x.getCheckInTime();
            ret += x.getCheckInDate();
            ret += x.getCheckOutTime();
            ret += x.getCheckOutDate();
        }
        return ret;
    }

    /**
     * Saves the user's information
     */
    private void saveUserInfo() {

    }

    /**
     * This method adds a user to this user's friend list.
     */
    public void addFriend(RegisteredUser user) {
        friends.add(user);
    }

    /**
     * Gets the user's ID
     * 
     * @return userID The user's ID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the user's ID
     * 
     * @param userID The user's ID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * Gets the user's first name
     * 
     * @return firstName The user's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the user's first name
     * 
     * @param The user's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the user's last name
     * 
     * @return lastName The user's last names
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the user's last name
     * 
     * @param lastName The user's last name
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
     * 
     * @param email The user's email
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
     * 
     * @param phoneNumber The user's phone number
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
     * Sets the user's address
     * 
     * @param address The user's home address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the user's flight bookings
     * 
     * @return flightBookings The flight(s) the user has booked
     */
    public ArrayList<Flight> getFlightBookings() {
        return flightBookings;
    }

    /**
     * Sets the user's flight bookings
     * 
     * @param flightBookings The flight(s) the user has booked
     */
    public void setFlightBookings(ArrayList<Flight> flightBookings) {
        this.flightBookings = flightBookings;
    }

    /**
     * Gets the user's hotel bookings
     * 
     * @return hotelBookings The hotel room(s) the user has booked
     */
    public ArrayList<Hotel> getHotelBookings() {
        return hotelBookings;
    }

    /**
     * Sets the user's hotel bookings
     * 
     * @param hotelBookings The hotel room(s) the user has booked
     */
    public void setHotelBookings(ArrayList<Hotel> hotelBookings) {
        this.hotelBookings = hotelBookings;
    }

    /**
     * Gets the user's preferences
     * 
     * @return preferences The user's preferences
     */
    public ArrayList<Preferences> getPreferences() {
        return preferences;
    }

    /**
     * Sets the user's preferences
     * 
     * @param preferences The user's preferences
     */
    public void setPreferences(ArrayList<Preferences> preferences) {
        this.preferences = preferences;
    }

    /**
     * Gets the user's friends
     * 
     * @return friends The user's friends
     */
    public ArrayList<RegisteredUser> getFriends() {
        return friends;
    }

    /**
     * Sets the user's plans
     * 
     * @param friends The user's friends
     */
    public void setFriends(ArrayList<RegisteredUser> friends) {
        this.friends = friends;
    }
}