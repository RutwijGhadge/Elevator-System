package Service;

import Models.Constants.DirectionToGo;

public class ButtonService {
    public final RequestService requestService;

    public ButtonService(RequestService requestService){
        this.requestService=requestService;
    }

    public void pressFloorButton(int floor, DirectionToGo directionToGo){
        requestService.createPickUpRequest(floor,directionToGo);
    }

    public void pressLiftButton(int liftId ,int sourceFloor, int destinationFloor ){
        requestService.createDropOffRequest(sourceFloor,destinationFloor);
    }

}
