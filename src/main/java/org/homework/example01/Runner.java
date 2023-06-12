package org.homework.example01;

public interface Runner {
    int getMaxJump();
    int getMaxRun();
    String getName();

//    boolean jump(int height);
//    boolean run(int length);

    default boolean jump(int height) {
        if(height <= getMaxJump()) {
            System.out.printf("%s перепрыгнул стену высотой: %d\n", getName(), height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть стену высотой: %d\n", getName(), height);
            return false;
        }

    }
    default boolean run(int length) {
        if(length <= getMaxRun()) {
            System.out.printf("%s пробежал дистанцию длиной: %dм\n", getName(), length);
            return true;
        }
        else {
            System.out.printf("%s не смог пробежать дистанцию: %dм, пробежал только %d м\n", getName(), length, getMaxRun());
            return false;
        }
    }
}
