package DTOs;

import Models.Constants.DirectionToGo;
import Models.Constants.RequestStatus;
import Models.Constants.RequestType;

public class RequestDTO {
    private int requestId;
    private int sourceFloor;
    private int destinationFloor;
    private RequestType requestType;
    private RequestStatus requestStatus;

    public RequestDTO(int requestId, int sourceFloor, int destinationFloor, RequestType requestType, RequestStatus requestStatus) {
        this.requestId = requestId;
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
        this.requestType = requestType;
        this.requestStatus = requestStatus;
    }

    @Override
    public String toString() {
        return "RequestDTO{" +
                "requestId=" + requestId +
                ", sourceFloor=" + sourceFloor +
                ", destinationFloor=" + destinationFloor +
                ", requestType=" + requestType +
                ", requestStatus=" + requestStatus +
                '}';
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

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}
