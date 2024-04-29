package SceneriBasedQuestions;

public class targetValues {

    public static void main(String[] args) {


        int [] arr = {2,6,8,9,10,13};

        int target= 19;


        for(int i =0;i<arr.length;i++){


            for(int j=i+1;j<arr.length;j++){


                if(arr[i] + arr[j]==target){

                    System.out.println("these "+ arr[i] +" , " + arr[j] + " has sum equal to "+ target);

                }



            }




        }





    }
}
