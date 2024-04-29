package practiceNew;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {

    public static void main(String[] args) {


        HashMap<String,Integer> hashMap= new HashMap<>();


           hashMap.put("A",1);
           hashMap.put("B",2);
           hashMap.put("C",3);
           hashMap.put("D",4);


        Iterator<String> iterator = hashMap.keySet().iterator();


        while (iterator.hasNext()){

            String next = iterator.next();

            System.out.println(next);

            hashMap.put("E",5);


        }
        
        


    }
    
    
}
