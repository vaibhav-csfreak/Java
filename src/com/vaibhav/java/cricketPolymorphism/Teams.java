package com.vaibhav.java.cricketPolymorphism;

public class Teams {

    public static void main(String[] args){
        Icc Mi = new Ipl();
        Mi.setSlogan("Duniya Hila Denge Hum");
        Icc Csk = new Ipl();
        Csk.setSlogan("Whistle Podu");
        Ipl Rcb = new Ipl();
        Rcb.setSlogan("Ee sala cup namde");
        Rcb.setState("Karnataka");
        Ipl Rr = new Ipl();
        Rr.setSlogan("Halla Bol");
        Rr.setState("Rajasthan");
        Rr.setName(IplTeams.RR.name());
        Mi.getSlogan();
        Csk.getSlogan();
        Rcb.getSlogan();
        System.out.println(Rcb.getState());
        System.out.println(Rr.getState());
        System.out.println(Rr.getName());
    }
}
