package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Collections;

public class League2<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League2(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            System.out.println("Already exists");
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + t.ranking());
        }
    }


}
