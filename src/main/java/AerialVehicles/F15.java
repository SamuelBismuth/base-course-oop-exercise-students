package AerialVehicles;

import Missions.Mission;


public class F15 extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {

	private int nbOfMissiles;
	private String missileType;
	private String sensor;
	
	public F15(String sensor, int nbOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
		this.sensor = sensor;
		this.nbOfMissiles = nbOfMissiles;
		this.missileType = missileType;
	}

	@Override
	public String collectIntelligence() {
		return genericCollectIntelligence(sensor);
	}

	@Override
	public String attack() {
		return genericAttack(missileType, nbOfMissiles);
	}
	
	public int getMaximalHours() {
		return 250;
	}
	
}
