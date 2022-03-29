import java.util.Scanner;

/**
 * The login and main menu UI
 * 
 * @author Sophia Riley
 */
public class MainMenuLoginUI {

    private RegisteredUser registeredUser;
    private FlightUI flightUI;
    private HotelUI hotelUI;
    private UserUI userUI;
    private String firstName;
    private String lastName;
    private Flight flight;
    private Hotel hotel;
    private String username;

    /**
     * Prompts the user to enter their first and last names
     */
    public void LoginUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to Expedio! ***");

        // not really using this code- uncomment later if needed
        // boolean exit = false;
        // while (!exit) {
        // System.out.print("Enter your first name: ");
        // firstName = scanner.nextLine();

        // if (firstName.length() > 0)
        // exit = true;

        // else
        // System.out.println("It looks like you didn't type anything in, try again!");
        // }
        // exit = false;
        // while (!exit) {
        // System.out.print("Enter your last name: ");
        // lastName = scanner.nextLine();

        // if (lastName.length() > 0)
        // exit = true;

        // else
        // System.out.println("It looks like you didn't type anything in, try again!");
        // }
        registeredUser = new RegisteredUser(firstName, lastName);
        loginSelection();
        scanner.close();
    }

    /**
     * Prompts the user to either login, create an account, continue as a guest, or
     * exit the program
     */
    public void loginSelection() {
        boolean exit = false;
        userUI = new UserUI();
        while (!exit) {
            System.out.print("\n*** Options ***\n" +
                    "1. Login \n" +
                    "2. Create account \n" +
                    "3. Continue as guest \n" +
                    "4. Exit program \n" +
                    "Please make a selection (enter a number): ");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter your username: ");
                    username = scanner.nextLine();
                    if (registeredUser.login(username)) {
                        MainMenuUI();
                    } else {
                        System.out.println("Sorry, you don't have an account yet!");
                    }
                    exit = true;
                    break;
                case "2":
                    userUI.CreateAccount();
                    exit = true;
                    break;
                case "3":
                    MainMenuUI();
                    exit = true;
                    break;
                case "4":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
                default:
                    System.out.println("Sorry! Please enter a valid input");
            }
            scanner.close();
        }
    }

    /**
     * Prints the main menu and prompts the user to make a selection
     */
    public void MainMenuUI() {
        System.out.println("\n*** Main Menu ***");
        System.out.print("1. Book flight\n" +
                "2. Book hotel room\n" +
                "3. View hotel and flight bookings\n" +
                "4. Print flight ticket\n" +
                "5. Print hotel itinerary\n" +
                "6. Exit program\n" +
                "Please make a selection (enter a number): ");
        mmSelection();
    }

    /**
     * Determines if the user's main menu selection is valid
     */
    public String mmSelection() {
        flightUI = new FlightUI();
        hotelUI = new HotelUI();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            switch (input) {
                case "1":
                    flightUI.bookFlight(); // come back to this
                    break;
                case "2":
                    hotelUI.bookHotel(); // come back to this
                    break;
                case "3":
                    System.out.println("Enter \"F\" to view flight bookings." +
                            "Enter \"H\' to view hotel bookings." +
                            "Enter \"B\" to go back.");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("F")) {
                        flight.toString(); // come back to this
                    } else if (input.equalsIgnoreCase("H")) {
                        hotel.toString(); // come back to this
                    } else if (input.equalsIgnoreCase("B")) {
                        MainMenuUI();
                    }
                    break;
                case "4":
                    flight.toString(); // come back to this
                    break;
                case "5":
                    hotel.toString(); // come back to this
                    break;
                case "6":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
                    break;
            }
            System.out.println("Sorry! Please enter a valid input");
        }
    }
}