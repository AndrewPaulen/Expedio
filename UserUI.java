import java.util.Scanner;

public class UserUI {
    private RegisteredUser registeredUser;
    private Guest guestUser;
    private String username;
    private String phoneNum;

    public void UserUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a username: ");
        username = scanner.nextLine();
        System.out.println("Please enter a phone number: ");
        phoneNum = scanner.nextLine();
        registeredUser.RegisteredUser(username, phoneNum);
    }
}
