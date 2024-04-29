package SceneriBasedQuestions;

public class Book {

    //Title
    //Author
    //Category
    //Price
    //Number of Copies Sold

    private String title;

    private String Author;

    private  String Category;

    public Book(String title, String author, String category, int price, int numberOfCopiesSold) {
        this.title = title;
        Author = author;
        Category = category;
        this.price = price;
        NumberOfCopiesSold = numberOfCopiesSold;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", Category='" + Category + '\'' +
                ", price=" + price +
                ", NumberOfCopiesSold=" + NumberOfCopiesSold +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfCopiesSold() {
        return NumberOfCopiesSold;
    }

    public void setNumberOfCopiesSold(int numberOfCopiesSold) {
        NumberOfCopiesSold = numberOfCopiesSold;
    }

    private int price;

    private int NumberOfCopiesSold;
}
