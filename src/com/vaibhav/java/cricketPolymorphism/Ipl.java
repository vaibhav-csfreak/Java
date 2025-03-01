package com.vaibhav.java.cricketPolymorphism;

public class Ipl extends Icc{
    public String country;
    public String state;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void getSlogan() {
        System.out.println("Its best vs best");
    }

    public static void main(String[] args){

    }
}
