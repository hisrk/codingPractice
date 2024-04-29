package practiceNew;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sorting {

    public static void main(String[] args) {
        
        
        int [] arr={1,2,4,7,1,18,19,11,17,16};


        Optional<Integer> first = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst();

        System.out.println(first);

    }
}
