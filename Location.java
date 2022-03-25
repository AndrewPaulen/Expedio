public class Location {
    private String city;
    private String country;
    private String continent;
    private String airportCode;


    public Location(String city, String country, String continent, String airportCode){
        this.airportCode = airportCode;
        this.continent = continent;
        this.country = country;
        this.city = city;
    }

    public String getAirportCode(){
        return this.airportCode;
    }

    public void setAirportCode(String code){
        code = this.airportCode;
    }

    public String getContinent(){
        return this.continent;
    }

    public void setContinent(String aContinent){
        aContinent = this.continent;
    }

    public String getCountry(){
        return this.country;
    }

    public void setCountry(String aCountry){
        aCountry = this.country;
    }

    public String getCity(){
        return this.city;
    }

    public String toString(){
        return this.city+", "+this.country;
    }









}
