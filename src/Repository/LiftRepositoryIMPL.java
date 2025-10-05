package Repository;

import Models.Constants.LiftStatus;
import Models.Lift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Exception.LiftNotAvailableException;
import Exception.LiftNotFoundException;

public class LiftRepositoryIMPL implements LiftRepo {
    private final Map<Integer,Lift>liftMap = new HashMap<>();

    @Override
    public Lift getLiftById(int id) throws LiftNotAvailableException {
        if(!liftMap.containsKey(id)){
            throw new LiftNotAvailableException("Elevator with id: "+ id+" Not Present.");
        }
        return liftMap.get(id);
    }

    @Override
    public List<Lift> getAllLift() {
        return new ArrayList<>(liftMap.values());
    }

    @Override
    public List<Lift>getAllMovingLifts(){
        List<Lift>lifts=getAllLift();
        List<Lift>movingLifts=new ArrayList<>();
        for(Lift lift:lifts){
            if(lift.getLiftStatus().equals(LiftStatus.MOVING))
                movingLifts.add(lift);
        }
        return movingLifts;
    }

    @Override
    public void save(Lift lift) {
        liftMap.put(lift.getId(),lift);
    }

    @Override
    public void deleteLift(int id) {
        if(!liftMap.containsKey(id)){
            throw new LiftNotAvailableException("Lift with id: "+id +" Not Present.");
        }
        liftMap.remove(id);
    }

    @Override
    public void update(Lift lift) {
        if(!liftMap.containsKey(lift.getId())){
            throw new LiftNotFoundException("Lift with Id: "+lift.getId()+" Not Found");
        }
        liftMap.put(lift.getId(),lift);
    }
}
