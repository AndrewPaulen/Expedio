import java.util.*;

public class Hotel {
    private UUID id;
    private String name;
    private String location;
    private boolean vacancy;
    private String checkInTime;
    private String checkOutTime;
    private String checkInDate;
    private String checkOutDate;
    private String roomNumber;
    


    public Hotel(String name, String location, boolean vacancy, String checkInTime, String checkOutTime, String checkInDate, String checkOutDate){
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
    }

    public Hotel(UUID id, String name, String location, boolean vacancy){
        this.id = id;
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
        this.checkInDate = checkInDate;
        this.checkInTime = checkInTime;
        this.checkOutDate = checkOutDate;
        this.checkOutTime = checkOutTime;
        this.roomNumber = roomNumber;
    }

    public UUID getID()
    {
        return id;
    }

    public void setID (UUID id) 
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation (String location)
    {
        this.location = location;
    }

    public boolean getVacancy()
    {
        return vacancy;
    }

    public void setVacancy (boolean vacancy)
    {
        this.vacancy = vacancy;
    }

    public String getCheckInTime(){
        return this.checkInTime;
    }
    
    public String getCheckInDate(){
        return this.checkInDate;
    }

    public String getCheckOutTime(){
        return this.checkOutTime;
    }

    public String getCheckOutDate(){
        return this.checkOutDate;
    }

    public String getRoomNumber(){
        return this.roomNumber;
    }

    public UUID getHotelID(){
        return this.id;
    }
}
