import java.util.Scanner;

public class UserUI {
    private RegisteredUser registeredUser;
    // private Guest guestUser;
    // private String username;
    private String phoneNum;
    private MainMenuLoginUI main;

    public void CreateAccount() {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter a username: ");
        // username = scanner.nextLine();
        System.out.println("Please enter a phone number: ");
        phoneNum = scanner.nextLine();
        registeredUser.setPhoneNumber(phoneNum);
        System.out.println("Account created!\n" +
                "Returning you to login page...");
        scanner.close();
        main.LoginUI();
    }
}
