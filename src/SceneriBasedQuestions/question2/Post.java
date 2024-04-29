package SceneriBasedQuestions.question2;

public class Post {
   //Post ID
    //Number of likes
    //Number of comments
    //Number of shares

    private int postId;

    private int numberOfLikes;

    private int comments;

    private int shares;

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", numberOfLikes=" + numberOfLikes +
                ", comments=" + comments +
                ", shares=" + shares +
                '}';
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public Post(int postId, int numberOfLikes, int comments, int shares) {
        this.postId = postId;
        this.numberOfLikes = numberOfLikes;
        this.comments = comments;
        this.shares = shares;
    }
}
