import java.util.ArrayList;
import java.util.Scanner;

/**
 * The UI for booking a hotel
 *
 * @author Shash Comandur
 * @author Sophia Riley
 */
public class HotelUI {

    // private Hotel hotel;
    private String city;
    private int guests;
    private String bedType;
    private String startDate;
    private String endDate;
    private boolean pool;
    private boolean gym;
    private boolean rs;
    private String hotelChoice;

    /**
     * The first string printed to the terminal.
     */
    public void bookHotel() {
        System.out.println("\n*** Book Hotel Room ***");
        hotels();
    }

    /**
     * How the user books a hotel.
     */
    public void hotels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city would you like to stay in?: ");
        city = scanner.nextLine();

        // check if location exists
        Location desiredCity = LocationsLoader.getLocation(city);

        // check num of guests
        System.out.println("How many guests are staying in the room? Enter a value between 1-4: ");
        guests = scanner.nextInt();
        validGuests();

        // check room type
        System.out.println("What type of room would you like? Options include:\n" +
                "1. King-couch\n" +
                "2. King\n" +
                "3. Queen-queen-couch\n" +
                "4. Queen-queen\n" +
                "5. Double-double\n" +
                "6. Double\n" +
                "7. Twin\n" +
                "Please enter a number to make a selection: ");
        bedType = scanner.next();
        validBedType(bedType);

        // check reservation dates
        System.out.println("Please enter your desired reservation start date. (MM/DD/YYYY)");
        startDate = scanner.next();
        System.out.println("Please enter your desired reservation end date. (MM/DD/YYYY)");
        endDate = scanner.next();
        
        // check pool pref
        System.out.println("\nAmenities:\n" +
                "Would you like your hotel to have a pool? (y/n): ");
        String poolAnswer = scanner.next();
        poolSelection(poolAnswer);

        // check gym pref
        System.out.println("Would you like your hotel to have a gym? (y/n): ");
        String gymAnswer = scanner.next();
        gymSelection(gymAnswer);

        // check room service pref
        System.out.println("Would you like your hotel to have room service? (y/n): ");
        String rsAnswer = scanner.next();
        rsSelection(rsAnswer);

        // search for and print hotels
        ArrayList <Hotel> hotelList = availableHotels(desiredCity, guests, bedType, startDate, endDate, pool, gym, rs);

        // choose hotel
        chooseHotel(hotelList, desiredCity, guests, bedType, startDate, endDate, pool, gym, rs);

