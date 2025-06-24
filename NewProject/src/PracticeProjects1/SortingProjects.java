package PracticeProjects1;

public class SortingProjects {
    public static void main(String[] args) {
        // Step 1: Define the unsorted array
        int[] array1 = {5, 7, 15, 3, 6, 8, 1, 2, 9};

        // Step 2: Perform Bubble Sort
        // Outer loop controls how many times we need to pass through the array
        for (int i = 0; i < array1.length - 1; i++) {

            // Inner loop compares adjacent values
            for (int j = 0; j < array1.length - 1 - i; j++) {

                // Step 3: Compare adjacent elements
                // If left is greater than right, swap them
                if (array1[j] > array1[j + 1]) {
                    // Step 4: Swap
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }

            // Optional: Print array after each outer loop iteration to see progress
            System.out.print("Pass " + (i + 1) + ": ");
            for (int num : array1) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Step 5: Final sorted array
        System.out.println("\nSorted array:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
    }
}
