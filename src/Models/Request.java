package Models;

import Models.Constants.DirectionToGo;
import Models.Constants.RequestType;

public class Request {
    private int requestId;
    private int sourceFloor;
    private int destinationFloor;
    private RequestType requestType;
    private DirectionToGo directionToGo;

    public Request(int destinationFloor, RequestType requestType) {
        this.destinationFloor=destinationFloor;
        this.requestType=requestType;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getSourceFloor() {
        return sourceFloor;
    }

    public void setSourceFloor(int sourceFloor) {
        this.sourceFloor = sourceFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public DirectionToGo getDirectionToGo() {
        return directionToGo;
    }

    public void setDirectionToGo(DirectionToGo directionToGo) {
        this.directionToGo = directionToGo;
    }

    public boolean isPeekUpRequest(){
        return RequestType.PICKUP.equals(getRequestType());
    }

    public boolean isDropOffRequest(){
        return RequestType.DROPOFF.equals(getRequestType());
    }
}
