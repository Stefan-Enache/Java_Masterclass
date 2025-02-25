package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    ArrayList<T> league;

    public League(String name) {
        this.name = name;
        this.league = new ArrayList<>();
    }

    public boolean addTeam(T team) {
        if (league.contains(team)) {
            System.out.println("already exists");
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeague() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
