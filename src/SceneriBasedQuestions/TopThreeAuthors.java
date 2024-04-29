package SceneriBasedQuestions;

import SceneriBasedQuestions.Book;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopThreeAuthors {

    public static void main(String[] args) {


        List<Book> bookList= Arrays.asList(
                new Book("Book1", "Author1", "Fiction", 20, 100),
                new Book("Book2", "Author2", "Science", 25, 150),
                new Book("Book3", "Author3", "Fiction", 30, 200),
                new Book("Book4", "Author1", "History", 15, 80),
                new Book("Book5", "Author4", "Fiction", 35, 120),
                new Book("Book6", "Author2", "Fiction", 22, 180));
        // Assume the list of Book objects is stored in a variable named 'books'


        // Group books by author and sum the number of copies sold for each author
        Map<String, Integer> authorSalesMap = bookList.stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.summingInt(Book::getNumberOfCopiesSold)));

        // Find the top three authors with the highest total sales
        List<String> topThreeAuthors = authorSalesMap.entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Display the top three authors
        System.out.println("Top Three Best-Selling Authors: " + topThreeAuthors);
    }

    // Method to simulate retrieving books from the database or external source


}


