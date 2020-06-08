package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import Missions.Mission;


public abstract class Haron extends AerialVehicle {
			
	final static int MAXIMAL_NUMBER_HOURS = 150;
	
	public Haron(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
	}

	public int getMaximalHours() {
		return MAXIMAL_NUMBER_HOURS;
	}
}

