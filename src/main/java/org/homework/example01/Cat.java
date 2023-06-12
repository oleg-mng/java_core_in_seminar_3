package org.homework.example01;

public class Cat extends Animal implements Runner{

    private String name;
    private int maxRun;
    private int maxJump;

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public String getName() {
        return name;
    }

}
