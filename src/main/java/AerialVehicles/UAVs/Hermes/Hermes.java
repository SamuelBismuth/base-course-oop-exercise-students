package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class Hermes extends AerialVehicle {

	
final static int MAXIMAL_NUMBER_HOURS = 100;
	
	public Hermes(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
	}

	public int getMaximalHours() {
		return MAXIMAL_NUMBER_HOURS;
	}
	
}
