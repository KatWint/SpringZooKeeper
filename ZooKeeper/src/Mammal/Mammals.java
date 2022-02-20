package Mammal;

public class Mammals {
	protected int energyLevel=100;
	
	public Mammals(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("Present Energy " + energyLevel);
		return energyLevel;
	}
}
