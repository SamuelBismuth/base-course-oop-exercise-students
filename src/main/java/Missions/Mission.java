package Missions;

import Entities.Coordinates;


public abstract class Mission implements MissionService {

    private Coordinates coordinates;
    
    public abstract String toString();
    
    public Mission(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    
    public void begin() {
        System.out.println("Beginning Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }

	public Coordinates getCoordinates() {
		return coordinates;
	}

}
