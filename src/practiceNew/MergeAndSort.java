package practiceNew;

public class MergeAndSort {

    public static void main(String[] args) {

        int arr1[]={1,2,4,5,6,7,9};

        int arr2[]={3,8,10};


            int max = arr1.length+arr2.length;


            int[] newArry = new int [max];

           int l= 0;
           int m=0;
           int n =0;
           while(l<arr1.length && m<arr1.length){


                if(arr1[l]<arr2[m]){

                    newArry[n++]=arr1[l++];
                }else {

                    newArry[n++]=arr1[m++];
                }


            }

            while (l<arr1.length){

                newArry[n++]=arr1[l++];

            }
            while (m<arr2.length){

                newArry[n++]=arr2[m++];

            }



for (int i : newArry){

    System.out.println(i+",");
}







    }
}
