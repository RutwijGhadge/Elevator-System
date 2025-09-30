package Models;

import java.util.List;

public class Floor {
    private int currentFloor;
    private List<Display> display;
    private DirectionToGo directionToGO;
    //user wants to go to direction UP/DOWN


    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public List<Display> getDisplay() {
        return display;
    }

    public void setDisplay(List<Display> display) {
        this.display = display;
    }

    public DirectionToGo getDirectionToGO() {
        return directionToGO;
    }

    public void setDirectionToGO(DirectionToGo directionToGO) {
        this.directionToGO = directionToGO;
    }
}
