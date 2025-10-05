package Models;

import Models.Constants.DoorStatus;
import Models.Constants.LiftDirection;
import Models.Constants.LiftStatus;

import java.util.List;

public class Lift {
    private int id;
    private int currentFloor;
    private LiftDirection liftDirection;
    private double capacity;
    private boolean doorStatus;
    private List<Request>requestList;//Internal Request (Executed from Inside the Lift)
    private LiftStatus liftStatus;


    public LiftStatus getLiftStatus() {
        return liftStatus;
    }

    public void setLiftStatus(LiftStatus liftStatus) {
        this.liftStatus = liftStatus;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getCurrentFloor(){
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor){
        this.currentFloor=currentFloor;
    }

    public boolean openDoor(){
        return true;
    }

    public boolean closeDoor(){
        return true;
    }

    public LiftDirection moveUp(){
        return LiftDirection.UP;
    }

    public LiftDirection moveDown(){
        return LiftDirection.DOWN;
    }


}
