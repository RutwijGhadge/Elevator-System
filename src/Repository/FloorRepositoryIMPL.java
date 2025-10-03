package Repository;

import Models.Floor;
import Exception.FloorNotAvailable;
import java.util.HashMap;

public class FloorRepositoryIMPL {
    private final HashMap<Integer, Floor>floorHashMap=new HashMap<>();

    public void saveFloor(Floor floor){
        floorHashMap.put(floor.getCurrentFloor(),floor);
    }

    public Floor getFloor(int id) throws FloorNotAvailable {
        if(!floorHashMap.containsKey(id))
            throw new FloorNotAvailable("Floor with id:"+ id +" Not Present");

        return floorHashMap.get(id);
    }
}
