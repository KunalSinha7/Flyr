package com.example.kunal.flyr;

public class Flyr {

    public String eventName, date, time, location;

    public Flyr(String eventName, String date, String time, String location) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
        this.location = location;
    }


    //Accessors
    public String getEventName() {
        return eventName;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getLocation() {
        return location;
    }

    //Mutators
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}