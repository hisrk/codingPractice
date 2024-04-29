package practiceNew;

public class MaximumArraySum {

    public static void main(String[] args) {

        int[] arr = {-9, -5, -6,42, 3, 10, -1, 4, 4, -3, 6, 7, 2} ;


        int maxEnding=arr[0];
        int maxSofar=arr[0];

        for (int i =1;i< arr.length;i++){

            if(arr[i]>arr[i]+maxEnding){

                maxEnding=arr[i];

            }else {

                maxEnding=arr[i]+maxEnding;


            }
            if(maxSofar<maxEnding){


               maxSofar=maxEnding;
            }






        }

        System.out.println(maxSofar);










    }
}
