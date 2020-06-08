package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission {

	private String target;
	
	public AttackMission(String target, Coordinates coordinates) {
		super(coordinates);
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	@Override
	public String toString() {
		return " Attacking " + this.getTarget();
	}
}
