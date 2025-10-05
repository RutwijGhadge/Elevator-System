package Service;

import Models.Constants.DirectionToGo;
import Models.Constants.RequestStatus;
import Models.Constants.RequestType;
import Models.Request;
import Repository.RequestRepository;

import java.util.List;

public class RequestService {
    private final RequestRepository requestRepository;
    private static int cnt=0;
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public static int getRequestId(){
        ++cnt;
        return cnt;
    }

    public void createPickUpRequest(int sourceFloor, DirectionToGo directionToGo){
        //Destination will be Updated from Inside the Elevator
        Request request=new Request(getRequestId(),sourceFloor,-1, RequestType.PICKUP, DirectionToGo.UP, RequestStatus.PENDING);
        requestRepository.addRequest(request);
        System.out.println("Request with Id:"+request.getRequestId()+" has been Created.");
    }

    public void createDropOffRequest(int sourceFloor,int destinationFloor){
        Request request=new Request(getRequestId(),sourceFloor,destinationFloor, RequestType.DROPOFF, DirectionToGo.DOWN,RequestStatus.PENDING);
        requestRepository.addRequest(request);
        System.out.println("Request with Id:"+request.getRequestId()+" has been Created.");
    }

    public List<Request> getPendingRequests(){
        return requestRepository.getAllPendingRequests();
    }

    //Assign life then call complete Request
    public void completeRequest(Request request){
        request.setRequestStatus(RequestStatus.COMPLETED);
        requestRepository.updateRequest(request);
        System.out.println("Request with RequestId:"+request.getRequestId() +" has been completed.");
    }

    public void markInProgress(Request request){
        request.setRequestStatus(RequestStatus.INPROGRESS);
        requestRepository.updateRequest(request);
        System.out.println("Request with RequestId "+request.getRequestId() +" is in Progress.");
    }

    public void deleteRequest(Request request){
        if(request.getRequestStatus().equals(RequestStatus.COMPLETED)){
            requestRepository.deleteRequestById(request.getRequestId());
            System.out.println("Request with RequestId" + request.getRequestId() + "has been deleted.");
        }
    }

}
