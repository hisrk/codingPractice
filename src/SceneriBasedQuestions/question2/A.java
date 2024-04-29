package SceneriBasedQuestions.question2;

import java.util.*;
import java.util.stream.Stream;

public class A {

    //Scenario: Social Media Platform Analytics
    //
    //Imagine you're developing an analytics module for a social media platform. The platform collects data on user engagement,
    // including the number of likes, comments, and shares for each post. Your task is to write Java code to analyze this data and provide
    // insights into post popularity.
    //
    //Question:
    //Given a collection of Post objects representing posts on the social media platform, design a Java program to perform the following tasks:
    //
    //Calculate the total number of likes, comments, and shares across all posts.
    //Find the post with the highest number of likes.
    //Identify the average number of comments per post.
    //Additional Details:
    //
    //Each Post object contains the following attributes:
    //Post ID
    //Number of likes
    //Number of comments
    //Number of shares
    //Assume that the collection of Post objects is stored in a List<Post> named posts.
    //Expected Output:
    //
    //For Task 1: Total number of likes, comments, and shares across all posts.
    //For Task 2: Post with the highest number of likes.
    //For Task 3: Average number of comments per post.

    public static void main(String[] args) {



        List<Post> postList= Arrays.asList(new Post(1, 100, 20, 5),
                new Post(2, 50, 10, 2),
                new Post(3, 120, 25, 8),
                new Post(4, 80, 15, 3));




           postList.stream().sorted();



        long count = postList.stream().mapToInt((p1 -> p1.getNumberOfLikes() + p1.getShares() + p1.getComments())).sum();
        System.out.println(count);


//1
        int sum = postList.stream().mapToInt((post1) -> post1.getShares() + post1.getComments() + post1.getNumberOfLikes()).sum();

        System.out.println(sum);

        //2

        Optional<Post> first = postList.stream().sorted((post1, post2) -> post1.getNumberOfLikes() > post2.getNumberOfLikes() ? -1 : +1).limit(1).findFirst();

        System.out.println(first.orElse(null));
        
        //3


        OptionalDouble average = postList.stream().mapToInt((Post::getComments)).average();

        System.out.println(average.orElse(0.0));

    }
}
