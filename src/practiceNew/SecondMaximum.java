package practiceNew;

public class SecondMaximum {

    public static void main(String[] args) {



        int [] arr= {12,4,5,22,56,78,91};


        int max=arr[0];

        int secondMax=arr[1];
        int temp=0;

        if(secondMax>max){

            temp=max;
            max=secondMax;
            secondMax=temp;
        }

        for(int i =2;i<arr.length;i++){
            if(arr[i]>max){

                secondMax=max;
                max=arr[i];

            }else {

                if(arr[i]>secondMax && arr[i]<max){

                    secondMax=arr[i];

                }
            }
        }
        System.out.println(max+" is max");
        System.out.println(secondMax+" is second max");









    }
}
