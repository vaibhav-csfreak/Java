package com.vaibhav.java.cricketPolymorphism;

import java.util.ArrayList;

public class Teams {

    public static void main(String[] args){
        ArrayList<Ipl> iplTeams=new ArrayList<>();
        ArrayList<Icc> internationalTeams = new ArrayList<>();
        Icc India = new Icc();
        India.setTeamCount(3);
        India.setVenueCount(10);
        Icc Australia = new Ipl();
        Australia.setTeamCount(2);
        Australia.setVenueCount(5);
        internationalTeams.add(India);
        internationalTeams.add(Australia);
        Ipl Mi = new Ipl();
        Mi.setSlogan("Duniya Hila Denge Hum");
        Mi.setName(IplTeams.MI.name());
        Mi.setState("Maharashtra");
        Ipl Csk = new Ipl();
        Csk.setSlogan("Whistle Podu");
        Csk.setName(IplTeams.CSK.name());
        Csk.setState("Tamilnadu");
        Ipl Rcb = new Ipl();
        Rcb.setSlogan("Ee sala cup namde");
        Rcb.setState("Karnataka");
        Rcb.setName(IplTeams.RCB.name());
        Ipl Rr = new Ipl();
        Rr.setSlogan("Halla Bol");
        Rr.setState("Rajasthan");
        Rr.setName(IplTeams.RR.name());
        iplTeams.add(Rcb);
        iplTeams.add(Rr);
        iplTeams.add(Mi);
        iplTeams.add(Csk);
        for(int i=0;i<iplTeams.size();i++){
            System.out.println(iplTeams.get(i).getName());
            System.out.println(iplTeams.get(i).getState());
            System.out.println(iplTeams.get(i).getSlogan());
        }
        for(int i=0;i<internationalTeams.size();i++){
            System.out.println(internationalTeams.get(i).getTeamCount());
            System.out.println(internationalTeams.get(i).getVenueCount());
        }
    }
}
