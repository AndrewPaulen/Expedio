import java.util.Scanner;

/**
 * The login and main menu UI
 * 
 * @author Sophia Riley
 */
public class MainMenuLoginUI {

    private RegisteredUser registeredUser;
    // private Guest guestUser;
    private FlightUI flightUI;
    private HotelUI hotelUI;
    private UserUI userUI;
    private String firstName;
    private String lastName;
    private Flight flight;
    private Hotel hotel;
    private String username;

    public void LoginUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to Expedio! ***");

        boolean exit = false;
        while (!exit) {
            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            if (firstName.length() > 0)
                exit = true;

            else
                System.out.println("It looks like you didn't type anything in, try again!");
        }

        exit = false;
        while (!exit) {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();

            if (lastName.length() > 0)
                exit = true;

            else
                System.out.println("It looks like you didn't type anything in, try again!");
        }
        registeredUser = new RegisteredUser(firstName, lastName);
        loginSelection();
        scanner.close();
    }

    public void loginSelection() {
        boolean exit = false;
        userUI = new UserUI();
        while (!exit) {
            System.out.print("Main Menu Options\n" +
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
                        System.out.println("This Works");
                    } else {
                        System.out.println("Sorry, you don't have an account yet!");
                    }
                    exit = true;
                case "2":
                    userUI.CreateAccount();
                    exit = true;
                case "3":
                    MainMenuUI();
                    exit = true;
                case "4":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
                default:
                    System.out.println("Sorry! Please enter a valid input");
            }
            scanner.close();
        }
    }

    public void MainMenuUI() {
        System.out.println("*** Main Menu ***\n\n");
        System.out.print("Please make a selection: \n" +
                "1. Book flight\n" +
                "2. Book hotel room\n" +
                "3. View hotel and flight bookings\n" +
                "4. Print flight ticket\n" +
                "5. Print hotel itinerary\n" +
                "6. Exit program\n");
        mmSelection();
    }

    public String mmSelection() {
        flightUI = new FlightUI();
        System.out.println("Please make a selection (enter a number): ");
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