package practiceNew;

public class MergerTwoArrays {

    public static void main(String[] args) {
        
        int [] arr1= {1,3,5,7,8};

        int [] arr2={2,4,6,9};

        int newSize = arr1.length + arr2.length;

          int [] newArr= new  int [newSize];

        int i = 0;
        int j =0;

        int k=0;

        while(arr1.length>i && arr2.length>j){

            if(arr1[i]<arr2[j]){

              newArr[k++]= arr1[i++];

            }else {

                newArr[k++]= arr2[j++];
            }

        }

        while (i<arr1.length){

            newArr[k++]= arr1[i++];

        }

       while (j<arr2.length){

            newArr[k++]= arr2[j++];

        }
        System.out.print("Merged Array:");
       for (int z : newArr){

           System.out.print(z+",");
       }




    }

                    
    
       

    



}
