package Model;

public class Sedan extends Car{
	
	private int length;
	
	public Sedan() {
		super();
	}

	public Sedan(int length) {
		super();
		this.length = length;
	}
	public Sedan(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getSalePrice() {
		double finalPrice = getRegularPrice();
		
			if(length > 20) {
				finalPrice = finalPrice * 0.95;
			}
			
			else
				finalPrice = finalPrice * 0.9;
		
		return finalPrice;
	}

}
