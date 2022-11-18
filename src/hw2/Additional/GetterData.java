package hw2.Additional;

import java.util.ArrayList;

public class GetterData {
    public static ArrayList<Post> getPosts () {
        ArrayList<Post> arrayList = new ArrayList<>();
        arrayList.add(new Post(1,1,"title1","body1",new ArrayList<Comment>()));
        arrayList.add(new Post(1,2,"title2","body2",new ArrayList<Comment>()));
        arrayList.add(new Post(1,3,"title3","body3",new ArrayList<Comment>()));
        arrayList.add(new Post(1,4,"title4","body4",new ArrayList<Comment>()));
        return arrayList;
    }
    public static ArrayList<Comment> getComments(){
        ArrayList<Comment> arrayOfComment = new ArrayList<>();
        arrayOfComment.add(new Comment(1,1,"name1","email1","body1"));
        arrayOfComment.add(new Comment(1,2,"name2","email2","body2"));
        arrayOfComment.add(new Comment(1,3,"name3","email3","body3"));
        arrayOfComment.add(new Comment(1,4,"name3","email4","body4"));
        return arrayOfComment;
    }
}
