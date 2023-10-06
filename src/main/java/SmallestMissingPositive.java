import java.util.HashSet;
import java.util.Set;

public class SmallestMissingPositive {
    public static int findSmallestMissingPositive(int[] A) {
        int n = A.length;

        // Create a set to store unique positive integers from the array
        Set<Integer> positiveIntegers = new HashSet<>();

        // Iterate through the array and add positive integers to the set
        for (int num : A) {
            if (num > 0) {
                positiveIntegers.add(num);
            }
        }

        // Iterate from 1 to n+1 to find the smallest missing positive integer
        for (int i = 1; i <= n + 1; i++) {
            if (!positiveIntegers.contains(i)) {
                return i;
            }
        }

        // If all positive integers from 1 to n are present in the array, return n+1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 6, 4, 1, 2}; // Missing: 5
        int[] arr2 = {1, 2, 3};          // Missing: 4
        int[] arr3 = {-1, -2, -3};       // Missing: 1

        System.out.println("Smallest Missing in arr1: " + findSmallestMissingPositive(arr1)); // Output: 5
        System.out.println("Smallest Missing in arr2: " + findSmallestMissingPositive(arr2)); // Output: 4
        System.out.println("Smallest Missing in arr3: " + findSmallestMissingPositive(arr3)); // Output: 1
    }
}
