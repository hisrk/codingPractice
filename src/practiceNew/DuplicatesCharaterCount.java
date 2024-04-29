package practiceNew;

public class DuplicatesCharaterCount {


    public static void main(String[] args) {


           String name= "gddsfklgslkghklhjfklsfhsk";


        int arr [] = new int[256];


        for(int i=0;i<name.length();i++){

            arr[name.charAt(i)]++;

        }
        for(int i=0;i<256;i++){

            if(arr[i]>1){

                System.out.println((char)i+" comes "+ arr[i]+" times ");
            }
        }





    }
}
