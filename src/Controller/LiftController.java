package Controller;

import DTOs.LiftDTO;
import Models.Lift;
import Repository.LiftRepositoryIMPL;
import Service.LiftService;

import java.util.List;

//Controller Layer will be using RequestDTOs to pass data further
//Convert the Output from Downstream Layers to ResponseDTOs and Send it to User

public class LiftController {
    private final LiftService liftService;
    private final LiftRepositoryIMPL liftRepositoryIMPL;

    public LiftController(LiftService liftService, LiftRepositoryIMPL liftRepositoryIMPL) {
        this.liftService = liftService;
        this.liftRepositoryIMPL = liftRepositoryIMPL;
    }

    public LiftDTO getLiftById(LiftDTO liftDTO){
        Lift lift=liftRepositoryIMPL.getLiftById(liftDTO.getId());
        return getLiftDTOFromLift(lift);
    }

    public List<LiftDTO> getAllLifts(){
        return liftRepositoryIMPL.getAllLift().stream().map(this::getLiftDTOFromLift).toList();
    }

    public LiftDTO moveElevator(LiftDTO liftDTO){
        liftService.moveLift(liftDTO.getId(),liftDTO.getTargetFloor());
        //LiftRepo will be Updated
        return getLiftDTOFromLift(liftRepositoryIMPL.getLiftById(liftDTO.getId()));
        //liftRepositoryIMPL.getLiftById(liftDTO.getId() -> returns Lift
    }

    public LiftDTO getLiftDTOFromLift(Lift lift){
        LiftDTO liftDTO=new LiftDTO();
        liftDTO.setId(lift.getId());
        liftDTO.setLiftStatus(lift.getLiftStatus());
        liftDTO.setTargetFloor(lift.getCurrentFloor());
        return liftDTO;
    }
}
