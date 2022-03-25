import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

import javax.management.DynamicMBean;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LocationsLoader extends LocationsConstants{
    /**
     * @author David Wamai
     * a generic constructor that allows the methods of the LocationsLoader class
     * to be called elsewhere in the package
     */
    public LocationsLoader(){

    }
    /**
     * a method that loops through a json file and transposes each element into an array list. 
     * 
     * @return an array list of users based off of the corresponding json file
     * 
     */
    public static ArrayList<Location> getLocations() {
        
        ArrayList<Location> locations = new ArrayList<Location>();

        try {
            FileReader reader = new FileReader(LOCATIONS_FILENAME);
            JSONParser parser = new JSONParser();
            JSONArray locationsJSON = (JSONArray)new JSONParser().parse(reader);

            for (int i = 0; i < locationsJSON.size(); i++){
                JSONObject locationJSON = (JSONObject)locationsJSON.get(i);
                String city = (String)locationJSON.get(CITY);
                String country = (String)locationJSON.get(COUNTRY);
                String continent = (String)locationJSON.get(COUNTRY);
                String airportCode = (String)locationJSON.get(AIRPORT_CODE);
                

                locations.add(new Location(city, country, continent, airportCode));
            }
            return locations;
        }
        catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }
    /**
     * a meth
     * @param firstName
     * @param lastName
     * @return
     */
    public static Location getLocation(String aLocation){ //-------BROKEN--------
        ArrayList<Location> locations = getLocations();
        String input = aLocation.toLowerCase();
        for (Location location : locations) {
            if(location.getCity().toLowerCase().contains(input) ||
            location.getCountry().toLowerCase().contains(input) || 
            location.getContinent().toLowerCase().contains(input)||
            location.getAirportCode().toLowerCase().contains(input)){
                return location;
            } 
        }
        System.out.println("location not found");
        return null;

    }
    
    
}

