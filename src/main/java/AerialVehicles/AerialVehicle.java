package AerialVehicles;

import Missions.Mission;
import Missions.MissionTypeException;

public abstract class AerialVehicle implements AerialVehicleService {
	
	private String pilotName;
	private Mission mission;
	private int hoursOfFlightSinceLastRepair;
	private boolean flyStatus;
	
	public AerialVehicle(String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		this.pilotName = pilotName;
		this.mission = mission;
		this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
		this.flyStatus = flyStatus;
	}
	
	public abstract int getMaximalHours();	

	public void flyTo() {
		System.out.println("Flying to: " + mission.getCoordinates().toString());
	}
	
	public void land() {
		System.out.println("Landing");
	}
	
	public void check() {
		if (this.getHoursOfFlightSinceLastRepair() > this.getMaximalHours()) {
			this.repair();
		}
	}

	public void repair() {
		this.setFlyStatus(true);
		this.setHoursOfFlightSinceLastRepair(0);
	}
	
	public int getHoursOfFlightSinceLastRepair() {
		return hoursOfFlightSinceLastRepair;
	}

	public void setFlyStatus(boolean flyStatus) {
		this.flyStatus = flyStatus;
	}
	
	public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
		this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
	}
	
	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public String getPilotName() {
		return pilotName;
	}

	public Mission getMission() {
		return mission;
	}

	public String getLog() {
		return this.getPilotName() + ": " + this.getClass().getSimpleName() + this.getMission().toString();
	}
	
	public String genericCollectIntelligence(String sensor) {
		return this.getLog() + " with sensor type: " + sensor;
	}
	
	public String genericAttack(String missileType, int nbOfMissiles) {
		return this.getLog() + " with: " + missileType + "X" + nbOfMissiles;
	}
	
	public String genericPreformBda(String camera) {
		return this.getLog() + " with: " + camera + " camera";
	}
}
