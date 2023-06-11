package org.homework.example01;

public abstract class BaseHuman {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BaseHuman() {
        name = "noname";
    }

    public BaseHuman(String name) {
        this.name = name;
    }
    abstract String displayInfo();
//        return String.format("Name: %s", name);
}
