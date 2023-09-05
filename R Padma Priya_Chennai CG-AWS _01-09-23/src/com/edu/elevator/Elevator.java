package com.edu.elevator;

import java.util.Scanner;

public class Elevator {

	// For getting user input Scanner class is used
	Scanner s = new Scanner(System.in);

	// selectFloor method definition
	int selectFloor(int currentFloor) throws InappropriateFloorException {

		// Initialising the floor variable that user like to go.
		int floor = -1;

		// getting the input from the user.

		do {
			try {

				System.out.println("Enter the floor you'd like to go to ==> ");
				floor = s.nextInt();
			} catch (Exception e) {

				System.out.println("Please enter a valid floor number..");
				s.nextLine();
			}

		} while (floor == -1);

		if (floor < 1 || floor > 10) {

			// if the floor selection is inappropriate throws the exception
			throw new InappropriateFloorException(
					"Inappropriate floor selection,please select the floor between 1 and 10");

		} else if (floor == currentFloor) {

			// if floor and currentFloor are same this block is executed.
			System.out.println("You are in the same floor..");

		} else if (floor > currentFloor) {

			// if the floor is greater than the currentFloor this block gets executed.

			System.out.print("Going up..");

			for (int i = currentFloor + 1; i <= floor; i++) {

				System.out.print(i + "..");
			}

			System.out.println("Ding!");

		} else if (floor < currentFloor) {

			// if the floor is smaller than the currentFloor this block gets executed.
			System.out.print("Going down..");

			for (int i = currentFloor; i >= floor; i--) {

				System.out.print(i + "..");
			}

			System.out.println("Ding!");
		}

		return floor;
	}

	// fireAlarm method definition
	int fireAlarm(int currentFloor) {

		if (currentFloor == 1) {

			// if the currentFloor is 1 then this block is executed.

			System.out.println("Danger! You must exit the building now!");

		} else if (currentFloor > 1) {

			// if the currentFloor is greater than 1 this block is executed.
			System.out.println("Danger! You must exit the building now!");

			System.out.print("Going down..");

			for (int i = currentFloor; i >= 1; i--) {
				System.out.print(i + "..");
			}

			System.out.println("Ding!");

			return 1;
		}
		return 1;

	}
}
