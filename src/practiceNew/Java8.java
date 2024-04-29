package practiceNew;

import java.util.function.Function;
import java.util.function.Predicate;

public class Java8 {


    public static void main(String[] args) {



        int [] arr= {1,5,6,7,8,18,36,37};

        Predicate<Integer> pre= (num)-> num%2==0;


        for (int i = 0;i<arr.length;i++){


            System.out.println(pre.test(arr[i])+ ":"+arr[i]);
        }


        Function<String,String> function= (str1)-> str1.toUpperCase();






    }
}
