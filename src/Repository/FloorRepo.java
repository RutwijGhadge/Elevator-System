package Repository;

import Models.Floor;

public interface FloorRepo {
    void saveFloor(Floor floor);
    Floor getFloor(int id);
}
