/**
 * Calculates the time to microwave different items.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024-02-29
 */
package com.example;

import java.util.Scanner;

// Calculates the time to microwave different items.
public final class Microwave {

    // Prevent instantiation with a private constructor.
    private Microwave() {
        throw new UnsupportedOperationException("Cannot be instantiated.");
    }

    // Main method for program execution.
    public static void main(final String[] args) {
        // Constants for microwave times
        final float PIZZA_TIME = 45f;
        final float SUB_TIME = 60;
        final float SOUP_TIME = 105f;
        // Variables to store total and remaining time
        float totalTimeSeconds;
        int totalTimeMinutes;
        float remainingTimeSeconds;
        // Scanner for user input
        Scanner sc = new Scanner(System.in);
        try {
            // Prompt user for input
            System.out.println("This program calculates the amount of time it will take to Microwave a food item.");
            System.out.print("You will Pick from 1-3 \n1) Pizza\n2) Soup\n3) Sub\n Please Choose your number: ");
            String itemType = sc.nextLine();
            System.out.print("How many items do you have (1, 2, or 3): ");
            float numItems = sc.nextFloat();
            // Check if the number of items is valid
            if (numItems == 1 | numItems == 2 | numItems == 3) {
                // Calculate total time based on item type and number
                switch (itemType) {
                  case "1":
                        // Calculates total Seconds
                        totalTimeSeconds = PIZZA_TIME * (1 + ((numItems - 1) / 2));
                        break;
                      case "2":
                        // Calculates total Seconds
                        totalTimeSeconds = SOUP_TIME * (1 + ((numItems - 1) / 2));
                        break;
                      case "3":
                        // Calculates total Seconds
                        totalTimeSeconds = SUB_TIME * (1 + ((numItems - 1) / 2));
                        break;
                    default:
                        // Handle invalid item type
                        System.out.println("Error, The item must be 1, 2, or 3!");
                        return;
                }
                // Convert total time to minutes and seconds
                totalTimeMinutes = (int) totalTimeSeconds / 60;
                remainingTimeSeconds = totalTimeSeconds % 60;
                // Display total required time
                System.out.println("Your total Required time is " +
                        totalTimeMinutes + " Minutes and " + remainingTimeSeconds + " Seconds.");
            } else {
                // Handle invalid number of items
                System.out.println("Error, The item number must be 1, 2, or 3!");
            }
        } catch (Exception e) {
            // Handle any exceptions
            System.out.println("Error " + e.getMessage());
        } finally {
            // Close Scanner
            sc.close();
        }
    }
}
