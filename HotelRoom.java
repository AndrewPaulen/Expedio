/**
 * 
 */
public class HotelRoom 
{
    protected int numBeds;
    private int numGuests;
    protected String bedType;
    private String bookingDate;

    public int getNumBeds()
    {
        return numBeds;
    }

    public void setNumBeds (int numBeds)
    {
        this.numBeds = numBeds;
    }

    public int getNumGuests()
    {
        return numGuests;
    }

    public void setNumGuests (int numGuests)
    {
        this.numGuests = numGuests;
    }

    public String getBedType()
    {
        return bedType;
    }

    public void setBedType (String bedType)
    {
        this.bedType = bedType;
    }

    public String getBookingDate()
    {
        return bookingDate;
    }

    public void setBookingDate (String bookingDate)
    {
        this.bookingDate = bookingDate;
    }
}