package com.vaibhav.java.votingMultithreading;

public class Voting {
    public static void main(String [] args) {
        AapVote aap = new AapVote();
        BjpVote bjp = new BjpVote();
        Thread t1 = new Thread(bjp);
        CongressVote congress = new CongressVote();
        Thread t2 = new Thread(congress);
        SamajwadiParty samajwadiParty = new SamajwadiParty();
        Thread t3 = new Thread(samajwadiParty);
//        aap.setDaemon(true); //converting threads to daemon threads, which will end them when the code ends
//        t1.setDaemon(true);
//        t2.setDaemon(true);
//        t3.setDaemon(true);
        aap.start();
        t1.start();
        t2.start();
        t3.start();
    }
}
