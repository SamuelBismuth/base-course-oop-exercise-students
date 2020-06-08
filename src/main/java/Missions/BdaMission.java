package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission {

    private String objective;

    public BdaMission(String objective, Coordinates coordinates) {
    	super(coordinates);
    	this.objective = objective;
    }
    
}
