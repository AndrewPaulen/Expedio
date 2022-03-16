/**
 * Methods to be implemented for preferences
 * @author Andrew Paulen
 */
public interface Preferences 
{
    public Rating getRating();
    public void setRating (Rating rating);
    public boolean getNone();
    public void setNone (boolean none);
}