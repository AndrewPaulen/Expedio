import java.util.Scanner;

/**
 * The login and main menu UI
 * 
 * @author Sophia Riley
 */
public class MainMenuLoginUI {

    private RegisteredUser registeredUser;
    private Guest guestUser;
    private FlightUI flightUI;
    private HotelUI hotelUI;

    public void LoginUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Welcome to Expedio! ***\n\n");
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        scanner.close();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        scanner.close();
        System.out.println("Enter your first name: \n" +
                "1. Login \n" +
                "2. Create account \n" +
                "3. Continue as guest \n" +
                "4. Exit program \n");
        loginSelection();
    }

    public String loginSelection() {
        System.out.println("Please make a selection (enter a number): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        while (true) {
            switch (input) {
                case "1":
                    System.out.println("Enter your username: ");
                    String username = scanner.nextLine();
                    scanner.close();
                    registeredUser.login(firstName, lastName); // come back to this later
                    if (true) {

                    } else {
                        System.out.println("Sorry, you don't have an account yet!");
                        // do something after this
                    }
                    break;
                case "2":
                    registeredUser.CreateAccount();
                    break;
                case "3":
                    MainMenuUI();
                    break;
                case "4":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
                    break;
            }
            System.out.println("Sorry! Please enter a valid input");
        }
    }

    public void MainMenuUI() {
        System.out.println("*** Main Menu ***\n\n");
        System.out.print("Please make a selection: \n" +
                "1. Book flight\n" +
                "2. Book hotel\n" +
                "3. View hotel and flight bookings\n" +
                "4. Print flight ticket\n" +
                "5. Print hotel itinerary\n" +
                "6. Exit program\n");
        mmSelection();
    }

    public String mmSelection() {
        System.out.println("Please make a selection (enter a number): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        while (true) {
            switch (input) {
                case "1":
                    flightUI.methodHere(); // come back to this
                    break;
                case "2":
                    hotelUI.methodHere(); // come back to this
                    break;
                case "3":
                    System.out.println("Enter \"F\" to view flight bookings." +
                            "Enter \"H\' to view hotel bookings." +
                            "Enter \"B\" to go back.");
                    input = scanner.nextLine();
                    if (input.equalsIgnoreCase("F")) {
                        Flight.toString(); // come back to this
                    } else if (input.equalsIgnoreCase("H")) {
                        Hotel.methodHere(); // come back to this
                    } else if (input.equalsIgnoreCase("B")) {
                        MainMenuUI();
                    }
                    break;
                case "4":
                    Flight.toString(); // come back to this
                    break;
                case "5":
                    Hotel.methodHere(); // come back to this
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