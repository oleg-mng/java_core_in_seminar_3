package org.homework.example01;

public class Robot extends BaseRobot implements Runner{

    @Override
    public boolean jump(int height) {
        return false;
    }

    @Override
    public boolean run(int length) {
        return false;
    }
}
