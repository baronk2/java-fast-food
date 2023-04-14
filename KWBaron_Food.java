/*
Kevin Baron
2/26/13
Food
*/

public class KWBaron_Food {
	
	//fields
	private double price, fat, carbs, fiber;
	private String name;
	
	//constructor
	//pre: none
	//post: a Food object is created with all its fields filled.
	public Food(String name, double price, double fat, double carbs, double fiber) {
		this.name = name;
		this.price = price;
		this.fat = fat;
		this.carbs = carbs;
		this.fiber = fiber;
	}//eo Food
	
	//pre: none
	//post: fat has been returned.
	public double getFat() {
		return fat;
	}//eo getFat
	
	//pre: none
	//post: price has been returned.
	public double getPrice() {
		return price;
	}//eo getPrice
	
	//pre: none
	//post: carbs has been returned.
	public double getCarbs() {
		return carbs;
	}//eo getCarbs
	
	//pre: none
	//post: fiber has been returned.
	public double getFiber() {
		return fiber;
	}//eo getFiber
	
	//pre: none
	//post: name has been returned.
	public String getName() {
		return name;
	}//eo getName
	
	//pre: none
	//post: stats of the Food object have been returned as a String
	public String toString() {
		return "Each " + name + " order has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber.";
	}//eo toString
	
}//eo Food