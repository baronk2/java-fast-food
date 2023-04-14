/*
Kevin Baron
2/26/13
Lunch Order Client
*/

import java.util.Scanner;
import java.io.PrintStream;

public class KWBaron_LunchOrder_Client {
	
	//constructs the menu by use of class constant Food objects
	public static final Food hamburger = new Food("hamburger", 1.85, 9, 33, 1);
	public static final Food salad = new Food("salad", 2.00, 1, 11, 5);
	public static final Food frenchFries = new Food("french fries", 1.30, 11, 36, 4);
	public static final Food soda = new Food("soda", 0.95, 0, 38, 0);
	public static final Food hotDog = new Food("hot dog", 1.50, 5, 40, 3);
	public static final Food milkShake = new Food("milk shake", 1.00, 15, 27, 2);	
	//keeps track of the menu items, numbered 1-6.
	public static final Food[] menu = {null, hamburger, salad, frenchFries, soda, hotDog, milkShake};
	
	public static void main(String[] args) {
		int[] itemsOrdered = new int[7];//to keep track of how many hamburgers, salads, etc. have been ordered
		Scanner keyboard = new Scanner(System.in);
		PrintStream o = new PrintStream(System.out);//to not have to type System.out all the time
		displayMenu();
		boolean orderMore= true;//so that an order is asked for at least once.
		double total = 0;//$ cost of everything ordered
		while (orderMore) {
			o.print("Please enter the number of the item you would like to order.\nEnter 0 if you are finished. ");
			switch (keyboard.nextInt()) {
				case 0://stop aking for more orders and exit the while loop
					orderMore = false;
					o.println();
					break;
				case 1://display nutrition facts about the Food object and add to (a) hamburger(s) to the itemsOrdered array.
					o.print("\n" + hamburger.toString() + "\nHow many hamburgers would you like to order? ");
					itemsOrdered[1] += keyboard.nextInt();
					o.println();
					break;
				case 2:
					o.print("\n" + salad.toString() + "\nHow many salads would you like to order? ");
					itemsOrdered[2] += keyboard.nextInt();
					o.println();
					break;
				case 3:
					o.print("\n" + frenchFries.toString() + "\nHow many french fries would you like to order? ");
					itemsOrdered[3] += keyboard.nextInt();
					o.println();
					break;
				case 4:
					o.print("\n" + soda.toString() + "\nHow many sodas would you like to order? ");
					itemsOrdered[4] += keyboard.nextInt();
					o.println();
					break;
				case 5:
					o.print("\n" + hotDog.toString() + "\nHow many hot dogs would you like to order? ");
					itemsOrdered[5] += keyboard.nextInt();
					o.println();
					break;
				case 6:
					o.print("\n" + milkShake.toString() + "\nHow many milk shakes would you like to order? ");
					itemsOrdered[6] += keyboard.nextInt();
					o.println();
					break;
				default://go to the top of the loop in the case of invalid menu number.
					o.println("That number is not on the menu. Please try again.\n");
					break;
			}//eo switch
			total = 0;//reset the total to zero and recalculate each time based on the changes made in itemsOrdered
			for (int i = 1; i <= 6; i++) {
				total += itemsOrdered[i] * menu[i].getPrice();
			}//eo for
			o.printf("Your total comes to $%.2f\n", total);
		}//eo while
	}//eo main
	
	//pre: none
	//post: all menu items have been displayed neatly.
	public static void displayMenu() {
		for (int i = 1; i <= 6; i++) {
			System.out.print(i + ". ");
			System.out.printf("%-15s", menu[i].getName());
			System.out.printf("$%.2f\n", menu[i].getPrice());
		}//eo for
		System.out.println();
	}//eo displayMenu
	
}//eo LunchOrderClient