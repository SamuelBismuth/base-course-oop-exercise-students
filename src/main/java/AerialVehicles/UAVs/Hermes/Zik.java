package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;


public class Zik extends Hermes implements AerialBdaVehicle, AerialIntelligenceVehicle {

	private String camera;
	private String sensor;
	
	public Zik(String camera, String sensor, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean flyStatus) {
		super(pilotName, mission, hoursOfFlightSinceLastRepair, flyStatus);
		this.sensor = sensor;
		this.camera = camera;	
	}

	@Override
	public String collectIntelligence() {
		return genericCollectIntelligence(sensor);
	}

	@Override
	public String preformBda() {
		return genericPreformBda(camera);
	}
	
}
