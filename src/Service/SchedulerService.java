package Service;

import Models.Constants.LiftStatus;
import Models.Lift;
import Models.Request;
import Repository.LiftRepositoryIMPL;
import java.util.List;

/*
The decision-maker — determines which elevator should serve a request.
Here we’ll use a simple nearest-elevator strategy (extendable later).
 */
public class SchedulerService {
    private final LiftRepositoryIMPL liftRepo;
    private final LiftService liftService;
    private final RequestService requestService;

    public SchedulerService(LiftRepositoryIMPL liftRepo,LiftService liftService,RequestService requestService){
        this.liftService=liftService;
        this.liftRepo=liftRepo;
        this.requestService=requestService;
    }

    //1st Preference will be given to Nearest Lift
    //Does not depends on Lift Status
    //Call completeRequest() method from requestService after this
    public Lift assignLift(Request request){
        Lift bestToPickRequest = getBestToPickRequest(request);

        if(bestToPickRequest!=null){
            System.out.println("Assigned Elevator "+ bestToPickRequest.getId());
            requestService.markInProgress(request); //marking request in Progress
            liftService.moveLift(bestToPickRequest.getId(),request.getDestinationFloor());//Moving Lift
            requestService.completeRequest(request); //complete request
            requestService.deleteRequest(request);//once completed Deleting the Request
        }else{
            System.out.println("No Available Lift at the moment to Pick Your Request, Press again");
        }
        return bestToPickRequest;
    }

    private Lift getBestToPickRequest(Request request) {
        List<Lift>lifts=liftRepo.getAllLift();
        Lift bestToPickRequest = null;
        int min_dist=Integer.MAX_VALUE;

        for(Lift lift:lifts){
            if(lift.getLiftStatus().equals(LiftStatus.MOVING) || lift.getLiftStatus().equals(LiftStatus.UNDER_MAINTENANCE))
                continue;

            int distance=Math.abs(request.getSourceFloor()-lift.getCurrentFloor());

            if(min_dist > distance){
                min_dist=distance;
                bestToPickRequest=lift;
            }
        }
        return bestToPickRequest;
    }

}
