/**
 * The location of an airport
 * 
 * @author
 */
public class Location {
    private String city;
    private String country;
    private String continent;
    private String airportCode;

    /**
     * An instance of a location
     * 
     * @param city        The city where the airport is location
     * @param country     The country where the airport is location
     * @param continent   The continent where the airport is location
     * @param airportCode The airport's code
     */
    public Location(String city, String country, String continent, String airportCode) {
        this.airportCode = airportCode;
        this.continent = continent;
        this.country = country;
        this.city = city;
    }

    /**
     * Gets the airport's code
     * 
     * @return this.airportCode The airport's code
     */
    public String getAirportCode() {
        return this.airportCode;
    }

    /**
     * Sets the airport's code
     * 
     * @param code The airport's code
     */
    public void setAirportCode(String code) {
        code = this.airportCode;
    }

    /**
     * Gets the continent where the airport is located
     * 
     * @return this.continenet The continent where the airport is located
     */
    public String getContinent() {
        return this.continent;
    }

    /**
     * Sets the continent where the airport is location
     * 
     * @param aContinent The continent where the airport is located
     */
    public void setContinent(String aContinent) {
        aContinent = this.continent;
    }

    /**
     * Gets the country where the airport is located
     * 
     * @return this.country The continent where the airport is located
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets the country where the airport is located
     * 
     * @param aCountry The country where the airport is located
     */
    public void setCountry(String aCountry) {
        aCountry = this.country;
    }

    /**
     * Gets the city where the airport is located
     * 
     * @return this.city The city where the airport is located
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Converts location (city and country) to a string
     */
    public String toString() {
        return this.city + ", " + this.country;
    }

}
