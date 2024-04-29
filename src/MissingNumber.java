public class MissingNumber {

    public static void main(String[] args) {



        int [] ar={0,2,3,5};

          for(int i = 0;i<ar.length-1;i++){

              if(ar[i]+1==ar[i+1]){

                  continue;
              }else{

                  System.out.println(ar[i]+1);
              }
          }








    }
}
