package SceneriBasedQuestions;

public class FindDuplicates {

    public static void main(String[] args) {


        String word= "aabbccdehfjjjeghdh";

        int arr[] = new int[256];

        for(int i=0;i<word.length();i++){

            arr[word.charAt(i)]++;

        }

        for(int i =0;i<256;i++){

            if(arr[i]>1){

                System.out.println(   (char)i+ " comes " + arr[i]);
            }


        }






    }

}
