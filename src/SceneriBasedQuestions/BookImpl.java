package SceneriBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookImpl {

    public static void main(String[] args) {


       List<Book> bookList= Arrays.asList( new Book("A","ajay","fiction",1200,16),
               new Book("B","srk","Science",1300,19),
               new Book("C","shivi","fiction",1200,55),
                       new Book("D","Heena","History",1200,73),
                               new Book("E","ajay","fiction",1200,74)


               );




//        Map<String, List<Book>> collect = bookList.stream().collect(Collectors.groupingBy(book1 ->book1.getCategory()));
//
//        collect.entrySet().forEach(System.out::println);

        List<Book> fictionBooksList = bookList.stream().filter(book1 -> book1.getCategory().equals("fiction")).collect(Collectors.toList());


        System.out.println(fictionBooksList);

        int sum = fictionBooksList.stream().mapToInt(Book::getPrice).sum();

        System.out.println(sum);


        List<Book> collect = bookList.stream().sorted((n1, n2) -> n1.getNumberOfCopiesSold() > n2.getNumberOfCopiesSold() ? -1 : +1).limit(3).collect(Collectors.toList());


        System.out.println(collect);













    }
}
