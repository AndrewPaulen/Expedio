/**
 * The driver file
 * 
 * @author Andrew Paulen
 */
public class Expedio {
    public static void main(String[] args) {
        Expedio expedio = new Expedio();
        expedio.run();
    }

    public Expedio() {

    }

    public void run() {
        MainMenuLoginUI mainMenuUI = new MainMenuLoginUI();
        mainMenuUI.LoginUI();
    }
}