package org.homework.example01;

public class Human extends BaseHuman implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;


    {
        System.out.println("Initializer");
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

        System.out.println("Constructor");
        if (name == null || name.length() < 3) this.name = "noname";
        else this.name = name;
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    String displayInfo() {
        return String.format("Name %s", name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }
}
