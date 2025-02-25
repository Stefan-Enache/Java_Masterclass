package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        FootballPlayer joe = new FootballPlayer("Joe");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        SoccerPlayer beckham = new SoccerPlayer("Beckham");
//
//        Team<FootballPlayer> adelaide = new Team<>("Adelaide");
//        adelaide.addPlayer(joe);
////        adelaide.addPlayer(pat);
////        adelaide.addPlayer(beckham);
//
//        System.out.println(adelaide.numPlayer());
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Bulls");
//        baseballTeam.addPlayer(pat);
//
////        Team<String> brokenTeam = new Team<>("This won't wok");
////        brokenTeam.addPlayer(beckham);
//
//        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootballPlayer> melbourne = new Team<>("melbourne");
//
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//        hawthorn.matchResult(fremantle, 1,0);
//        hawthorn.matchResult(adelaide, 3,8);
//
//        adelaide.matchResult(fremantle,2,1);
////        adelaide.matchResult(baseballTeam, 1,1);
//
//        System.out.println("Ranking");
//        System.out.println(adelaide.getName() + ": " + adelaide.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//        System.out.println(fremantle.compareTo(adelaide));
//        System.out.println(fremantle.compareTo(melbourne));


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaide = new Team<>("Adelaide");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> melbourne = new Team<>("melbourne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.addTeam(adelaide);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);


        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaide, 3, 8);

        adelaide.matchResult(fremantle, 2, 1);

        footballLeague.showLeague();
//        adelaide.matchResult(baseballTeam, 1,1);


    }
}
