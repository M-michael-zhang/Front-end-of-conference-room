package com.arcsoft.room;

public class Meet {
    String meetTime;
    String meetName;

    public Meet() {
    }

    public Meet(String meetTime, String meetName) {
        this.meetTime = meetTime;
        this.meetName = meetName;
    }

    public String getMeetTime() {
        return meetTime;
    }

    public void setMeetTime(String meetTime) {
        this.meetTime = meetTime;
    }

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName;
    }

    @Override
    public String toString() {
        return "Meet{" +
                "meetTime='" + meetTime + '\'' +
                ", meetName='" + meetName + '\'' +
                '}';
    }
}
