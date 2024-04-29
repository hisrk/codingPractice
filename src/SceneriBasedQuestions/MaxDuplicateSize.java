package SceneriBasedQuestions;

public class MaxDuplicateSize {

    public static void main(String[] args) {

        String name = "abbbsscchhehehhhhhh";

        int [] arr = new int[256];

        int count =0;
        char ch = ' ';

        for(int i = 0;i<name.length();i++){

               arr[name.charAt(i)]++;

               if(arr[name.charAt(i)]>count){

                   count=arr[name.charAt(i)];

                            ch= name.charAt(i);

               }
               }

        System.out.println( ch + " , " + count);









        }











    }




