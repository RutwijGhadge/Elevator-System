package Models;

import java.util.List;

public class Building {
    private String name;
    private String address;
    private List<Floor> floorList;
    private List<Lift>liftList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Lift> getLiftList() {
        return liftList;
    }

    public void setLiftList(List<Lift> liftList) {
        this.liftList = liftList;
    }
}
