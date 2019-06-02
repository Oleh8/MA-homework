package hw.three.robot;

public class Robot {

    public Direction getDirection() {
        return Direction.LEFT;
    }

    public int getX() {
        return 4;
    }

    public int getY() {
        return 2;
    }

    public void turnLeft() {
        System.out.println("turn left");
    }

    public void turnRight() {
        System.out.println("turn right");
    }

    public void stepForward() {
        System.out.println("step");
    }
}
