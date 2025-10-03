package Models;

import Models.Constants.DirectionToGo;

import java.util.List;

public class Floor {
     private int floorNumber;
     boolean upButtonPressed;
     boolean downButtonPressed;
    //user wants to go to direction UP/DOWN


    public int getCurrentFloor() {
        return floorNumber;
    }

    public void setCurrentFloor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void upButtonPressed() {
        upButtonPressed=true;
    }

    public void DownButtonPressed(){
        downButtonPressed=true;
    }
}
