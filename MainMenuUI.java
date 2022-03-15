import java.util.Scanner;

public class MainMenuUI {
    public void UI() {
        System.out.println("*** Main Menu ***\n\n");
        System.out.print("Please make a selection: \n" +
                "1. Book flight\n" +
                "2. Book hotel\n" +
                "3. Go back\n" +
                "4. View hotel and flight bookings\n" +
                "5. Print flight ticket\n" +
                "6. Print hotel itinerary\n" +
                "7. Go back\n" +
                "8. Exit program\n");
        selection();
    }

    public String selection() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            switch (input) {
                case "1":
                    System.out.println("");
                case "2":
                    System.out.println("");
                case "3":
                    System.out.println("");
                case "4":
                    System.out.println("");
                case "5":
                    System.out.println("");
                case "6":
                    System.out.println("");
                case "7":
                    System.out.println("");
                case "8":
                    System.out.println("Thank you for using Expedio! Goodbye 👋😃");
                    System.exit(0);
            }
        }
    }
}