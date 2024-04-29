public class LongestSustring {

    public static void main(String[] args) {



        String word= "abcdeabcdefabcedfabcdefg" ;

  int longestlength=0;

        int longestStartIndex=0;

        int longestEndIndex=0;


        for(int i =0;i<word.length();i++){

            boolean [] arr = new boolean[256] ;
            int count=0;

            for(int j =i ;j< word.length();j++){

                    if(arr[word.charAt(j)]){

                        break;
                    }

                    else{

                        arr[word.charAt(j)]=true;

                        count++;


                    }

            }

            if(longestlength<count){

                longestlength=count;

                longestStartIndex=i;

                longestEndIndex= longestStartIndex+longestlength;
            }



        }
        String substring = word.substring(longestStartIndex, longestEndIndex);

        System.out.println(longestlength+","+substring);











    }
}
