import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * A plane
 */
public class Plane {
    protected String planeType;
    private PlaneSeat[][] planeSeats;
    static int filled = 0;

    /**
     * Checks if a seat is available
     * 
     * @param row The seat's row
     * @param col The seat's column
     * @return planeSeats[row][col].getHasPassenger() If a seat is already booked or
     *         not
     */
    public boolean checkAvailable(int row, int col) {
        return (planeSeats[row][col].getHasPassenger());
    }

    /**
     * Gets the plane type
     * 
     * @return planeType The type of plane
     */
    public String getPlaneType() {
        return planeType;
    }

    /**
     * Sets the plane type
     * 
     * @param planeType The type of plane
     */
    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    /**
     * Gets the plane seats
     * 
     * @return planeSeats The plane seats
     */
    public PlaneSeat[][] getPlaneSeats() {
        return planeSeats;
    }

    /**
     * Sets the plane seats
     * 
     * @param planeSeats The plane seats
     */
    public void setPlaneSeats(PlaneSeat[][] planeSeats) {
        this.planeSeats = planeSeats;
    }

    /**
     * The seats on the plane
     */
    public String[] seating(int passengers) {
        String[] seatNums = new String[passengers];
        int count = 0;
        char[][] seats = new char[9][4];
        for (int i = 0; i < 9; i++) {
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }

        String seatNumber = " ";
        String b = " ";
        System.out.println("Please enter the seat (e.g. - 1A) you would like to book");
        System.out.println("Enter b to go back\n\n\n");
        Scanner keyboard = new Scanner(System.in);
        seatNumber = keyboard.nextLine();
        if (seatNumber.equals("b")) {
            System.out.println("going back...");
            MainMenuLoginUI ui = new MainMenuLoginUI();
            ui.MainMenuUI();
        }
        while (filled < 36 && seatNumber.length() > 0) {
            int row = seatNumber.charAt(0) - '1';
            int col = seatNumber.charAt(1) - 'A';
            if (row < 0 || row > 9 || col < 0 || col > 4) {
                System.out.println("Input error, Enter seat to assign (e.g., '1A')");
                seatNumber = keyboard.nextLine();
                if (seatNumber.equals('b')) {
                    System.out.println("going back...");
                    MainMenuLoginUI ui = new MainMenuLoginUI();
                    ui.MainMenuUI();
                }
            } else {
                if (seats[row][col] != 'X') {
                    seats[row][col] = 'X';
                    seatNums[count] = seatNumber;
                    count++;
                    filled++;
                    System.out.println(" ");
                    printSeats(seats);
                }
                if (passengers == filled) {
                    break;
                } else if (filled < 36) {
                    System.out.println("Enter a seat to assign (e.g., '1A')");
                    seatNumber = keyboard.nextLine();
                }

            }
        }
        return seatNums;
    }

    /**
     * Prints the seats
     * 
     * @param seats The seats on the plane
     */
    private static void printSeats(char[][] seats) {
        System.out.println("Row");
        for (int i = 0; i < seats.length; i++) {
            System.out.println(
                    (i + 1) + "  " + seats[i][0] + " " + seats[i][1] + "   " + seats[i][2] + " " + seats[i][3]);
        }
        int numberOfSeatsAvailable = (28 - filled);
        System.out.println("There are " + numberOfSeatsAvailable + " seats available");
    }

    public void printTicket(LinkedList<String> names, Flight chosenFlight, String[] seatNumbers, String date){
       
        String DELIM = "          ";
        String decor = "*************************************************************\n*************************************************************";
        String pageBreak = "__________________________________________________________________________________";
        String departing = chosenFlight.getDepartureLocation().toString();
        String destination = chosenFlight.getArrivalLocation().toString();
        int duration = chosenFlight.getDuration();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(pageBreak);
            System.out.println("\n          *****"+chosenFlight.getAirline()+" Flight Ticket*****\n");
            System.out.println("Name: "+names.get(i)+DELIM+"Seat Number: "+seatNumbers[i]);
            System.out.println(decor);
            System.out.println("Destination: "+destination);
            System.out.println("Departing From: "+departing);
            System.out.println("Flight Duration: "+duration+" minutes");
            System.out.println("Departure Date: "+date);
            System.out.println(pageBreak+"\n\n\n");  

            log(pageBreak);
            log("\n          *****"+chosenFlight.getAirline()+" Flight Ticket*****\n");
            log("Name: "+names.get(i)+DELIM+"Seat Number: "+seatNumbers[i]);
            log(decor);
            log("Destination: "+destination);
            log("Departing From: "+departing);
            log("Flight Duration: "+duration+" minutes");
            log("Departure Date: "+date);
            log(pageBreak+"\n\n\n");
        }
    }

    public void log(String line){
        try {
            PrintWriter out = new PrintWriter(new FileWriter("tickets.txt", true), true);
            out.write(line);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}