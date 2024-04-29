package practice;

public class AnagramSelf {


    public static void main(String[] args) {


        String str1 = "abcdde";
        String str2 = "addgce";

        if (isAnagram(str1, str2)) {

            System.out.println("it is na anagram");


        } else {

            System.out.println("not an anagram");
        }


    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {

            System.out.println("not an anagram");
        }

        int arr[] = new int[256];

        for (int i = 0; i < str1.length(); i++) {

            arr[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {

            arr[str2.charAt(i)]--;

        }

        for (int i = 0; i < 256; i++) {

            if (arr[i] != 0) {


                return false;
            }
        }
 return true;

    }
}