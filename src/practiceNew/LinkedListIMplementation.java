package practiceNew;

import java.util.ArrayList;

public class LinkedListIMplementation {


    //input ={1,2,3,4,5,6} output={2,1,4,3,6,5}


    public static void main(String[] args) {

         int [] arr={1,2,3,4,5};



             int length =arr.length;
             for(int i =0;i<arr.length/2;i++){

                 int temp =arr[i];
                 arr[i]= arr[length-1-i];







             }System.out.println("ReversedArray ");

             for(int j: arr){


            System.out.println(j);
        }






    }







}
