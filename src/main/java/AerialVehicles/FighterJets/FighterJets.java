package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class FighterJets extends AerialVehicle {
	
	final static int MAXIMAL_NUMBER_HOURS = 250;
	
	public FighterJets(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
	}

	public int getMaximalHours() {
		return MAXIMAL_NUMBER_HOURS;
	}
	
}
