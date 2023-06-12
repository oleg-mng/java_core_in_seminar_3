package org.homework;

import org.homework.example01.*;

public class Program {
    public static void main(String[] args) {
        Human human = new Human("Oleg", 5000, 1);
        System.out.println(human);
        BaseHuman human1 = new Human("Oleg", 5000, 1);
        System.out.println(human1);
        Runner human2 = new Human("Oleg", 5000, 1);
        System.out.println(human2);

        Runner[] runners = {
                new Cat("Cat1", 999, 20),
                new Cat("Cat2", 2000, 300),
                new Robot("rrr", 200, 10),
                new Robot("sgRt", 4000, 0),
                new Human("Denis", 500, 90),
                new Human("Yury", 4000, 500),
        };
        Obstacle[] obstacles = {
                new Wall(1500),
                new Track(1500),
                new Wall(500),
                new Track(700),
        };
        for (Runner runner : runners) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    runner.run(obstacle.getLength());
                    break;
                }
                if (obstacle instanceof Wall) {
                    runner.jump(obstacle.getHeight());
                    break;
                }

            }
        }
    }
}