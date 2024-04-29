package SceneriBasedQuestions.question4;

public class Ekart {

//Design a Java program to manage the operations of the Grocery Shopping List Management system. Your program should include the
// following functionalities:
//
//Add items to the shopping list: Each item should have attributes such as name, quantity, price, and category.
//Mark items as purchased: The program should allow marking items as purchased once they are bought.
//Filter items by category: The program should allow users to filter items by category (e.g., vegetables, fruits, dairy).
//Generate reports: The program should generate reports on the items remaining to be purchased, including statistics such as the
// total cost of remaining items and the distribution of items by category.
//Additional Details:
//
//Implement appropriate classes to represent shopping list items.
//Ensure that the code is well-structured, modular, and provides efficient methods for adding, marking, filtering, and reporting on
// shopping list items.
//Allow users to specify whether the shopping list should be ordered (e.g., alphabetically by item name) or unordered. Implement the
// operations accordingly based on the user's choice.

private String name;

private int quantity;

private double price;

private String category;

    public Ekart(String name, int quantity, double price, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
