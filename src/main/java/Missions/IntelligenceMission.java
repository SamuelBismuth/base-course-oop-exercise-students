package Missions;

import Entities.Coordinates;


public class IntelligenceMission extends Mission {

	private String region;
	
	public IntelligenceMission(String region, Coordinates coordinates) {
		super(coordinates);
		this.region = region;
	}
	
	public String getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return " Collecting Data in " + this.getRegion();
	}
	
}
