public class LeftMinRightMax {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 6, 10, 9, 7, 8};
        int specialElement = isSpecialElement(arr);
        System.out.println(specialElement);
    }

    private static int isSpecialElement(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            boolean isSpecial = true;

            // Check if arr[i] is smaller than all elements to its right
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    isSpecial = false;
                    break;
                }
            }

            // Check if arr[i] is greater than all elements to its left
            for (int j = 0; j < i; j++) {
                if (arr[i] <= arr[j]) {
                    isSpecial = false;
                    break;
                }
            }

            // If both conditions are satisfied, return the special element
            if (isSpecial) {
                return arr[i];
            }
        }
        // No special element found, return 0 or any other default value
        return -1;
    }
}
