package practiceNew;

public class MaxSubStringWithRepeatedCharacter {

    public static void main(String[] args) {
        
        
        String word= "abcdebabcdefgab";


        int maxL = hasLongestSubString(word);

        System.out.println(maxL);


    }

    private static int hasLongestSubString(String word) {

        int start =0;

        int arr[] = new int[256];

        int maxLength= 0;

          for(int end=0;end<word.length();end++) {

   if(arr[word.charAt(end)]>=start){

       start= arr[word.charAt(end)] +1;
   }

   arr[word.charAt(end)]=end;

       int currentLength= end-start+1;

       if(currentLength>maxLength){

           maxLength=currentLength;

       }
          }



  return  maxLength;
    }


}
