package edu.uqu.cs;

public class Time {
        private int hour;
    private int min;

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public Time() {
    }

    public int gethour() {
        return hour;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int getmin() {
        return min;
    }

    public void setmin(int min) {
        this.min = min;
    }

    
    @Override
    public String toString() {
        return  hour + ":" + min  ;
    }
}
