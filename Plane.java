/**
 * 
 */
public class Plane 
{
    protected String planeType;
    private PlaneSeat [] [] planeSeats;
    
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

    public PlaneSeat [] [] getPlaneSeats()
    {
        return planeSeats;
    }

    public void setPlaneSeats (PlaneSeat [] [] planeSeats)
    {
        this.planeSeats = planeSeats;
    }
}