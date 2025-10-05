package Service;

import Models.Constants.LiftStatus;
import Models.Lift;
import Repository.LiftRepo;

public class LiftService {
    private final LiftRepo liftRepo;

    public LiftService(LiftRepo liftRepo) {
        this.liftRepo = liftRepo;
    }

    //Moving lift to the TargetFloor -> either UP/DOWN
    //also check if the Lift is not Under Maintenance (Before calling this Function)
    public void moveLift(int liftId, int targetFloor){
        Lift lift=liftRepo.getLiftById(liftId);
        System.out.println("Lift Found in Building");

        System.out.println("Moving Lift from :"+lift.getCurrentFloor()+" to "+targetFloor);

        lift.setLiftStatus(LiftStatus.MOVING);
        while(lift.getCurrentFloor()!=targetFloor){   /// cf:2 , tf:5
                System.out.println("Moving Lift, Currently at Floor:"+lift.getCurrentFloor());
                int currentFloor=lift.getCurrentFloor();
                lift.setCurrentFloor(currentFloor <targetFloor ? currentFloor+1 : currentFloor-1);
        }

        System.out.println("Lift has Reached at TargetFloor"+ lift.getCurrentFloor());
        lift.setLiftStatus(LiftStatus.IDLE);
        liftRepo.update(lift);
    }

    public void openDoor(int liftId){
        System.out.println("Doors of Lift with Id:"+liftId+" are Opened.");
    }

    public void closeDoor(int liftId){
        System.out.println("Doors of Lift with Id:"+liftId+" are Closed.");
    }

}
