package com.vaibhav.java.cricketPolymorphism;
//POLYMORPHISM
public class Icc {
    public Integer teamCount;
    public Integer venueCount;
    public String slogan;

    public Integer getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(Integer teamCount) {
        this.teamCount = teamCount;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public Integer getVenueCount() {
        return venueCount;
    }

    public void setVenueCount(Integer venueCount) {
        this.venueCount = venueCount;
    }

    public void getSlogan(){
        System.out.println("Play fairly");
    }
    public static void main(String[] args){

    }
}
