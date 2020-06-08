package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;


public class Eitan extends Haron implements AerialAttackVehicle, AerialIntelligenceVehicle {

	private int nbOfMissiles;
	private String missileType;
	private String sensor;
	
	public Eitan(int nbOfMissiles, String missileType, String sensor, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
		this.nbOfMissiles = nbOfMissiles;
		this.missileType = missileType;
		this.sensor = sensor;
	}

	@Override
	public String collectIntelligence() {
		return genericCollectIntelligence(sensor);
	}

	@Override
	public String attack() {
		return genericAttack(missileType, nbOfMissiles);
	}
	
}
