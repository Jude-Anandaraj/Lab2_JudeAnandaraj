/* Jude Anandaraj
 * 2026/09/24
 * Lab1_DiceGame
 */
package com.ja.week3;

import java.security.SecureRandom;

public class Dicegame {

	public static void main(String[] args) {

		// Random
		SecureRandom random = new SecureRandom();

		// Dies
		int die1 = random.nextInt(6) + 1;
		int die2 = random.nextInt(6) + 1;
		int die3 = random.nextInt(6) + 1;
		int die4 = random.nextInt(6) + 1;

		// Sum
		int sum = die1 + die2 + die3 + die4;

		// Printing
		System.out.println("First Roll:");
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Die 3: " + die3);
		System.out.println("Die 4: " + die4);
		System.out.println("Sum: " + sum);

		// Conditions to Win
		if (sum == 7 || sum == 11 || sum == 15 || sum == 21) {
			System.out.println("You Win!!!!");
		}
		// Condition to lose (13 is also assumed as a lose condition)
		else if (sum == 10 || sum == 12 || sum == 13 || sum == 19 || sum == 20 || sum == 22 || sum == 23 || sum == 24) {
			System.out.println("You Lose!!!");
		}
		// Condition to Goal
		else {
			int goal = sum;
			System.out.println("Your goal number is: " + goal);
			System.out.println("Keep rolling...");

			int newDie1 = random.nextInt(6) + 1;
			int newDie2 = random.nextInt(6) + 1;
			int newDie3 = random.nextInt(6) + 1;
			int newDie4 = random.nextInt(6) + 1;
			int newSum = newDie1 + newDie2 + newDie3 + newDie4;

			System.out.println();
			System.out.println("Second Roll:");
			System.out.println("Die 1: " + newDie1);
			System.out.println("Die 2: " + newDie2);
			System.out.println("Die 3: " + newDie3);
			System.out.println("Die 4: " + newDie4);
			System.out.println("Sum: " + newSum);

			// If newsum == goal player wins
			if (newSum == goal) {
				System.out.println("You rolled the goal number. You Win!!!!");

			}
			// else player lose
			else {
				System.out.println("You didn't roll the goal number. You Lose!!!!");

			}

		}

	}
}