        // exit back to main menu
        MainMenuLoginUI ui = new MainMenuLoginUI();
        ui.MainMenuUI();
    }

    /**
     * Checks to see if the number of guests entered by the user is valid
     */
    public void validGuests() {
        Scanner scanner = new Scanner(System.in);
        if (guests <= 0 || guests >= 5) {
            System.out.println("Sorry! That's an invalid input. The number of guests has to be between 1-4.\n");
            System.out.println("Please enter the number of guests: ");
            guests = scanner.nextInt();
            validGuests();
        }
    }

    /**
     * Checks to see if the bed type entered by the user is valid
     */
    public void validBedType(String bedType) {
        Scanner scanner = new Scanner(System.in);
        switch (bedType) {
            case "1":
                System.out.println("Your room will include one king bed and one couch.");
                // hotel.setBedType(RoomType.KING_COUCH);
                break;
            case "2":
                System.out.println("Your room will include one king bed.");
                // hotel.setBedType(RoomType.KING);
                break;
            case "3":
                System.out.println("Your room will include two queen beds and one couch.");
                // hotel.setBedType(RoomType.QUEEN_QUEEN_COUCH);
                break;
            case "4":
                System.out.println("Your room will include two queen beds.");
                // hotel.setBedType(RoomType.QUEEN_QUEEN);
                break;
            case "5":
                System.out.println("Your room will include two double beds.");
                // hotel.setBedType(RoomType.DOUBLE_DOUBLE);
                break;
            case "6":
                System.out.println("Your room will include one double bed.");
                // hotel.setBedType(RoomType.DOUBLE);
                break;
            case "7":
                System.out.println("Your room will include one twin bed.");
                // hotel.setBedType(RoomType.TWIN);
                break;
            default:
                System.out.println("Sorry! Invalid input. Please choose a number between 1-7:");
                bedType = scanner.next();
                validBedType(bedType);
                break;
        }
    }

    /**
     * Determines if a hotel has a pool and checks to see if the user's input is
     * valid.
     * 
     * @param pool If a hotel has a pool
     */
    public void poolSelection(String poolAnswer) {
        Scanner scanner = new Scanner(System.in);
        poolAnswer.toLowerCase();
        if (poolAnswer.equals("y")) {
            // hotel.setPool(true);
            pool = true;
            System.out.println("Your hotel will have a pool.");
        } else if (poolAnswer.equals("n")) {
            // hotel.setPool(false);
            pool = false;
            System.out.println("Your hotel will not have a pool.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            poolAnswer = scanner.next();
            poolSelection(poolAnswer);
        }
    }

    /**
     * Determines if a hotel has a gym and checks to see if the user's input is
     * valid.
     * 
     * @param gym If a hotel has a gym
     */
    public void gymSelection(String gymAnswer) {
        Scanner scanner = new Scanner(System.in);
        gymAnswer.toLowerCase();
        if (gymAnswer.equals("y")) {
            // hotel.setGym(true);
            gym = true;
            System.out.println("Your hotel will have a gym.");
        } else if (gymAnswer.equals("n")) {
            // hotel.setGym(false);
            gym = false;
            System.out.println("Your hotel will not have a gym.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            gymAnswer = scanner.next();
            gymSelection(gymAnswer);
        }
    }

    /**
     * Determines if a hotel has room service and checks to see if the user's input
     * is valid.
     * 
     * @param rs If a hotel has room service
     */
    public void rsSelection(String rsAnswer) {
        Scanner scanner = new Scanner(System.in);
        rsAnswer.toLowerCase();
        if (rsAnswer.equals("y")) {
            // hotel.setRS(true);
            rs = true;
            System.out.println("Your hotel will have room service.");
        } else if (rsAnswer.equals("n")) {
            // hotel.setRS(false);
            rs = false;
            System.out.println("Your hotel will not have room service.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            rsAnswer = scanner.next();
            rsSelection(rsAnswer);
        }
    }

    /**
     * Prints the available hotels
     * 
     * @param desiredCity The city the user wants to stay in
     * @param guests      How many guests are staying in the hotel room
     * @param bedType     The type of bed(s) in the hotel room
     */
    public ArrayList <Hotel> availableHotels(Location desiredCity, int guests, String bedType,
    String startDate, String endDate, boolean pool, boolean gym, boolean rs) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("\nFetching available hotel rooms...\n" +
                "\n*** Available Hotels: ***");
        Hotel hotel1 = new Hotel(desiredCity, guests, bedType, startDate, endDate, !pool, !gym, !rs);
        Hotel hotel2 = new Hotel(desiredCity, guests+3, bedType, startDate, endDate, !pool, !gym, rs);
        Hotel hotel3 = new Hotel(desiredCity, guests+2, bedType, startDate, endDate, pool, gym, rs);
        Hotel hotel4 = new Hotel(desiredCity, guests, bedType, startDate, endDate, pool, !gym, !rs);
        hotel1.printRoomOption(desiredCity, guests, bedType);
        hotel2.printRoomOption(desiredCity, guests, bedType);
        hotel3.printRoomOption(desiredCity, guests, bedType);
        hotel4.printRoomOption(desiredCity, guests, bedType);
        ArrayList <Hotel> hotelList = new ArrayList <Hotel>();
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
        hotelList.add(hotel4);
        return hotelList;
    }

    public void chooseHotel(ArrayList <Hotel> hotelList, Location desiredCity, int guests, String bedType,
    String startDate, String endDate, boolean pool, boolean gym, boolean rs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which hotel would you like to stay at? Please select an option (1-4).");
        int hotelChoice = scanner.nextInt();
        Hotel selectedHotel = hotelList.get(hotelChoice - 1);
        System.out.println("\nYou've chosen hotel: " + hotelChoice+"\n");
        System.out.println ("Printing your hotel itinerary now...\n");
        selectedHotel.printHotel(desiredCity, guests, bedType, startDate, endDate);
    }


}