package practiceNew;

public class LongestSubstringWithpitNonRepetingCharatersFinal {


    public static void main(String[] args) {

        String word ="abcabcdeabcdefg" +
                "";


        int i = longestSubstring(word);

        System.out.println("longesty substring "+ i);


    }

    private static int longestSubstring(String word) {
int ans=0;
        for (int i =0;i<word.length();i++){

            int count=0;

            boolean arr[] = new boolean[256];

            for(int j=i;j<word.length();j++){

                if(arr[word.charAt(j)]){


                    break;
                }else {

                    arr[word.charAt(j)]=true;
                    count++;
                }


            }
            if(count>ans){


                  ans= count;

            }



        }



  return ans;

    }
}
