package com.udemy.learningjavawithtimbuchalka;

public class Moon extends HeavenlyBody {
    public Moon(String name, Double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
