package practiceNew;

public class FirstNonRepetingCharater {

    public static void main(String[] args) {

        String str1= "aabbccdddeeffgjslhfkls";

        int[] arr= new int [256];

        for(int i=0;i<str1.length();i++){

            arr[str1.charAt(i)]++;

        }

        for(int i =0;i<256;i++){


             if(arr[i]==1){


                 System.out.println((char)i+" is first non repeating charater" );
                 break;
             }

        }



    }
}
