package practiceNew;

public class BubbleSort {

    public static void main(String[] args) {




        int [] arr= {11,1,33,4,5,33,2,1,19,2,4,5};
        int temp=0;

        for(int i = 0;i< arr.length;i++){

            for (int j=i+1;j< arr.length;j++){


                if(arr[i]>arr[j]){

                    temp= arr[i];

                    arr[i]= arr[j];

                    arr[j]=temp;

                }

            }



        }
        System.out.print("sorted Array");

        for(int i: arr){

            System.out.print(i+",");

        }


            int [] removedDuplicates= removeDuplicates(arr);

        System.out.println("removed Duplicate array");

        for (int i : removedDuplicates){

            if(removedDuplicates[i]!=0){


            System.out.print(i + ",");
        }}



    }

    private static int [] removeDuplicates(int[] arr) {
            int n= arr.length;

        int[] temp= new int[n];

        int count=0;

        for(int i = 0;i< temp.length-1;i++){


            if(arr[i]==arr[i+1]){
            }

            else {


                temp[count++]=arr[i];
            }
        }


   return temp;
    }
}
