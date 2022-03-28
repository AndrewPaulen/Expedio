import java.util.Scanner;

/**
 * 
 */
public class Plane 
{
    protected String planeType;
    private PlaneSeat [][] planeSeats;
    static int filled = 0;
    
    /**
     * this should work
     * @param row
     * @param col
     * @return
     */
    public boolean checkAvailable (int row, int col)
    {
        return (planeSeats[row][col].getHasPassenger());
    }

    public String getPlaneType()
    {
        return planeType;
    }

    public void setPlaneType (String planeType)
    {
        this.planeType = planeType;
    }

    public PlaneSeat[][] getPlaneSeats()
    {
        return planeSeats;
    }

    public void setPlaneSeats (PlaneSeat [] [] planeSeats)
    {
        this.planeSeats = planeSeats;
    }

    public String[] seating(int passengers){
        String[] seatNums = new String[passengers];
        int count = 0;
        char[][] seats = new char[7][4];
        for(int i=0 ; i<7 ; i++){
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
        if(seatNumber.equals("b")){
            System.out.println("going back...");
            MainMenuLoginUI ui = new MainMenuLoginUI();
            ui.MainMenuUI();
        }
        while(filled < 28 && seatNumber.length() > 0){
            int row = seatNumber.charAt(0) - '1';
            int col = seatNumber.charAt(1) - 'A';
            if(row < 0 || row > 7 || col < 0 || col > 4){
                System.out.println("Input error, Enter seat to assign (e.g., '1A')");
                seatNumber = keyboard.nextLine();
                if(seatNumber.equals('b')){
                    System.out.println("going back...");
                    MainMenuLoginUI ui = new MainMenuLoginUI();
                    ui.MainMenuUI();
                }
            } else {
                if(seats[row][col] != 'X'){
                    seats[row][col] = 'X';
                    seatNumber = seatNums[count];
                    count++;
                    filled++;
                    System.out.println(" ");
                    printSeats(seats);
                }
                if(passengers == filled){
                    break;
                } else if (filled < 28){
                    System.out.println("Enter a seat to assign (e.g., '1A')");
                    seatNumber = keyboard.nextLine();
                }
                
            }
        }
        return seatNums;
    }

    private static void printSeats(char[][] seats){
        System.out.println("Row");
        for (int i = 0; i < seats.length ; i++){
            System.out.println((i+1)+"  "+seats[i][0]+" "+seats[i][1]+"   "+seats[i][2]+" "+seats[i][3]);
        }
        int numberOfSeatsAvailable = (28 - filled);
        System.out.println("There are "+numberOfSeatsAvailable+" seats available");
    }
}