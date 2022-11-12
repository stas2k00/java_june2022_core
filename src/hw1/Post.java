package hw1;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {
    }

    public Post (int userId,int id,String title,String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return this.userId;
    }
    public int getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public String getBody() {
        return this.body;
    }

    public Post setUserId(int userId) {
        this.userId = userId;
        return this;
    }
    public Post setId(int id) {
        this.id = id;
        return this;
    }
    public Post setTitle(String title) {

        this.title = title;
        return this;
    }
    public Post setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
