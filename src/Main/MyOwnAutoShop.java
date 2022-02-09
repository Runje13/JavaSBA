package Main;

import Model.*;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		
		Truck t1 = new Truck(120, 100.00, "Red");
		t1.setWeight(5200);
		
		Ford f1 = new Ford(112, 19000.00, "Beige");
		f1.setYear(2019);
		f1.setManufacturerDiscount(1700);
		
		Ford f2 = new Ford(180, 27205.00, "Yellow");
		f2.setYear(2022);
		f2.setManufacturerDiscount(1200);
		
		Sedan s1 = new Sedan(119, 22350.00, "Gray");
		s1.setLength(14);

		System.out.printf("T1 Price: $%.2f \n", t1.getSalePrice());
		System.out.printf("F1 Price: $%.2f \n", f1.getSalePrice());
		System.out.printf("F2 Price: $%.2f \n", f2.getSalePrice());
		System.out.printf("S1 Price: $%.2f \n", s1.getSalePrice());
	}

}
