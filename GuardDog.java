package edu.monmouth.assignment1;

public class GuardDog extends Dog {
	private String furColor;
	private short meanness;


	
	
	public GuardDog(String furColor,short meanness) {
		super(furColor);
		this.furColor = furColor;
		this.meanness = meanness;
	}

	public void setMeanness(short mean) {
		meanness = mean;
	}
	
	public short getMeanness() {
		return meanness;
	}
	
	@Override
	public void move() {
		 System.out.println("The guard dog runs across the yard to chase away intruders.");
	}

	@Override
	public void makeSound() {
		System.out.println("Growl! Ruff! Ruff!");		
	}
	
	public String toString() {
		return "Guard dog - fur color: " + furColor + " Meanness: " + meanness;

	}
}
