public class FirstNonRepetingCharacter {




    public static void main(String[] args) {


        String str1= "abccdabjvsjksgdjgf";


        char c = firstNonRepeatingCharacter(str1);
        System.out.println(c+" is the first non repeating character");




    }

    private static char firstNonRepeatingCharacter(String str1) {

        int [] arr = new int[256] ;

        for(int i =0;i<str1.length();i++){

            arr[str1.charAt(i)]++;

        }
        for(int i = 0;i<256;i++){
           // if(arr[str1.charAt(i)]>1){-->first repeating character

        if(arr[str1.charAt(i)]==1){

                //System.out.println(str1.charAt(i) + " first reepeting character")
              //  break;

    return str1.charAt(i);


            }
        }
    return  ' ';
    }
}
