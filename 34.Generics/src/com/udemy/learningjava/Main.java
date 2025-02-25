package com.udemy.learningjava;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaide = new Team("Adelaide");
        adelaide.addPlayer(joe);
        adelaide.addPlayer(pat);
        adelaide.addPlayer(beckham);

        System.out.println(adelaide.numPlayer());

    }
}
