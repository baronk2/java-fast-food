/*
Kevin Baron
2/26/13
Lunch Order
*/

public class LunchOrder {
	
	private int numHamburger, numSalad, numFries, numSoda;
	private final Food hamburger = new Food("hamburger", 1.85, 9, 33, 1);
	private final Food salad = new Food("salad", 2.00, 1, 11, 5);
	private final Food frenchFries = new Food("french fries", 1.30, 11, 36, 4);
	private final Food soda = new Food("soda", 0.95, 0, 38, 0);
	private final Food[] = {hamburger, salad, frenchFries, soda};
	
	public void setNumHamburger(num) {
		numHamburger = num;
	}//eo setNumHamburger
	
	public void setNumSalad(num) {
		numSalad = num;
	}//eo setNumHamburger
	
	public void setNumFries(num) {
		numFries = num;
	}//eo setNumHamburger
	
	public void setNumSoda(num) {
		numSoda = num;
	}//eo setNumHamburger
	
	
	
}//eo LunchOrder