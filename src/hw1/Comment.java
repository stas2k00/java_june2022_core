package hw1;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
    public Comment setPostId (int postId) {
        this.postId = postId;
        return this;
    }
    public Comment setId (int id) {
        this.id = id;
        return this;
    }
    public Comment setName (String name) {
        this.name = name;
        return this;
    }
    public Comment setEmail (String email) {
        this.email = email;
        return this;
    }
    public Comment setBody (String body) {
        this.body = body;
        return this;
    }
}
