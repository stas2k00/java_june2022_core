package hw2.Additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> arrayOfPosts = GetterData.getPosts();
        ArrayList<Comment> arrayOfComments = GetterData.getComments();
        System.out.println(arrayOfPosts);

        for (Comment Comment : arrayOfComments) {
            for (Post Post : arrayOfPosts) {
                if (Comment.getPostId() == Post.getId()) {
                    Post.setComment(Comment);
                }
            }
        }
        System.out.println(arrayOfPosts);
    }
}
