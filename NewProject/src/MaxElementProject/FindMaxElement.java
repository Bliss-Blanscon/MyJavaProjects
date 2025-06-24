package MaxElementProject;

/**
 * This class finds the maximum (largest) element in a given array of real numbers.
 */
public class FindMaxElement {

    /*
     ----------------------------------------
     PSEUDOCODE: MaxElement(A[0..n–1])
     ----------------------------------------

     // Determines the value of the largest element in a given array
     // Input: An array A[0..n–1] of real numbers
     // Output: The value of the largest element in A

     maxval ← A[0]
     for i ← 1 to n – 1 do
         if A[i] > maxval then
             maxval ← A[i]
     return maxval
    */

    /**
     * This method returns the largest value in a given array.
     *
     * @param A An array of real numbers (type double)
     * @return The maximum value found in the array
     */
    public static double findMax(double[] A) {
        // Assume the first element is the largest initially
        double maxval = A[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < A.length; i++) {
            // If the current element is greater than the current max, update max
            if (A[i] > maxval) {
                maxval = A[i];
            }
        }

        // Return the largest value found
        return maxval;
    }

    /**
     * Main method to test the findMax function.
     */
    public static void main(String[] args) {
        // Define a sample array of real numbers
        double[] numbers = {3.2, 7.5, 2.1, 9.0, 5.4};

        // Call the findMax method to get the maximum value in the array
        double max = findMax(numbers);

        // Display the result to the console
        System.out.println("The maximum value is: " + max);
    }
}
