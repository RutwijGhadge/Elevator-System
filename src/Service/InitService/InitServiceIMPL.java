package Service.InitService;

import Models.Building;
import Models.Floor;
import Models.Lift;

public class InitServiceIMPL implements initService{
    @Override
    public void init() {
        Building building=new Building();
        building.setAddress(" Vidyadham Society , Alephata (Pune-Nashik Road)");
        building.setName("MangalMurti Building");

        Floor floor=new Floor();
        floor.setCurrentFloor(1);


        Lift lift=new Lift();
        lift.setId(1);
    }
}
