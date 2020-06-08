package AerialVehicles;

import Missions.Mission;

public class Shoval extends AerialVehicle implements AerialBdaVehicle, AerialIntelligenceVehicle, AerialAttackVehicle {

	private int nbOfMissiles;
	private String missileType;
	private String camera;
	private String sensor;
	
	
	public Shoval(String camera, int nbOfMissiles, String missileType, String sensor, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
		this.sensor = sensor;
		this.camera = camera;	
		this.nbOfMissiles = nbOfMissiles;
		this.missileType = missileType;
	}

	@Override
	public String collectIntelligence() {
		return genericCollectIntelligence(sensor);
	}

	@Override
	public String preformBda() {
		return genericPreformBda(camera);
	}
	
	@Override
	public String attack() {
		return genericAttack(missileType, nbOfMissiles);
	}
	
	public int getMaximalHours() {
		return 150;
	}
	
}
