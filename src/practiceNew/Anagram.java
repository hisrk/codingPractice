package practiceNew;

public class Anagram {

    public static void main(String[] args) {


        String str1= "aaabbbcccddd";

        String str2= "acbadcbacfbd";

        if(isAnagram(str1,str2)){

            System.out.println("is anagram");
        }else {

            System.out.println("not an anagram");
        }


    }

    private static boolean isAnagram(String str1, String str2) {

          if(str1.length()!=str2.length()){

              return  false;
          }

          int arr[] = new int [256];


          for(int i=0;i<str1.length();i++){

              arr[str1.charAt(i)]++;
          }
          for(int j=0;j<str2.length();j++){

              arr[str2.charAt(j)]--;
          }

          for(int i=0;i<256;i++){


              if(arr[i]>0){

                  return false;
              }

          }

            return  true;

    }
}
