import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all the non-zero elements to the beginning of the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Swap elements
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example usages:
        int[] nums1 = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));  // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        sol.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));  // Output: [0]

        int[] nums3 = {0, 0, 1};
        sol.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));  // Output: [1, 0, 0]
    }
}
