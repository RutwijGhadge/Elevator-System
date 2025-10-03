package Repository;

import Models.Lift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Exception.LiftNotAvailableException;

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
    public void saveOrUpdate(Lift lift) {
        liftMap.put(lift.getId(),lift);
    }

    @Override
    public void deleteLift(int id) {
        if(!liftMap.containsKey(id)){
            throw new LiftNotAvailableException("Lift with id: "+id +" Not Present.");
        }
        liftMap.remove(id);
    }
}
