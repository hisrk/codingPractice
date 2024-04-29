package practiceNew;

public class TargetValue {

    public static void main(String[] args) {

        int [] arr= {2,4,5,6,7,9,10,7};

        int target=14;

        int count=0;

        for(int i = 0;i< arr.length;i++){

            for(int j=i+1;j< arr.length;j++){

        if(arr[i]+arr[j]==target){

                System.out.println(arr[i]+" + "+ arr[j]+ " equals " +target);

                count++;
                      }}



        }

        System.out.println(count+" number of pairs are there");









    }
}
