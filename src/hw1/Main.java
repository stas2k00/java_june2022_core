package hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Post");
        Post postOne = new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\" +
                        "nnostrum rerum est autem sunt rem eveniet architecto");
        System.out.println(postOne);
        postOne.setUserId(10).setId(11).setTitle("Vasya").setBody("Engineering micro and nanotechnology");
        System.out.println(postOne);

        System.out.println("Comment");
        Comment commentOne = new Comment(1,1,"id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\\" +
                        "ntempora quo necessitatibus\\ndolor quam autem quasi\\" +
                        "nreiciendis et nam sapiente accusantium");
        System.out.println(commentOne);
        commentOne.setId(12).setPostId(22).setName("Stasik").setEmail("stasik@stasiki.com").setBody("It's beautiful");
        System.out.println(commentOne);

    }
}
