import java.util.ArrayList;

/**
 * 
 */
public class RegisteredUser extends User {
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
     * 
     * @param firstName
     * @param lastName
     * @param passportID
     * @param email
     * @param phoneNumber
     * @param address
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
     * 
     * @param firstName
     * @param lastName
     */
    public RegisteredUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * // this should work
     * 
     * @param firstName
     * @param lastName
     * @return
     */
    public boolean login(String firstName, String lastName) {
        return (UserLoader.getUser(firstName, lastName) != null);
    }

    /**
     * 
     */
    public void CreateAccount(String firstName, String lastName) {

    }

    /**
     * 
     * @return
     */
    public ArrayList<Preferences> askPreferences() {
        return preferences;
    }

    /**
     * 
     * @param preferences
     */
    private void savePreferences(ArrayList<Preferences> preferences) {

    }

    /**
     * 
     * @return
     */
    public String printBookingHistory() {
        String ret = "";
        ret += "Flight History:" + "\n";
        for (Flight x : flightBookings) {

        }

        ret += "Hotel History:" + "\n";
        for (Hotel x : hotelBookings) {

        }

        return ret;
    }

    /**
     * 
     */
    private void saveUserInfo() {

    }

    /**
     * 
     */
    public void addFriend(RegisteredUser user) {
        friends.add(user);
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

    public void setPhoneNUmber(String phoneNumber) {
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

    public ArrayList<Preferences> getPreferences() {
        return preferences;
    }

    public void setPreferences(ArrayList<Preferences> preferences) {
        this.preferences = preferences;
    }

    public ArrayList<RegisteredUser> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<RegisteredUser> friends) {
        this.friends = friends;
    }
}