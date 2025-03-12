package com.vaibhav.java.cricketPolymorphism;

public class Ipl extends Icc{
    public String country;
    public String state;
    public String name;
    public String slogan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

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

    public String getSlogan() {
        return slogan;
    }

    public static void main(String[] args){

    }
}
