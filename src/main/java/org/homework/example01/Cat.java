package org.homework.example01;

public class Cat extends Animal implements Runner{
    @Override
    public boolean jump(int height) {
        return false;
    }

    @Override
    public boolean run(int length) {
        return false;
    }
}
