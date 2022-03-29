import java.util.Scanner;

/**
 * The UI for booking a hotel
 * 
 * @authors Sophia Riley, Shash Comandur
 */
public class HotelUI {

    // private Hotel hotel;
    private String city;
    private int guests;
    private String bedType;
    private String pool;
    private String gym;
    private String rs;

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

        // check pool pref
        System.out.println("\nAmenities:\n" +
                "Would you like your hotel to have a pool? (y/n): ");
        pool = scanner.next();
        poolSelection(pool);

        // check gym pref
        System.out.println("Would you like your hotel to have a gym? (y/n): ");
        gym = scanner.next();
        gymSelection(gym);

        // check room service pref
        System.out.println("Would you like your hotel to have room service? (y/n): ");
        rs = scanner.next();
        rsSelection(rs);

        availableHotels(desiredCity, guests, bedType);
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
                // hotel.setBedType("1k, 1c, 0q, 0d, 0t");
                break;
            case "2":
                System.out.println("Your room will include one king bed.");
                // hotel.setBedType("1k, 0c, 0q, 0d, 0t");
                break;
            case "3":
                System.out.println("Your room will include two queen beds and one couch.");
                // hotel.setBedType("0k, 1c, 2q, 0d, 0t");
                break;
            case "4":
                System.out.println("Your room will include two queen beds.");
                // hotel.setBedType("0k, 0c, 2q, 0d, 0t");
                break;
            case "5":
                System.out.println("Your room will include two double beds.");
                // hotel.setBedType("0k, 0c, 0q, 2d, 0t");
                break;
            case "6":
                System.out.println("Your room will include one double bed.");
                // hotel.setBedType("0k, 0c, 0q, 1d, 0t");
                break;
            case "7":
                System.out.println("Your room will include one twin bed.");
                // hotel.setBedType("0k, 0c, 0q, 0d, 1t");
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
    public void poolSelection(String pool) {
        Scanner scanner = new Scanner(System.in);
        pool.toLowerCase();
        if (pool.equals("y")) {
            // hotel.setPool(true);
            System.out.println("Your hotel will have a pool.");
        } else if (pool.equals("n")) {
            // hotel.setPool(false);
            System.out.println("Your hotel will not have a pool.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            pool = scanner.next();
            poolSelection(pool);
        }
    }

    /**
     * Determines if a hotel has a gym and checks to see if the user's input is
     * valid.
     * 
     * @param gym If a hotel has a gym
     */
    public void gymSelection(String gym) {
        Scanner scanner = new Scanner(System.in);
        gym.toLowerCase();
        if (gym.equals("y")) {
            // hotel.setGym(true);
            System.out.println("Your hotel will have a gym.");
        } else if (gym.equals("n")) {
            // hotel.setGym(false);
            System.out.println("Your hotel will not have a gym.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            gym = scanner.next();
            gymSelection(gym);
        }
    }

    /**
     * Determines if a hotel has room service and checks to see if the user's input
     * is valid.
     * 
     * @param rs If a hotel has room service
     */
    public void rsSelection(String rs) {
        Scanner scanner = new Scanner(System.in);
        rs.toLowerCase();
        if (rs.equals("y")) {
            // hotel.setRS(true);
            System.out.println("Your hotel will have room service.");
        } else if (rs.equals("n")) {
            // hotel.setRS(false);
            System.out.println("Your hotel will not have room service.");
        } else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            rs = scanner.next();
            rsSelection(rs);
        }
    }

    /**
     * Prints the available hotels
     * 
     * @param desiredCity The city the user wants to stay in
     * @param guests      How many guests are staying in the hotel room
     * @param bedType     The type of bed(s) in the hotel room
     */
    public void availableHotels(Location desiredCity, int guests, String bedType) {
        System.out.println("\nFetching available hotel rooms...\n" +
                "Available hotels: \n");
        Hotel hotel = new Hotel(desiredCity, guests, bedType);
        hotel.printRoomOption(desiredCity, guests, bedType);
    }
}
