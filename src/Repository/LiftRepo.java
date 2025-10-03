package Repository;

import Models.Lift;
import Exception.LiftNotAvailableException;
import java.util.List;

public interface LiftRepo {
    Lift getLiftById(int id) throws LiftNotAvailableException;
    List<Lift> getAllLift();
    void saveOrUpdate(Lift lift);
    void deleteLift(int id);
}
