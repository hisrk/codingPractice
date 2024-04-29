package practiceNew;

public class palindrome {

    public static void main(String[] args) {


        String word= "aaabbbbbbaaag";


     if(isPalindrome(word)){

         System.out.println("is plaindrome");
     }


    }

    private static boolean isPalindrome(String word) {


        for(int i =0;i<word.length();i++){

            if(word.charAt(i)!=word.charAt(word.length()-1-i)){

  return false;

            }



        }
        return  true;
    }
}
