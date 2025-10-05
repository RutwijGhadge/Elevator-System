package DTOs;

import Models.Constants.LiftStatus;

public class LiftDTO {
    private int id;
    private int targetFloor;
    private LiftStatus liftStatus;

    public LiftDTO() {
    }

    public LiftDTO(int id, int targetFloor, LiftStatus liftStatus) {
        this.id = id;
        this.targetFloor = targetFloor;
        this.liftStatus = liftStatus;
    }

    @Override
    public String toString() {
        return "LiftDTO{" +
                "id=" + id +
                ", targetFloor=" + targetFloor +
                ", liftStatus=" + liftStatus +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void setTargetFloor(int targetFloor) {
        this.targetFloor = targetFloor;
    }

    public LiftStatus getLiftStatus() {
        return liftStatus;
    }

    public void setLiftStatus(LiftStatus liftStatus) {
        this.liftStatus = liftStatus;
    }
}
