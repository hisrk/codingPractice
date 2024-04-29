import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        String str1= "aaabbbcccddd";


        String str2="accadcbdbbadd";


        if(isAnagram(str1,str2)){

            System.out.println(str1+" is anagram");
        }else {
            System.out.println("not an anagram");
        }


    }

    private static boolean isAnagram(String str1, String str2) {


        String lowerCase1 = str1.toLowerCase();
        String lowerCase2 = str2.toLowerCase();

        int [] arr= new int [256];

        for(int i=0;i<str1.length();i++){


              arr[lowerCase1.charAt(i)]++;

        }
        for(int i=0;i<str2.length();i++){


              arr[lowerCase2.charAt(i)]--;


        }

        for(int i=0;i<256;i++){

            if(arr[i]>0){
                return  false;
            }

        }

   return  true;
    }
}
