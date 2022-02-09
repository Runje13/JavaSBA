package Model;

public class Truck extends Car{

	private int weight;
	
	public Truck() {
	}

	public Truck(int weight) {
		this.weight = weight;
	}
	
	
	public Truck(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}

	public double getSalePrice() {
		
		double finalPrice = getRegularPrice();
		
		if(weight>100) {
			finalPrice = finalPrice * 0.9;
		}
		
		else
			finalPrice = finalPrice * 0.8;
		
		return finalPrice;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	
	
	
	
	
}
