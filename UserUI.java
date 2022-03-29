import java.util.Scanner;

/**
 * The UI for creating an account
 * 
 * @author Sophia Riley
 */
public class UserUI {
    private String username;
    private String phoneNum;
    private String firstname;
    private String lastname;
    private String age;
    private MainMenuLoginUI main;

    /**
     * Prompts the user for information needed to create an account
     */
    public void CreateAccount() {
        System.out.println("\n*** Create Account ***");
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

        System.out.println("Account created!\n" +
                "Returning you to login page...");
        scanner.close();
        main.LoginUI();
    }
}
