public class MaxSubarraySumSelf {

    public static void main(String[] args) {

        int[] arr = {9, 5, 6, 3, 10, -1, 4, 4, -3, 6, 7, 2};


  int maxEndElement= arr[0];
  int maxSoFar=arr[0];

for(int i = 1;i<arr.length;i++){



    if(arr[i]<maxEndElement){



    }else {

        maxEndElement=arr[i]+maxEndElement;



    }





}






    }
}
