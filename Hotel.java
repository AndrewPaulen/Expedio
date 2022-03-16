import java.util.*;

public class Hotel {
    private UUID id;
    private String name;
    private String location;
    private boolean vacancy;

    public Hotel(String name, String location, boolean vacancy){
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
    }

    public Hotel(UUID id, String name, String location, boolean vacancy){
        this.id = id;
        this.name = name;
        this.location = location;
        this.vacancy = vacancy;
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
}
