package org.travelapp.model;

import java.sql.Time;
import java.util.TimeZone;

public class Flight {
    private TimeZone timeZone;
    private Time flightArrival;
    private Time flightDeparture;
    private String cityArrival;
    private String cityDeparture;
    private int flightLength;
    private String planeType;
    private String airline;
    private int maxPassengers;


    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Time getFlightArrival() {
        return flightArrival;
    }

    public void setFlightArrival(Time flightArrival) {
        this.flightArrival = flightArrival;
    }

    public Time getFlightDeparture() {
        return flightDeparture;
    }

    public void setFlightDeparture(Time flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }

    public int getFlightLength() {
        return flightLength;
    }

    public void setFlightLength(int flightLength) {
        this.flightLength = flightLength;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
