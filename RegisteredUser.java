import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
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
    public boolean login(String username) {
        return (UserLoader.getUser(username) != null);
    }

    /**
     * 
     */
    public void CreateAccount() {
        main = new MainMenuLoginUI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        String lastname = scanner.nextLine();
        System.out.println("Please enter a username: ");
        String username = scanner.nextLine();
        System.out.println("Please enter you age: ");
        String age = scanner.nextLine();
        System.out.println("Please enter a phone number: ");
        String phoneNum = scanner.nextLine();
       
        UserSingleton uSing = new UserSingleton();
        uSing.addUser(username, firstname, lastname, age, phoneNum);
        uSing.saveUsers();

        System.out.println("Account created!\n" +
                "Returning you to login page...");
        scanner.close();
        main.LoginUI();
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
     * Method to print booking history of a user.
     * @return  the string containing what will be printed to the console
     */
    public String printBookingHistory() {
        String ret = "";
        ret += "Flight History:" + "\n" + "\n";
        for (Flight x: flightBookings) {
            ret += x.getAirline() + "\n";
            ret += x.getArrivalDate() + "\n";
            ret += x.getArrivalLocation() + "\n";
            ret += x.getArrivalTime() + "\n";
            ret += x.getDepartureDate() + "\n";
            ret += x.getDepartureLocation() + "\n";
            ret += x.getDepartureTime() + "\n";
        }

        ret += "Hotel History:" + "\n";
        for (Hotel x: hotelBookings) {
            ret += x.getLocation();
            ret += x.getCheckInTime();
            ret += x.getCheckInDate();
            ret += x.getCheckOutTime();
            ret += x.getCheckOutDate();
        }
        return ret;
    }

    /**
     * 
     */
    private void saveUserInfo() {

    }

    /**
     * This method adds a user to this user's friend list.
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