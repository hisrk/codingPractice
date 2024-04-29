package practiceNew;

public class Maximum {

    public static void main(String[] args) {


        int [] arr= {12,4,5,22,56,78,91};

        int max=0;

        for(int i =0;i< arr.length-1;i++){

   if(arr[i]>arr[i+1]){

       max=arr[i];

   }else {

       max=arr[i+1];
   }


        }
        System.out.println(max);







    }
}
