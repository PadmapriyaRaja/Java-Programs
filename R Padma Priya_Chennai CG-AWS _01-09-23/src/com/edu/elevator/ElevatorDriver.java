package com.edu.elevator;

import java.util.Scanner;

// Simulating how the elevator works when the user is giving an input
public class ElevatorDriver {

	public static void main(String[] args) {

		// For getting user input Scanner class is used
		Scanner sc = new Scanner(System.in);

		// Elevator class object is created for accessing the methods
		Elevator elevator = new Elevator();

		// Initialising the character choice
		char choice = 0;

		// currentFloor is initialised
		int currentFloor = 1;

		while (choice != 'q') {

			System.out.println("Options:  (s)elect a floor, (f)ire alarm,  (q)uit");

			System.out.println("Enter s, f, or q ==> ");

			// Getting the choice from the user
			choice = sc.next().charAt(0);
			choice = Character.toLowerCase(choice);

			// switch case is used for picking up the choices
			switch (choice) {

			case 's':

				// selectFloor method is called from Elevator class if selection is not proper
				// customised inappropriate floor exception thrown
				try {
					currentFloor = elevator.selectFloor(currentFloor);
				} catch (InappropriateFloorException e) {

					e.printStackTrace();
				}

				break;

			case 'f':

				// fireAlarm method is called from Elevator class.
				currentFloor = elevator.fireAlarm(currentFloor);

				break;

			case 'q':

				// For quitting q is used.
				System.out.println("Terminated");

				System.exit(0);

				break;

			default:

				// if any other option is selected other than above mentioned option default
				// block gets executed.
				System.out.println("Invalid selection.");

			}
		}
		sc.close();

	}

}
