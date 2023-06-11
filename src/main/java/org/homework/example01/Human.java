package org.homework.example01;

public class Human extends BaseHuman{
    private String name;
    private int maxRun;
    private int maxJump;

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

//    @Override
//    String displayInfo() {
//        return super.displayInfo();
//    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", maxRun=" + maxRun +
                ", maxJump=" + maxJump +
                '}';
    }
}
