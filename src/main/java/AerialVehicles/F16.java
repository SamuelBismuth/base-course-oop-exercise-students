package AerialVehicles;

import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends AerialVehicle implements AerialBdaVehicle, AerialAttackVehicle {
	
	private int nbOfMissiles;
	private String missileType;
	private String camera;
	
	public F16(String camera, int nbOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
		this.camera = camera;
		this.nbOfMissiles = nbOfMissiles;
		this.missileType = missileType;
	}

	@Override
	public String attack() {
		return genericAttack(missileType, nbOfMissiles);
	}

	@Override
	public String preformBda() {
		return genericPreformBda(camera);
	}
	
	public int getMaximalHours() {
		return 250;
	}
}