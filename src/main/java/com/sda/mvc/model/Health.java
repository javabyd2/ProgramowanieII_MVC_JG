package com.sda.mvc.model;

public enum Health {

    HEALTHY("healtjy"), NOTHEALTHY("nothealthly"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
