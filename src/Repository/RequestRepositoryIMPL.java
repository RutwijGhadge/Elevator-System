package Repository;

import Models.Constants.RequestStatus;
import Models.Request;
import Exception.DuplicateRequestException;
import Exception.RequestNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RequestRepositoryIMPL implements RequestRepository {
    private final HashMap<Integer,Request>requestMap=new HashMap<>();

    @Override
    public void addRequest(Request request) {
        if(requestMap.containsKey(request.getRequestId())){
            throw new DuplicateRequestException("Request with Duplicate id :"+request.getRequestId()+" Found");
        }
        requestMap.put(request.getRequestId(), request);
    }

    @Override
    public void deleteRequestById(int id) {
        if(!requestMap.containsKey(id)){
            throw new RequestNotFoundException("Request with Id:"+id +" Not Found.");
        }
        requestMap.remove(id);
    }

    @Override
    public Request getRequestById(int id) {
        if(!requestMap.containsKey(id)){
            throw new RequestNotFoundException("Request with Id:\"+id +\" Not Found.");
        }
        return requestMap.get(id);
    }

    @Override
    public List<Request> getAllRequests() {
        return new ArrayList<>(requestMap.values());
    }

    @Override
    public List<Request>getAllPendingRequests(){
        List<Request>requestList=getAllRequests();
        List<Request>pendingRequests=new ArrayList<>();
        for(Request request:requestList){
            if(request.getRequestStatus().equals(RequestStatus.PENDING)){
                pendingRequests.add(request);
            }
        }
        return pendingRequests;
    }

    @Override
    public void updateRequest(Request request) {
        if(!requestMap.containsKey(request.getRequestId())){
            throw new RequestNotFoundException("Request with id :"+request.getRequestId()+" Not Found");
        }
        requestMap.put(request.getRequestId(), request);
    }
}
