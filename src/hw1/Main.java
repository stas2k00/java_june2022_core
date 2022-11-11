package lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> user1Skills = new ArrayList<>();
        user1Skills.add("html");
        user1Skills.add("css");
        User user1 = new User(112,user1Skills);
        System.out.println(user1.toString());
    }
}
