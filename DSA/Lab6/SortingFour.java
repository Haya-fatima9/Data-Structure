public class SortingFour {

    public void sortingFour(int[] arr) {
        // Check if the array contains exactly four elements
        if (arr.length != 4) {
            return; // Exit if not exactly four elements
        }

        int a = arr[0], b = arr[1], c = arr[2], d = arr[3];

        // Step 1: Compare and sort pairs
        if (a > b) swap(arr, 0, 1); // Compare 1
        if (c > d) swap(arr, 2, 3); // Compare 2

        // Step 2: Compare the results
        if (a > c) swap(arr, 0, 2); // Compare 3
        if (b > d) swap(arr, 1, 3); // Compare 4

        // Step 3: Final comparison to ensure order
        if (b > c) {
            swap(arr, 1, 2); // Compare 5
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        SortingFour sorter = new SortingFour();
        int[] arr = {64, 25, 12, 22};

        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        sorter.sortingFour(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}
