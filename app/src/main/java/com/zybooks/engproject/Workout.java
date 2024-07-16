package com.zybooks.engproject;

public class Workout {

    private String name;
    private String description;

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
