package Models;

import Models.Constants.RequestType;

public class FloorButton extends Button{
    private int destinationFloor;
    private int elevatorId;

    public FloorButton(int id, boolean pressed, String label) {
        super(id , label);
    }

    @Override
    public void press() {
        //when the Button is Pressed Request Gets Created
        this.pressed=true;
        Request request=new Request(destinationFloor, RequestType.DROPOFF);

    }

}
