public class MaxSubarraySum {

    public static void main(String[] args) {
        int[] arr = {-9, -5, -6,42, 3, 10, -1, 4, 4, -3, 6, 7, 2};
        int maxSubarraySum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSubarraySum);
    }

    private static int findMaxSubarraySum(int[] arr) {
        int maxEndingHere = arr[0]; // Tracks the maximum sum of subarrays ending at the current position

        int maxSoFar = arr[0]; // Tracks the maximum sum found so far

        for (int i = 1; i < arr.length; i++) {

            // Calculate the maximum sum of subarrays ending at the current position

            if (arr[i] > arr[i] + maxEndingHere) {

                maxEndingHere = arr[i];

            } else {

                maxEndingHere = arr[i] + maxEndingHere;
            }

            // Update the maximum sum found so far
            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
            }
        }

        return maxSoFar;
    }
}
