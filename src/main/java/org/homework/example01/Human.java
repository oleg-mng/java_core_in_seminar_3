package org.homework.example01;

public class Human {
    private final String name;
    private final int maxRun;
    private final int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    {
        name = "niname";
        maxRun = 1000;
        maxJump = 100;
    }

    public Human() {
        this("noname");
//        this.name = "noname";
//        this.maxJump = 100;
//        this.maxRun = 1000;
    }

    public Human(String name) {
        this(name, 1000);
    }

    public Human(String name, int maxRun) {
        this(name, maxRun, 100);
//        this.name = "noname";
//        this.maxRun = maxRun;
//        this.maxJump = maxJump;
    }

    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }
}
