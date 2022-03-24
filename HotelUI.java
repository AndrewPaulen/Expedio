import java.util.Scanner;

public class HotelUI {

    private Hotel hotel;

    public void bookHotel() {
        System.out.println("*** Book Hotel ***\n\n");
        hotels();
    }

    public void hotels() {
        Scanner input = new Scanner(System.in);

        availableHotels();
    }

    public void availableHotels() {
        System.out.println("Fetching available hotels...\n\n" +
                "Available hotels:\n");
    }
}
