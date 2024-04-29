package practiceNew;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        rotate(nums, k);

        System.out.println("Rotated array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Normalize k if it's greater than the length of the array

        for (int i = 0; i < k; i++) {
            // Rotate the array to the right by one step
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
