package edu.uqu.cs;

public class Flight {

    private String Flightnumber;
    private Country Departurecountry;
    private City Departurecity;
    private Country Arrivalcountry;
    private City ArrivalCity;
    private String Duration;
    private Date flightDate;
    private String Airline;
    private Time Departuretime;
    private Time Arrivaltime;

    public Flight() {
    }

    public Flight(String Flightnumber, Country Departurecountry, City Departurecity, Country Arrivalcountry, City ArrivalCity, String Duration, Date flightDate, String Airline, Time Departuretime, Time Arrivaltime) {
        this.Flightnumber = Flightnumber;
        this.Departurecountry = Departurecountry;
        this.Departurecity = Departurecity;
        this.Arrivalcountry = Arrivalcountry;
        this.ArrivalCity = ArrivalCity;
        this.Duration = Duration;
        this.flightDate = flightDate;
        this.Airline = Airline;
        this.Departuretime = Departuretime;
        this.Arrivaltime = Arrivaltime;
    }

    public String getFlightnumber() {
        return Flightnumber;
    }

    public void setFlightnumber(String Flightnumber) {
        this.Flightnumber = Flightnumber;
    }

    public Country getDeparturecountry() {
        return Departurecountry;
    }

    public void setDeparturecountry(Country Departurecountry) {
        this.Departurecountry = Departurecountry;
    }

    public City getDeparturecity() {
        return Departurecity;
    }

    public void setDeparturecity(City Departurecity) {
        this.Departurecity = Departurecity;
    }

    public Country getArrivalcountry() {
        return Arrivalcountry;
    }

    public void setArrivalcountry(Country Arrivalcountry) {
        this.Arrivalcountry = Arrivalcountry;
    }

    public City getArrivalCity() {
        return ArrivalCity;
    }

    public void setArrivalCity(City ArrivalCity) {
        this.ArrivalCity = ArrivalCity;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getAirline() {
        return Airline;
    }

    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

    public Time getDeparturetime() {
        return Departuretime;
    }

    public void setDeparturetime(Time Departuretime) {
        this.Departuretime = Departuretime;
    }

    public Time getArrivaltime() {
        return Arrivaltime;
    }

    public void setArrivaltime(Time Arrivaltime) {
        this.Arrivaltime = Arrivaltime;
    }

    @Override
    public String toString() {
        return "Flightnumber:" + Flightnumber + "\nFrom :" + Departurecountry + "-" +Departurecity+" To "+
                 Arrivalcountry + "-" + ArrivalCity + "\nDuration:" + Duration + "\nflightDate:" + 
                flightDate + "\nAirline:" + Airline + "\nDeparturetime:" + Departuretime + "\nArrivaltime:" +
                Arrivaltime + "\n-------------------------------";
    }
    

}
