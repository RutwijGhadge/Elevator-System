package Models;

import Models.Constants.LiftDirection;

public class Display {
    private int currentLiftFloor;
    private LiftDirection direction; //Current Direction of Lift

    public int getCurrentLiftFloor() {
        return currentLiftFloor;
    }

    public void setCurrentLiftFloor(int currentLiftFloor) {
        this.currentLiftFloor = currentLiftFloor;
    }

    public LiftDirection getDirection() {
        return direction;
    }

    public void setDirection(LiftDirection direction) {
        this.direction = direction;
    }
}
