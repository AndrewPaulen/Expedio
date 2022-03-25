import java.util.Scanner;

public class UserUI {
    private RegisteredUser registeredUser;
    private Guest guestUser;
    private String username;
    private String phoneNum;
    private String firstname;
    private String lastname;
    private String age;
    private MainMenuLoginUI main;

    public void CreateAccount() {
        main = new MainMenuLoginUI();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();
        System.out.println("Please enter your last name: ");
        lastname = scanner.nextLine();
        System.out.println("Please enter a username: ");
        username = scanner.nextLine();
        System.out.println("Please enter you age: ");
        age = scanner.nextLine();
        System.out.println("Please enter a phone number: ");
        phoneNum = scanner.nextLine();
       
        UserSingleton uSing = new UserSingleton();
        uSing.addUser(username, firstname, lastname, age, phoneNum);
        

        registeredUser.setPhoneNumber(phoneNum);
        System.out.println("Account created!\n" +
                "Returning you to login page...");
        scanner.close();
        main.LoginUI();
    }
}
