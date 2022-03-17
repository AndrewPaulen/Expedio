/**
 * 
 */
public class Plane 
{
    protected String planeType;
    private PlaneSeat [] [] planeSeats;
    
    /**
     * 
     * @param row
     * @param col
     * @return
     */
    public boolean checkAvailable (int row, int col)
    {
        
    }

    public String getPlaneType()
    {
        return planeType;
    }

    public void setPlaneType (String planeType)
    {
        this.planeType = planeType;
    }

    public PlaneSeat [] [] getPlaneSeats()
    {
        return planeSeats;
    }

    public void setPlaneSeats (PlaneSeat [] [] planeSeats)
    {
        this.planeSeats = planeSeats;
    }
}