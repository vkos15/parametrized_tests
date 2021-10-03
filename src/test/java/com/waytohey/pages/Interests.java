package com.waytohey.pages;

public enum Interests {
    FAMILY("Family"),
    YOGA("Yoga"),
    FITNESS("Fitness"),
    RUNNING("Running");

    private String description;

    //специальный конструктор
    Interests(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
