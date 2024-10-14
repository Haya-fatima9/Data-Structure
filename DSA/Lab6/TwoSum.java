import java.util.Arrays;

public class TwoSum {

    public static boolean hasTwoSum(int[] nums, int K) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        // Step 3: Use two pointers to find if there are two numbers that sum to K
        while (left <= right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == K) {
                return true; // Found the pair
            } else if (currentSum < K) {
                left++; // Increase the sum by moving the left pointer to the right
            } else {
                right--; // Decrease the sum by moving the right pointer to the left
            }
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] nums = {12, 41, 11, 61};
        int K = 10;

        boolean result = hasTwoSum(nums, K);
        System.out.println(result ? "Yes" : "No"); // Output: Yes
    }
}

