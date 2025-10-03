package Models;

import Models.Constants.RequestType;

class LiftButton extends Button{
    private int floorNumber;
    private int elevatorId;

    public LiftButton(int id, boolean pressed, String label) {
        super(id, label);
    }

    @Override
    public void press() {
        //When the Button is Pressed Request is Created.
        this.pressed=true;
        Request request=new Request(floorNumber, RequestType.PICKUP);


    }

}
