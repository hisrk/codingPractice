package practiceNew;

public class LongestSubstring {

    public static void main(String[] args) {

        String word="abcabcdeabcdef";



        int ans=0;

        for(int i = 0;i<word.length();i++){

            boolean [] arr= new boolean[256];

            int count=0;

              for (int j=i;j< word.length();j++){

                  if(arr[word.charAt(j)]){

                      break;
                  }else{

                       arr[word.charAt(j)]=true;

                      count++;
                  }
              }

              if(count>ans){

                  ans=count;
              }




        }
        System.out.println(ans);

    }


}
