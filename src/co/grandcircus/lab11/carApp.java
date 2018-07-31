package co.grandcircus.lab11;

import java.util.ArrayList;
import java.util.Scanner;

//import java.util.ArrayList;

public class carApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Car("Honda", "Accord", 2018, 25859.91));
		list.add(new Car("Toyota", "Camery", 2018, 24568.81));
		list.add(new Car("Nissan", "Maxima", 2018, 30499.99));
		list.add(new UsedCar("Ford", "Focus", 2004, 1800, 140000));
		list.add(new UsedCar("Chevy", "Impala", 1996, 2000, 134282));
		list.add(new UsedCar("Jeep", "Wrangler", 2010, 5000, 110500));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}

		System.out.println("Welcome to the program.");
		printList(list);

		while (true) {
			System.out.print("What can I do for you? (list, add, remove, edit, quit) ");
			String userChoice = scnr.nextLine().trim();

			if ("quit".equalsIgnoreCase(userChoice)) {
				break;

			} else if ("list".equalsIgnoreCase(userChoice)) {
				System.out.println(list);;

			} else if ("add".equalsIgnoreCase(userChoice)) {
				list = doAdd(scnr, list);
				System.out.println(list);

				printList(list);
			} else if ("remove".equalsIgnoreCase(userChoice)) {
				Object index = null;
				list.remove(index);
				printList(list);
			} else if ("edit".equalsIgnoreCase(userChoice)) {
				;
				doEdit(scnr, list);
				printList(list);
			} else {
				System.out.println("Sorry. That's an invalid option.");
			}

		}

		System.out.println("Goodbye.");
		scnr.close();
	}

	private static void doEdit(Scanner scnr, ArrayList<Car> list) {
		// TODO Auto-generated method stub

	}

	private static void printList(ArrayList<Car> list) {
		// TODO #2 print all the items in the list with their number. E.g.
		
		list.add(new Car("Honda", "Accord", 2018, 25859.91));
		list.add(new Car("Toyota", "Camery", 2018, 24568.81));
		list.add(new Car("Nissan", "Maxima", 2018, 30499.99));
		list.add(new UsedCar("Ford", "Focus", 2004, 1800, 140000));
		list.add(new UsedCar("Chevy", "Impala", 1996, 2000, 134282));
		list.add(new UsedCar("Jeep", "Wrangler", 2010, 5000, 110500));
		
	}

	private static ArrayList<Car> doAdd(Scanner scnr, ArrayList<Car> list) {
		String userInput = " ";
		String newOrUsed;
		String userMake; 
		String userModel;
		int userYear;
		double userPrice;
		double mileage;
		do {
			System.out.println("what would you like to add? new or used? ");
		}
	}

	private static void doRemove(Scanner scnr, ArrayList<Car> list) {
		int index = getIndexFromUser(scnr, list);
		// TODO #4 remove the name at the given index from the list
	}

	private static int getIndexFromUser(Scanner scnr, ArrayList<String> list) {
		return Validator.getInt(scnr, "Enter the number of your selection: ", 1, list.size());
	}
}
