package Models;

import java.awt.*;
import java.util.List;

public class Lift {
    private int id;
    private Display display;
    private int currentWeightInLift;
    private Boolean fanSwitch;
    private Boolean lightSwitch;
    private Boolean alarmSwitch;
    private List<Button> buttonList;
    private DoorStatus doorStatus;
    private LiftStatus liftStatus;

    public LiftStatus getLiftStatus() {
        return liftStatus;
    }

    public void setLiftStatus(LiftStatus liftStatus) {
        this.liftStatus = liftStatus;
    }

    public Boolean getLightSwitch() {
        return lightSwitch;
    }

    public void setLightSwitch(Boolean lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    public int getCurrentWeightInLift() {
        return currentWeightInLift;
    }

    public void setCurrentWeightInLift(int currentWeightInLift) {
        this.currentWeightInLift = currentWeightInLift;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getFanSwitch() {
        return fanSwitch;
    }

    public void setFanSwitch(Boolean fanSwitch) {
        this.fanSwitch = fanSwitch;
    }

    public Boolean getAlarmSwitch() {
        return alarmSwitch;
    }

    public void setAlarmSwitch(Boolean alarmSwitch) {
        this.alarmSwitch = alarmSwitch;
    }

    public List<Button> getButtonList() {
        return buttonList;
    }

    public void setButtonList(List<Button> buttonList) {
        this.buttonList = buttonList;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(DoorStatus doorStatus) {
        this.doorStatus = doorStatus;
    }
}
