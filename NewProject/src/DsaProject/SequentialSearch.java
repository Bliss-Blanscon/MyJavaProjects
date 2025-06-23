package DsaProject;

/**
 * This class implements the Sequential Search algorithm.
 * It searches for a given value in an array and returns its index if found.
 */
public class SequentialSearch {
   /*
     ----------------------------------------
     PSEUDOCODE: SequentialSearch(A[0..n–1], K)
     ----------------------------------------

     // Searches for a given value in a given array by sequential search
     // Input: An array A[0..n–1] and a search key K
     // Output: The index of the first element of A that matches K
     //         or –1 if there are no matching elements

     i ← 0
     while i < n and A[i] ≠ K do
         i ← i + 1

     if i < n then
         return i
     else
         return –1
    */

    /**
     * Performs sequential search on the array to find the given key.
     *
     * @param array the array to search
     * @param key   the value to find
     * @return the index of the key if found; otherwise, -1
     */
    public static int search(int[] array, int key) {
        int i = 0;               // Start from the first element
        int n = array.length;   // Get the length of the array

        // Loop through the array until we find the key or reach the end
        while (i < n && array[i] != key) {
            i = i + 1;
        }

        // If the key was found, return its index
        if (i < n) {
            return i;
        } else {
            // If not found, return -1
            return -1;
        }
    }

    /**
     * Main method to test the search function.
     */
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 9, 5};   // Sample array
        int key = 9;                       // Value to search for

        int index = search(numbers, key);  // Call the search function

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
}
}
