import java.util.Scanner;

/**
 * @author Sophia Riley
 * @author Shash Comandur
 */
public class HotelUI {

    private Hotel hotel;
    private String city;
    private int guests;
    private String bedType;
    private String pool;
    private String gym;
    private String rs;
    // private int numOfBeds;

    public void bookHotel() {
        System.out.println("\n*** Book Hotel Room ***");
        hotels();
    }

    // hotel details include location, rating, prices, amentities, and room type
    public void hotels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city would you like to stay in?: ");
        city = scanner.nextLine();
        Location desiredCity = LocationsLoader.getLocation(city);
        // check if location exists

        System.out.println("How many guests are staying in the room? Enter a value between 1-4: ");
        guests = scanner.nextInt();
        validGuests();

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

        System.out.println("Amenities:\n" +
                "Would you like your hotel to have a pool? (y/n): ");
        pool = scanner.next();
        poolSelection(pool);

        System.out.println("Would you like your hotel to have a gym? (y/n): ");
        gym = scanner.nextLine();
        gymSelection(gym);

        System.out.println("Would you like your hotel to have room service? (y/n): ");
        rs = scanner.nextLine();
        rsSelection(rs);

        availableHotels(desiredCity, guests, bedType);
    }

    public void validGuests() {
        Scanner scanner = new Scanner(System.in);
        if (guests <= 0 || guests >= 5) {
            System.out.println("Sorry! That's an invalid input. The number of guests has to be between 1-4.\n");
            System.out.println("Please enter the number of guests: ");
            guests = scanner.nextInt();
            validGuests();
        }
    }

    public void validBedType(String bedType) {
        Scanner scanner = new Scanner(System.in);
        switch (bedType) {
            case "1":
                System.out.println("Your room will include one king bed and one couch.");
                break;
                // set bed type --------------------------------------- enum for bed types dne yet?
            case "2":
                System.out.println("Your room will include one king bed.");
                break;
            case "3":
                System.out.println("Your room will include two queen beds and one couch.");
                break;
            case "4":
                System.out.println("Your room will include two queen beds.");
                break;
            case "5":
                System.out.println("Your room will include two double beds.");
                break;
            case "6":
                System.out.println("Your room will include one double bed.");
                break;
            case "7":
                System.out.println("Your room will include one twin bed.");
                break;
            default:
                System.out.println("Sorry! Invalid input. Please choose a number between 1-7:");
                bedType = scanner.next();
                validBedType(bedType);
                break;
        }
    }

    public void poolSelection(String pool) {
        Scanner scanner = new Scanner(System.in);
        pool.toLowerCase();
        if (pool.equals("y")) {
            hotel.setPool(true);
        }
        else if (pool.equals("n")) {
            hotel.setPool(false);
        }
        else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            pool = scanner.next();
            poolSelection(pool);
        }
    }

    public void gymSelection(String gym) {
        Scanner scanner = new Scanner(System.in);
        gym.toLowerCase();
        if (gym.equals("y")) {
            hotel.setGym(true);
        }
        else if (pool.equals("n")) {
            hotel.setGym(false);
        }
        else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            gym = scanner.next();
            gymSelection(gym);
        }
    }

    public void rsSelection(String rs) {
        Scanner scanner = new Scanner(System.in);
        rs.toLowerCase();
        if (rs.equals("y")) {
            hotel.setRS(true);
        }
        else if (pool.equals("n")) {
            hotel.setRS(false);
        }
        else {
            System.out.println("Sorry! Invalid input. Please choose again (y/n):");
            rs = scanner.next();
            rsSelection(rs);
        }
    }

    public void availableHotels(Location desiredCity, int guests, String bedType) {
        System.out.println("\nFetching available hotel rooms...\n" +
                "Available hotels: \n");
        Hotel hotel = new Hotel(desiredCity, guests, bedType);
        hotel.printRoomOption(desiredCity, guests, bedType);

    }
}
