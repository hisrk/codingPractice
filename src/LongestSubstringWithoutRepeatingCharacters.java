public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        int[] lastIndex = new int[128]; // ASCII characters

        for (int end = 0; end < s.length(); end++) {  //abcabcdeabcd
            char currentChar = s.charAt(end);
            int charIndex = (int) currentChar;

            // If the current character is already seen, move the start pointer
            if (lastIndex[charIndex] >= start) {
                start = lastIndex[charIndex] + 1;
            }

            // Update the last index of the current character
            lastIndex[charIndex] = end;


            // Update the maximum length of the substring
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcdeabcd";
        int longestLength = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + longestLength);
    }
}
