package practiceNew;

public class MaxTimesCharaterComing {

    public static void main(String[] args) {

   String name= "gaufislhbdfasglfhfgl";

   int arr [] = new int[256];

   int count=0;
   char ch = ' ' ;


   for(int i = 0;i<name.length();i++){

    arr[name.charAt(i)]++;

    if(count<arr[name.charAt(i)]){

        count=arr[name.charAt(i)];

         ch= name.charAt(i);
    }


   }

        System.out.println(ch+ " comes max times that is "+ count);



    }
}
