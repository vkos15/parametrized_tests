package com.waytohey.pages;

public enum Interests {
    FAMILY("Family"),
    YOGA("Yoga"),
    FITNESS("Fitness"),
    COOKING("Cooking");

    private String description;

    //специальный конструктор
    Interests(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
