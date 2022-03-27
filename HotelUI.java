import java.util.Scanner;

/**
 * @author Sophia Riley
 */
public class HotelUI {

    private Hotel hotel;
    private String city;
    private int guests;
    private String bedType;
    // private int numOfBeds;

    public void bookHotel() {
        System.out.println("*** Book Hotel Room ***\n\n");
        hotels();
    }

    public void hotels() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What city would you like to stay in?: ");
        city = scanner.nextLine();
        Location desiredCity = LocationsLoader.getLocation(city);
        System.out.println("How many guests are staying in the room? Enter a value between 1-4: ");
        guests = scanner.nextInt();
        validGuests();
        System.out.println("What room type would you like? " +
                "Options include: king-couch, king, queen-queen-couch, queen-queen, double-double, double, and twin.");
        bedType = scanner.nextLine();
        validBedType();
        System.out.println("How many beds would you like? Enter a value between 1-2:");
        int numOfBeds = scanner.nextInt();
        validNumOfBeds(numOfBeds);
        availableHotels(desiredCity, guests, bedType);
    }

    public void validGuests() {
        if (guests <= 0 || guests >= 5) {
            System.out.println("Sorry! That's an invalid input. Please try again...");
            // come back to this
        }
    }

    public void validBedType() {
        // come back to this
    }

    public void validNumOfBeds(int numOfBeds) {
        if (numOfBeds <= 0 || numOfBeds >= 3) {
            System.out.println("Sorry! That's an invalid input. Please try again...");
        }
    }

    public void availableHotels(Location desiredCity, int guests, String bedType) {
        System.out.println("Fetching available hotel rooms...\n" +
                "Available hotels: \n");
        Hotel hotel = new Hotel(desiredCity, guests, bedType);

        hotel.printRoomOption(desiredCity, guests, bedType);

    }
}
