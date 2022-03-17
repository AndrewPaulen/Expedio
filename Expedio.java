/**
 * The driver file
 * @author Andrew Paulen
 */
public class Expedio 
{
    public static void main (String [] args)
    {
        Expedio expedio = new Expedio();
        expedio.run();
    }

    public Expedio() {}

    public void run()
    {
        MainMenuUI.loginUI();
    }
}