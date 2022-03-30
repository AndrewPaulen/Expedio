import java.util.Scanner;
import java.util.UUID;

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
     * Prints the first line to the login menu
     */
    public void LoginUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to Expedio! ***");
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
                    registeredUser = new RegisteredUser(firstName, lastName);
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
                    System.out.println("Thank you for using Expedio! Goodbye!");
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
        flightUI = new FlightUI();
        hotelUI = new HotelUI();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n*** Main Menu ***");
            System.out.print("1. Book flight\n" +
                    "2. Book hotel room\n" +
                    "3. View hotel and flight bookings\n" +
                    "4. Print flight ticket\n" +
                    "5. Print hotel itinerary\n" +
                    "6. Exit program\n" +
                    "Please make a selection (enter a number): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    flightUI.bookFlight();
                    break;
                case "2":
                    hotelUI.bookHotel();
                    break;
                case "3":
                    System.out.println("Enter \"F\" to view flight bookings." +
                            "Enter \"H\' to view hotel bookings." +
                            "Enter \"B\" to go back.");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("F")) {
                        flight.toString();
                    } else if (input.equalsIgnoreCase("H")) {
                        hotel.toString();
                    } else if (input.equalsIgnoreCase("B")) {
                        MainMenuUI();
                    }
                    break;
                case "4":
                    Plane plane = new Plane();
                    plane.logToConsole();
                    break;
                case "5":
                   Hotel hotel = new Hotel(UUID.randomUUID(), " ", null, true);
                   hotel.logToConsole();
                    break;
                case "6":
                    System.out.println("Thank you for using Expedio! Goodbye!");
                    exit = true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry! Please enter a valid input");
            }
        }
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
                    flightUI.bookFlight();
                    break;
                case "2":
                    hotelUI.bookHotel();
                    break;
                case "3":
                    System.out.println("Enter \"F\" to view flight bookings." +
                            "Enter \"H\' to view hotel bookings." +
                            "Enter \"B\" to go back.");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("F")) {
                        flight.toString();
                    } else if (input.equalsIgnoreCase("H")) {
                        hotel.toString();
                    } else if (input.equalsIgnoreCase("B")) {
                        MainMenuUI();
                    }
                    break;
                case "4":
                    flight.toString();
                    break;
                case "5":
                    hotel.toString();
                    break;
                case "6":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry! Please enter a valid input");
            }
        }
    }
}