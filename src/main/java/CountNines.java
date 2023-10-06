import java.util.Scanner;

public class CountNines {
    public static void main(String[] args) {


        System.out.println(" Enter the number you want to exist between 1 and 100");
        Scanner scanner = new Scanner(System.in);
        int numberQuery = scanner.nextInt();



        int count = 0; // Initialize a counter to keep track of occurrences

        // Loop through numbers from 1 to 100 (inclusive)
        for (int i = 1; i <= 100; i++) {
            int number = i; // Store the current number in a variable

            // Check each digit of the number
            while (number > 0) {
                int digit = number % 10; // Extract the last digit

                // Check if the digit is 9
//                if (digit == 9) {
                if (digit == numberQuery) {
                    count++; // Increment the count if it's 9
                }

                // Remove the last digit to check the next one
                number /= 10;
            }
        }

        // Print the total count of occurrences
       // System.out.println("The digit 9 appears " + count + " times between 1 and 100.");
        System.out.println("The digit "+ numberQuery + " appears " + count + " times between 1 and 100.");
    }
}
